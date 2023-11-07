package lotto;

import lotto.controller.LottoController;
import lotto.domain.Lotto;
import lotto.domain.LottoGame;
import lotto.domain.LottoResultCalculator;
import lotto.utils.LottoInputValidator;
import lotto.view.LottoInputView;
import lotto.view.LottoOutputView;

public class Application {
    public static void main(String[] args) {

        // TODO: 프로그램 구현

        Lotto lotto = new Lotto();
        LottoInputView lottoInputView = LottoInputView.getInstance();
        LottoOutputView lottoOutputView = new LottoOutputView();
        LottoResultCalculator lottoResultCalculator = new LottoResultCalculator();
        LottoInputValidator lottoInputValidator = new LottoInputValidator();

        LottoController lottoController = new LottoController(lotto,lottoInputView ,lottoOutputView,
               lottoResultCalculator,lottoInputValidator);

        lottoController.start();

    }
}
