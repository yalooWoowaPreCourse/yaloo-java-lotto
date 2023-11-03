package lotto.domain;

public enum WinningStatistics {

    THREE_MATCH(3, 5_000),
    FOUR_MATCH(4,50_000),
    FIVE_MATCH(5, 1_500_000),
    FIVE_BONUS_MATCH(5, 30_000_000),
    SIX_MATCH(6, 2_000_000_000);

    private int matchCount;
    private int winningPrize;

    WinningStatistics(int matchCount, int winningPrize) {
        this.matchCount = matchCount;
        this.winningPrize = winningPrize;
    }

    public int getMatchCount() {
        return matchCount;
    }

    public int getWinningPrize() {
        return winningPrize;
    }




}
