/*
* Ternary Operator
*
* - Ternary operator adalah operator sederhana dari if statement
* - Ternary operator terdiri dari kondisi yang dievaluasi, jika menghasilkan true makan nilai pertama diambil, jika false, maka nilai kedua diambil
*/

public class TernaryOperator {
  public static void main(String[] args) {
    var nilai = 75;
    String ucapan;

    ucapan = nilai >= 75 ? "Anda lulus" : "Anda tidak lulus";
    System.out.println(ucapan);
  }
}
