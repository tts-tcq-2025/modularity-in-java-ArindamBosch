package colorcoder;

public class ColorPair {
    private MajorColor majorColor;
    private MinorColor minorColor;

    public static final String[] MajorColorNames = { "White", "Red", "Black", "Yellow", "Violet" };
    public static final String[] MinorColorNames = { "Blue", "Orange", "Green", "Brown", "Slate" };

    public ColorPair(MajorColor major, MinorColor minor) {
        this.majorColor = major;
        this.minorColor = minor;
    }

    public MajorColor getMajor() {
        return majorColor;
    }

    public MinorColor getMinor() {
        return minorColor;
    }

    @Override
    public String toString() {
        return MajorColorNames[majorColor.getIndex()] + " " + MinorColorNames[minorColor.getIndex()];
    }
}
