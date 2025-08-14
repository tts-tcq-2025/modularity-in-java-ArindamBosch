package colorcoder;

public class ColorPair {
    private final MajorColor majorColor;
    private final MinorColor minorColor;

    public ColorPair(MajorColor majorColor, MinorColor minorColor) {
        this.majorColor = majorColor;
        this.minorColor = minorColor;
    }

    public MajorColor getMajorColor() {
        return majorColor;
    }

    public MinorColor getMinorColor() {
        return minorColor;
    }

    @Override
    public String toString() {
        return majorColor + " - " + minorColor;
    }
}
