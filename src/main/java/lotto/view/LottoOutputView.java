package lotto.view;

import lotto.domain.Lotto;
import lotto.domain.LottoGame;

import java.util.List;

public class LottoOutputView {

    private final LottoInputView lottoInputView;

    public LottoOutputView(LottoInputView inputView){
        this.lottoInputView = inputView;
    }

    public void purchasePricePrint(LottoInputView lottoInputView){
        String purchasePrice = lottoInputView.purchasePriceInput();
        System.out.println(purchasePrice+"\n");

    }
    public void purchasePricePrint(String purchasePrice){
        System.out.println(purchasePrice+"\n");

    }
    public void purchaseAmountPrint(int purchaseAmount){
        System.out.printf("%d개를 구매했습니다.\n", purchaseAmount);
    }

    public void lottoTicketsPrint(LottoGame lottoGame){
        List<Lotto> lottoTickets = lottoGame.getLottoTickets();
        for (Lotto lottoTicket : lottoTickets) {
            System.out.println(lottoTicket.toString());
        }
    }

    public void winningNumbersPrint(LottoInputView lottoInputView){
        String winningNumbers = lottoInputView.lottoWinningNumbersInput();
        System.out.println(winningNumbers);
    }

    public void winningNumbersPrint(String winningNumbers){
        System.out.println(winningNumbers+"\n");
    }


    public void bonusNumberPrint(String bonusNumber){
        System.out.println(bonusNumber);
    }

    public void bonusNumberPrint(LottoInputView lottoInputView){
        String bonusNumber = lottoInputView.bonusNumberInput();
        System.out.println(bonusNumber);

    }



}
