/*
 * Integer Number
 *
 * 1. byte
 *    - min: -128
 *    - max: 127
 *    - size: 1 byte
 *    - default: 0
 * 2. short
 *    - min: -32,768
 *    - max: 32,767
 *    - size: 2 bytes
 *    - default: 0
 * 3. int
 *    - min: -2,147,483,648
 *    - max: 2,147,483,647
 *    - size: 4 bytes
 *    - default: 0
 * 4. long
 *    - min: -9,223,372,036,854,775,808
 *    - max: 9,223,372,036,854,775,807
 *    - size: 8 bytes
 *    - default: 0
 */

/*
 * Floating Point Number
 *
 * 1. float
 *    - min: 3.4e-038
 *    - max: 3.4e+038
 *    - size: 4 bytes
 *    - default: 0.0
 * 2. double
 *    - min: 1.7e-308
 *    - max: 1.7e+308
 *    - size: 8 bytes
 *    - default: 0
 */

public class TipeDataNumber {
  public static void main(String[] args) {
    /*
    * Kode: Integer Number
    */
    byte iniByte = 100;
    short iniShort = 1000;
    int iniInt = 1000000;
    long iniLong = 1000000;
    long iniLong2 = 1000000L;

    System.out.println("Kode: Integer Number");
    System.out.println("iniByte" + iniByte);
    System.out.println("iniShort" + iniShort);
    System.out.println("iniInt" + iniInt);
    System.out.println("iniLong" + iniLong);
    System.out.println("iniLong2" + iniLong2);

    /*
    * Kode: Floating Point Number
    */
    float iniFloat = 10.12F;
    double iniDouble = 12.2424;

    System.out.println("iniFloat = " + iniFloat);
    System.out.println("iniDouble = " + iniDouble);

    /*
    * Kode: Literals
    */
    int decimalInt = 25;
    int hexInt = 0xA132B;
    int binInt = 0b01010101;

    System.out.println("decimalInt" + decimalInt);
    System.out.println("hexInt" + hexInt);
    System.out.println("binInt" + binInt);

    /*
    * Kode: Underscore
    */
    long balance = 1_000_000_000_000L;
    int sum = 60_000_000;

    System.out.println("balance = " + balance);
    System.out.println("sum = " + sum);
  }
}
