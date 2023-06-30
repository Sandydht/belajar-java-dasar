/*
* Break & Continue
*
* - Pada switch statement, kita sudah mengenal kata kunci break, yaitu untuk menghentikan case dalam switch
* - Sama dengan pada perulangan, break juga digunakan untuk menghentikan seluruh perulangan
* - Namun berbeda dengan continue, continue digunakan untuk mengentikan perulangan saat ini, lalu melanjutkan ke perulangan selanjutnya
*/

public class BreakAndContinue {
  public static void main(String[] args) {
    /*
    * Kode: Break
    */
    System.out.println("Kode Break");
    var counter = 1;
    while (true) {
      System.out.println("Perulangan ke-" + counter);
      counter++;

      if (counter > 10) {
        break;
      }
    }

    /*
    * Kode: Continue
    */
    System.out.println("Kode Continue");
    for (int counter2 = 1; counter2 <= 100; counter2++) {
      if (counter % 2 == 0) {
        continue;
      }

      System.out.println("Perulangan ganjil-" + counter2);
    }
  }
}
