/*
* For Loop
* - For adalah salah satu kata kunci yang bisa digunakan untuk melakukan perulangan
* - Blok kode yang terdapat di dalam for akan selalu diulangi selama kondisi for terpenuhi
*/

/*
* Sintak Perulangan For
*
* for (init statement; kondisi; post statement) {
*   // Block perulangan
* }
*
* - Init statement akan dieksekusi hanya sekali di awal sebelum perulangan
* - Kondisi akan dilakukan pengecekan dalam setiap perulangan, jika true perulangan akan dilakukan, jika false perulangan akan berhenti
* - Post statement akan dieksekusi setiap kali diakhir perulangan
* - Init statement, Kondisi dan Post statement tidak wajib diisi, jika kondisi tidak diisi, berarti kondisi selalu bernilai true
*/

public class ForLoop {
  public static void main(String[] args) {
    /*
    * Kode: Perulangan for
    */
    for (var i = 1; i <= 10; i++) {
      System.out.println(i);
    }
  }
}
