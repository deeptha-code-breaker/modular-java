package colorcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class ColorPairUtility {

  final static int NUMBER_OF_MINOR_COLORS = MinorColor.values().length;

  public static ColorPair getColorFromPairNumber(int pairNumber) {
    int zeroBasedPairNumber = pairNumber - 1;
    MajorColor majorColor =
            MajorColor.fromIndex(zeroBasedPairNumber / NUMBER_OF_MINOR_COLORS);
    MinorColor minorColor =
            MinorColor.fromIndex(zeroBasedPairNumber % NUMBER_OF_MINOR_COLORS);
    return new ColorPair(majorColor, minorColor, pairNumber);
  }

  public static int getPairNumberFromColor(MajorColor major, MinorColor minor) {
    return major.getIndex() * NUMBER_OF_MINOR_COLORS + minor.getIndex() + 1;
  }

  public static List<ColorPair> printManual() {
    List<ColorPair> colorPairs = new ArrayList();

    StringJoiner manual = new StringJoiner("\r\n");
    for (MajorColor majorColor : MajorColor.values()) {
      for (MinorColor minorColor : MinorColor.values()) {
        colorPairs.add(new ColorPair(majorColor, minorColor, getPairNumberFromColor(majorColor, minorColor)));
      }
    }
    return colorPairs;
  }

  public static Color fromIndex(int index, Color[] colors) {
    for (Color color : colors) {
      if (color.getIndex() == index) {
        return color;
      }
    }
    return null;
  }
}
