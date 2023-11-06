package lotto.controller;

import lotto.domain.Lotto;
import lotto.domain.LottoGame;
import lotto.domain.LottoResultCalculator;
import lotto.utils.LottoInputValidator;
import lotto.view.LottoInputView;
import lotto.view.LottoOutputView;

import java.util.ArrayList;
import java.util.List;

public class LottoController {

    private final Lotto lotto;
    private final LottoGame lottoGame;
    private final LottoInputView lottoInputView;
    private final LottoOutputView lottoOutputView;
    private final LottoResultCalculator calculator;

    private final LottoInputValidator inputValidator;

    public LottoController(Lotto lotto, LottoGame lottoGame,
                           LottoInputView lottoInputView,
                           LottoOutputView lottoOutputView,
                           LottoResultCalculator calculator,
                           LottoInputValidator inputValidator) {
        this.lotto = lotto;
        this.lottoGame = lottoGame;
        this.lottoInputView = lottoInputView;
        this.lottoOutputView = lottoOutputView;
        this.calculator = calculator;
        this.inputValidator = inputValidator;
    }

    public void start(){
        //구입 금액 입력
        String purchasedPrice = lottoInputView.purchasePriceInput();
        lottoOutputView.purchasePricePrint(purchasedPrice);

        //로또 구매 가능 개수 출력
        int purchaseAmount = lotto.purchaseAmountCalculator(purchasedPrice);
        lottoOutputView.purchaseAmountPrint(purchaseAmount);

        //랜덤하게 로또 구매 가능 개수만큼 로또 번호 출력
        lottoOutputView.lottoTicketsPrint(lottoGame);

        // 당첨 번호 입력 & 출력
        String notSplitWinningNumbers = lottoInputView.lottoWinningNumbersInput();
        lottoOutputView.winningNumbersPrint(notSplitWinningNumbers);
        List<String> withSplitLottoNumbers = lotto.getLottoNumbersAsString(notSplitWinningNumbers);

        //유효성 검사 진행된 당첨 번호 리스트
        List<Integer> checkWinningNumbers = inputValidator.checkWinningNumbersValidate(withSplitLottoNumbers);

        //보너스 번호 입력 & 출력
        String bonusNumber = lottoInputView.bonusNumberInput();
        lottoOutputView.bonusNumberPrint(bonusNumber);

        // 보너스 번호 중복 확인 작업
        int checkBonusNumber = inputValidator.checkBonusNumberValidate(bonusNumber, checkWinningNumbers);


        //당첨 통계

        List<Lotto> lottoTickets = lottoGame.getLottoTickets();
//        for (Lotto lottoTicket : lottoTickets) {
//            calculator.lottoWinningCountingCalculate(checkWinningNumbers, lottoTicket., checkBonusNumber)
//        }

    }



}
