package lotto.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LottoInputValidator {

    public String[] lottoNumbersSplit(String numbers){
        return numbers.split(",");
    }


    public boolean isNumericValidation(String number){
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
    public boolean isNumberRangeValidation(String stringNumber){
        int number = Integer.parseInt(stringNumber);
        return number >= 1 && number < 46;
    }

    public boolean isDuplicationNumber(List<Integer> lottoTicket,
                                       int bonusNumber){
        List<Integer> withDuplicates = getWithDuplicates(lottoTicket, bonusNumber);
        List<Integer> withoutDuplicates = getWithoutDuplicates(withDuplicates);

        if (withoutDuplicates.size()<7){
            return false;
        }
        return true;
    }



    private static List<Integer> getWithoutDuplicates(List<Integer> withDuplicates) {
        return withDuplicates.stream().distinct().collect(Collectors.toList());
    }

    private static List<Integer> getWithDuplicates(List<Integer> lottoTicket,
                                                   int bonusNumber) {
        // 해당 로또 [1,2,3,4,5,6] 보너스 7을 예시로 중복 값이 있나 확인하는 작업 진행
        List<Integer> withDuplicates = lottoTicket;
        withDuplicates.add(bonusNumber);
        return withDuplicates;
    }

}
