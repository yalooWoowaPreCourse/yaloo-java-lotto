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
}
