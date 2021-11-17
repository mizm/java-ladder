package nextstep.step2.vo;

public class Width {
    private static final int ONE_TO_MINUS_END_LINE = 1;
    private static final int MIN_WIDTH = 2;
    private static final String NULL_OR_LESS_HEIGHT_MESSAGE = "넓이 값은 2 이상 이어야 합니다.";

    private final int value;

    private Width(int value) {
        this.value = value;
    }

    public static Width create(int value) {
        if(value < MIN_WIDTH) {
            throw new IllegalArgumentException(NULL_OR_LESS_HEIGHT_MESSAGE);
        }

        return new Width(value);
    }

    public int getEndLine() {
        return this.value - ONE_TO_MINUS_END_LINE;
    }
}
