package se.lexicon.model;

public enum Denominations {

    _1KR(1), _2KR(2), _5KR(5),
    _10KR(10), _20KR(20), _50KR(50),
    _100KR(100), _200KR(200), _500KR(500),
    _1000KR(1000);

private int denominationCurrency;

    Denominations(int getDenominations) {
        this.denominationCurrency = getDenominations;
    }

    public int getGetDenominations() {
        return denominationCurrency;
    }

    public void setGetDenominations(int getDenominations) {
        this.denominationCurrency = getDenominations;
    }

}
