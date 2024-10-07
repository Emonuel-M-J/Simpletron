public class Base {
  private static final int HEX_BASE = 16;
  private static final int DEC_BASE = 10;

  public static int hexaToDecimal(String hexadecimal) 
    throws NumberFormatException {
    return Integer.parseInt(hexadecimal, HEX_BASE);
  }

  public static int decimal(String decimal) 
    throws NumberFormatException {
    return Integer.parseInt(decimal, DEC_BASE);
  }
}
