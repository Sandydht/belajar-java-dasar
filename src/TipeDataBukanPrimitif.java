/*
* Tipe Data Bukan Primitif
*
* - Tipe data primitif adalah tipe bawaan di dalam bahasa pemrograman. Tipe data primitf tidak bisa diubah lagi.
* - Tipe data number, char, boolean adalah tipe data primitif. Tipe data primitif selalu memiliki default value.
* - Tipe data String bukan tipe data primitif, tipe data bukan primitif tidak bisa memiliki default value, dan bisa bernilai null.
* - Tipe data bukan primitif bisa memiliki method / function (yang akan dibahas nanti).
* - Di Java, semua tipe data primitif memiliki representasi tipe data bukan primitifnya.
*/

/*
* Representasi Tipe Data Primitif
*
* 1. byte (primitif) -> Byte (bukan primitif)
* 2. short (primitif) -> Short (bukan primitif)
* 3. int (primitif) -> Integer (bukan primitif)
* 4. long (primitif) -> Long (bukan primitif)
* 5. float (primitif) -> Float (bukan primitif)
* 6. double (primitif) -> Double (bukan primitif)
* 7. char (primitif) -> Character (bukan primitif)
* 8. boolean (primitif) -> Boolean (bukan primitif)
*/

public class TipeDataBukanPrimitif {
  public static void main(String[] args) {
    /*
    * Kode: Tipe Data Bukan Primitif
    */
    Integer iniInteger = 100;
    Long iniLong = 10L;
    Boolean iniBoolean = true;

    Short iniShort; // null
    iniShort = 100;

    System.out.println("iniInteger = " + iniInteger);
    System.out.println("iniLong = " + iniLong);
    System.out.println("iniBoolean = " + iniBoolean);
    System.out.println("iniShort = " + iniShort);

    /*
    * Kode: Konversi Dari Tipe Data Primitif
    */
    int age = 30;

    Integer ageObject = age;

    int ageAgain = ageObject;

    short shortAge = ageObject.shortValue();
    byte byteAge = ageObject.byteValue();

    System.out.println("ageAgain = " + ageAgain);
    System.out.println("shortAge = " + shortAge);
    System.out.println("byteAge = " + byteAge);
  }
}
