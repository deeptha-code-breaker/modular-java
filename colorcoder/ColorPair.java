package colorcoder;

import java.util.StringJoiner;

public class ColorPair {

  private final MajorColor majorColor;
  private final MinorColor minorColor;
  private final int number;

  public ColorPair(MajorColor majorColor, MinorColor minorColor, int number) {
    this.majorColor = majorColor;
    this.minorColor = minorColor;
    this.number = number;
  }

  public MajorColor getMajor() {
    return majorColor;
  }

  public MinorColor getMinor() {
    return minorColor;
  }

  @Override
  public String toString() {
    return new StringJoiner(" ").add(majorColor.toString()).add(minorColor.toString()).add(String.valueOf(number)).toString();

  }
  
}
