package lotto.domain;

import lotto.domain.strategy.*;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class LottoResultCalculator {

    //TODO: 여기서 사용하고 있는 WinningNumbers를 List<Integer> 타입으로 받아올 수 있게 바꾸는 메서드도 작성해야 됨 ;;

    private Map<WinningStatistics, Integer> totalStatistics;
    private List<WinningStrategy> strategies;

    public void initializeTotalStatistics(){
        if (totalStatistics==null){
            this.totalStatistics = new Hashtable<>();
        }

        for (WinningStatistics winningStatistics : WinningStatistics.values()) {
            this.totalStatistics.put(winningStatistics, 0);
        }

    }

    public LottoResultCalculator() {
        this.totalStatistics = new Hashtable<>();
        this.strategies = new ArrayList<>();
    }

    private void initializeStrategies() {
        strategies.add(new ThreeMatchedWinningStrategy());
        strategies.add(new FourMatchedWinningStrategy());
        strategies.add(new FiveMatchedWinningStrategy());
        strategies.add(new FiveBonusMatchedWinningStrategy());
        strategies.add(new SixMatchedWinningStrategy());
    }



    /**
     * 로또 당첨 개수 확인 계산기
     * */
    public Map<WinningStatistics, Integer> lottoWinningCountingCalculate(List<Integer> winningNumbers,
                                              List<Integer> lottoTicket,
                                              int bonusNumber, Lotto lotto){

        int countMatchedNumbers = lotto.countMatchedNumbers(winningNumbers, lottoTicket);
        int index = countMatchedNumbers - 3;

        //index 3 -> 0 부터 -3
        // countMatched >=3
        if (countMatchedNumbers >=3 && !(countMatchedNumbers==5)){
            strategies.get(index).apply(totalStatistics);
        }
        else if (countMatchedNumbers ==5){
            //보너스 맞춘 경우 2등
            if (lotto.isMatchedBonusNumber(winningNumbers, bonusNumber)){
                index += 1;
                strategies.get(index).apply(totalStatistics);
            }
            strategies.get(index).apply(totalStatistics);
        }

        return totalStatistics;
    }

    public long lottoPrizeRateCalculate(int purchasePrice,
                                        Map<WinningStatistics, Integer> totalStatistics){
        for (Map.Entry<WinningStatistics, Integer> winningStatisticsIntegerEntry : totalStatistics.entrySet()) {
            winningStatisticsIntegerEntry.getKey().
        }

    }


}
