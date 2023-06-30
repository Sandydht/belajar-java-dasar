/*
* Switch Statement
*
* - Kadang kita hanya butuh menggunakan kondisi sederhana di if statement, seperti hanya menggunakan perbandingan ++
* - Switch adalah statement percabangan yang sama dengan if, namun lebih sederhana cara pembuatannya.
* - Kondisi di switch statement hanya untuk perbandingan ==
*/

public class SwitchStatement {
  public static void main(String[] args) {
    /*
    * Kode: Switch Statement
    */
    var nilai = "B";

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
  }
}
