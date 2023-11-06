package lotto.view;

import lotto.domain.Lotto;
import lotto.domain.LottoGame;
import lotto.domain.WinningStatistics;

import java.util.List;
import java.util.Map;

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
        System.out.printf(LottoMessage.PURCAHSE_AMOUNT_OUTPUT_MESSAGE.getMessage(), purchaseAmount);
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

    public void lottoWinningPrizeResultPrint(Map<WinningStatistics, Integer> totalStatistics){

        System.out.printf(LottoMessage.WINNING_PRIZE_RESULT_OUTPUT_MESSAGE.getMessage(),totalStatistics.get(WinningStatistics.THREE_MATCH),
                totalStatistics.get(WinningStatistics.FOUR_MATCH),totalStatistics.get(WinningStatistics.FIVE_MATCH)
                ,totalStatistics.get(WinningStatistics.FIVE_BONUS_MATCH),totalStatistics.get(WinningStatistics.SIX_MATCH));
    }

    public void lottoWinningPrizeRatePrint(long winningPrizeRate){
        System.out.printf(LottoMessage.TOTAL_RETURN_RATE_OUTPUT_MESSAGE.getMessage(), winningPrizeRate);
    }



}
