package lotto.view;

import camp.nextstep.edu.missionutils.Console;

public class LottoInputView {
    private static final LottoInputView instance = new LottoInputView();

    private LottoInputView(){
    }

    public static LottoInputView getInstance(){
        return instance;
    }

    public String purchasePriceInput(){
        System.out.println("구입금액을 입력해 주세요.");
        String purchasePrice = Console.readLine();
        return purchasePrice;
    }

    public String lottoWinningNumbersInput(){
        System.out.println("당첨 번호를 입력해 주세요.");
        String winningNumbers = Console.readLine();

        return winningNumbers;
    }

    public String bonusNumberInput(){
        System.out.println("보너스 번호를 입력해 주세요.");
        String bonusNumber = Console.readLine();
        return bonusNumber;
    }

}
