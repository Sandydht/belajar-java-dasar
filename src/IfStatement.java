/*
* If Statement
*
* - Dalam Java, if adalah salah satu kata kunci yang digunakan untuk percabangan
* - Percabangan artinya kita bisa mengeksekusi kode program tertentu ketika suatu kondisi terpenuhi
* - Hampir di semua bahasa pemrograman mendukung if expression
*/

public class IfStatement {
  public static void main(String[] args) {
    var nilai = 70;
    var absen = 90;

    if (nilai >= 75 && absen >= 75) {
      System.out.println("Anda lulus");
    } else {
      System.out.println("Anda tidak lulus");
    }
  }
}
