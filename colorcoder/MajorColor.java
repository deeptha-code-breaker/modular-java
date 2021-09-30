package colorcoder;

public enum MajorColor implements Color {
  WHITE(0, "White"),
  RED(1, "Red"),
  BLACK(2, "Black"),
  YELLOW(3, "Yellow"),
  VIOLET(4, "Violet");

  private final int index;
  private final String value;

  MajorColor(int index, String value) {
    this.index = index;
    this.value = value;
  }

  public static MajorColor fromIndex(int index) {
    return (MajorColor) ColorPairUtility.fromIndex(index, MajorColor.values());
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
