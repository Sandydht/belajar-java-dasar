/*
* Konversi Tipe Data Number
*
* 1. Widening Casting (otomatis): byte -> short -> int -> long -> float -> double
* 2. Narrowing Casting (manual): double -> float -> long -> int -> char -> short -> byte
*/

public class KonversiNumber {
  public static void main(String[] args) {
    /*
   * Kode: Konversi Tipe Data Number
   */
    byte fromByte = 10;
    short fromShort = fromByte;
    int fromInt = fromShort;
    long fromLong = fromInt;
    float fromFloat = fromLong;
    double fromDouble = fromFloat;

    float fromFloat2 = (float) fromDouble;
    long fromLong2 = (long) fromFloat2;
    int fromInt2 = (int) fromLong2;
    short fromShort2 = (short) fromInt2;
  }
}
