package colorcoder;

public class ColorCoder {
    public static final int numberOfMajorColors = ColorPair.MajorColorNames.length;
    public static final int numberOfMinorColors = ColorPair.MinorColorNames.length;

    public static ColorPair getColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor majorColor = MajorColor.fromIndex(zeroBasedPairNumber / numberOfMinorColors);
        MinorColor minorColor = MinorColor.fromIndex(zeroBasedPairNumber % numberOfMinorColors);
        return new ColorPair(majorColor, minorColor);
    }

    public static int getPairNumberFromColor(MajorColor major, MinorColor minor) {
        return major.getIndex() * numberOfMinorColors + minor.getIndex() + 1;
    }
}
