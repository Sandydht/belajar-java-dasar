/*
* Switch Statement
*
* - Kadang kita hanya butuh menggunakan kondisi sederhana di if statement, seperti hanya menggunakan perbandingan ++
* - Switch adalah statement percabangan yang sama dengan if, namun lebih sederhana cara pembuatannya.
* - Kondisi di switch statement hanya untuk perbandingan ==
*/

/*
* Switch Lambda
*
* - Di Java versi 14, diperkenalkan switch expression dengan lambda
* - Ini lebih mempermudah saat penggunaan switch expression karena kita tidak perlu menggunakan kata kunci break
*/

/*
* Kata Kunci Yield
*
* - Di Java 14, ada kata kunci baru yaitu yield, dimana kita menggunakan kata kunci yield untuk mengembalikan nilai pada switch statement.
* - Ini sangat mempermudah kita ketika butuh membuat data berdasarkan kondisi switch statement.
*/

public class SwitchStatement {
  public static void main(String[] args) {
    /*
    * Kode: Switch Statement
    */
    var nilai = "A";

    switch (nilai) {
      case "A":
        System.out.println("Anda lulus dengan baik");
        break;
      case "B":
      case "C":
        System.out.println("Anda lulus");
        break;
      case "D":
        System.out.println("Anda tidak lulus");
        break;
      default:
        System.out.println("Mungkin anda salah jurusan");
        break;
    }

    /*
    * Kode: Switch Lambda
    */
    switch (nilai) {
      case "A" -> System.out.println("Anda lulus dengan baik");
      case "B", "C" -> System.out.println("Anda lulus");
      case "D" -> System.out.println("Anda tidak lulus");
      default -> {
        System.out.println("Mungkin anda salah jurusan");
      }
    }

    /*
    * Kode: Kata Kunci Yield
    */
    String ucapan;
    switch (nilai) {
      case "A" -> ucapan = "Anda lulus dengan baik";
      case "B", "C" -> ucapan = "Anda lulus";
      case "D" -> ucapan = "Anda tidak lulus";
      default -> ucapan = "Mungkin anda salah jurusan";
    }
    System.out.println(ucapan);

    /*
    * Kode: Switch dengan yield
    */
    ucapan = switch (nilai) {
      case "A":
        yield "Anda lulus dengan baik";
      case "B", "C":
        yield "Anda lulus";
      case "D":
        yield "Anda tidak lulus";
      default:
        yield "Mungkin anda salah jurusan";
    };
    System.out.println(ucapan);
  }
}
