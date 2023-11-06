package lotto.view;

public enum LottoMessage {
    PURCHASE_PRICE_INPUT_MESSAGE("구입금액을 입력해 주세요."),
    WINNING_NUMBER_INPUT_MESSAGE("당첨 번호를 입력해 주세요."),
    BONUS_NUMBER_INPUT_MESSAGE("보너스 번호를 입력해 주세요.");

    private String message;

    LottoMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
