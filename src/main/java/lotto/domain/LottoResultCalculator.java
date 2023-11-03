package lotto.domain;

import lotto.domain.strategy.*;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class LottoResultCalculator {

    private Map<WinningStatistics, Integer> totalStatistics;
    private List<WinningStrategy> strategies = new ArrayList<>();

    public void initializeTotalStatistics(){
        if (totalStatistics==null){
            this.totalStatistics = new Hashtable<>();
        }

        for (WinningStatistics winningStatistics : WinningStatistics.values()) {
            this.totalStatistics.put(winningStatistics, 0);
        }

    }

    private void initializeStrategies() {
        strategies.add(new ThreeMatchedWinningStrategy());
        strategies.add(new FourMatchedWinningStrategy());
        strategies.add(new FiveMatchedWinningStrategy());
        strategies.add(new FiveBonusMatchedWinningStrategy());
        strategies.add(new SixMatchedWinningStrategy());
    }

    /**
     * 보너스 번호 제외, 몇개가 당첨 번호와 맞는지 확인
     * */
    public int countMatchedNumbers(List<Integer> winningNumbers,
                                   List<Integer> lottoTicket){
        int matchedCount = 0;
        for (Integer winningNumber : winningNumbers) {
            if (lottoTicket.contains(winningNumber)){
                matchedCount++;
            }
        }

        return matchedCount;
    }

    public boolean isMatchedBonusNumber(List<Integer> winningNumbers,
                                        int bonus){
        //보너스 번호가 있으면 true, 없으면 false
        return winningNumbers.contains(bonus);
    }

    public long getRateOfReturn(int purchasePrice,
                                Map<WinningStatistics, Integer> totalStatistics){
        for (Map.Entry<WinningStatistics, Integer> winningStatisticsIntegerEntry : totalStatistics.entrySet()) {
            winningStatisticsIntegerEntry.getKey().
        }

    }
    public Map<WinningStatistics, Integer> dd(List<Integer> winningNumbers,
                                              List<Integer> lottoTicket,
                                              int bonusNumber){

        int countMatchedNumbers = countMatchedNumbers(winningNumbers, lottoTicket);



        return totalStatistics;

    }
}
