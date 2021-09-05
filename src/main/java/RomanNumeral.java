public enum RomanNumeral {
    I(1, 1, 3, null),
    V(5, 4, 8, I),
    X(10, 9, 39, I),
    L(50, 40, 89, X),
    C(100, 90, 399, X),
    D(500, 400, 899, C),
    M(1000, 900, 3999, C);


    private final int decimalValue;
    private final int rangeMin;
    private final int rangeMax;
    private final RomanNumeral predecessor;

    private RomanNumeral(int decimalValue, int rangeMin, int rangeMax, RomanNumeral predecessor) {
        this.decimalValue = decimalValue;
        this.rangeMin = rangeMin;
        this.rangeMax = rangeMax;
        this.predecessor = predecessor;
    }

    public int getDecimalValue() {
        return decimalValue;
    }

    public int getRangeMin() {
        return rangeMin;
    }

    public int getRangeMax() {
        return rangeMax;
    }

    public RomanNumeral getPredecessor() {
        return predecessor;
    }
}
