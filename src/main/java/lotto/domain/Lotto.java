package lotto.domain;

import lotto.utils.LottoNumbersGenerator;

import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }
    public Lotto(){
        this.numbers = lottoNumbersGenerator();
        validate(numbers);
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    // TODO: 추가 기능 구현
    public List<Integer> lottoNumbersGenerator(){
        return LottoNumbersGenerator.generateLottoNumbers();
    }

    public int purchaseAmountCalculator(String purchasePrice){
        int result = Integer.parseInt(purchasePrice)/1000;
        return result;
    }
    public boolean isMatchedBonusNumber(List<Integer> winningNumbers,
                                        int bonus){
        //보너스 번호가 있으면 true, 없으면 false
        return winningNumbers.contains(bonus);
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


}
