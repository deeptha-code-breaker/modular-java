package colorcoder;

public enum MinorColor implements Color {
  BLUE(0, "Blue"),
  ORANGE(1, "Orange"),
  GREEN(2, "Green"),
  BROWN(3, "Brown"),
  SLATE(4, "Slate");

  private final int index;
  private final String value;

  MinorColor(int index, String value) {
    this.index = index;
    this.value = value;
  }

  public static MinorColor fromIndex(int index) {
    return (MinorColor) ColorPairUtility.fromIndex(index, MinorColor.values());
  }

  @Override
  public int getIndex() {
    return index;
  }

  @Override
  public String toString() {
    return value;
  }

}