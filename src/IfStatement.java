/*
* If Statement
*
* - Dalam Java, if adalah salah satu kata kunci yang digunakan untuk percabangan
* - Percabangan artinya kita bisa mengeksekusi kode program tertentu ketika suatu kondisi terpenuhi
* - Hampir di semua bahasa pemrograman mendukung if expression
*/

/*
* Else Statement
* 
* - Block if akan dieksekusi ketika kondisi if bernilai true
* - Kadang kita ingin melakukan eksekusi program tertentu jika kondisi if bernilai true
* - Hal ini bisa dilakukan menggunakan else expression
*/

/*
* Else if statement
*
* - Kode dalam if, kita butuh membuat beberapa kondisi
* - Kasus seperti ini, di Java kita bisa menggunakan else if expression
* - Else if di Java lebih dari satu
*/

public class IfStatement {
  public static void main(String[] args) {
    var nilai = 70;
    var absen = 70;

    if (nilai >= 80 && absen >= 80) {
      System.out.println("Nilai anda A");
    } else if (nilai >= 70 && absen >= 70) {
      System.out.println("Nilai anda B");
    } else if (nilai >= 60 && absen >= 60) {
      System.out.println("Nilai anda C");
    } else if (nilai >= 50 && absen >= 50) {
      System.out.println("Nilai anda D");
    } else {
      System.out.println("Nilai anda E");
    }
  }
}
