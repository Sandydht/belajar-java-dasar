/*
* Method Variable Argument
*
* - Kadang kita butuh mengirim data ke method sejumlah data yang tidak pasti
* - Biasanya, agar bisa seperti ini, kita akan menggunakan array sebagai parameter di method tersebut
* - Namun di Java, kita bisa menggunakan variable argument, untuk mengirim data yang berisi jumlah tak tentu, bisa nol atau lebih
* - Parameter dengan tipe variable argument, hanya bisa ditempatkan di posisi akhir parameter
*/

public class MethodVariableArgument {
  public static void main(String[] args) {
    var name = "Sandy Dwi Handoko Trapsilo";
    int[] nilai = { 80, 90, 70 };

    /*
    * Kode: Tanpa Variable Argument
    */
    sayCongrats(name, nilai);

    /*
    * Kode: Variable Argument
    */
    sayCongratsWithVariableArgument(name, nilai);
  }

  static void sayCongrats(String name, int[] values) {
    int total = 0;
    for (var value : values) {
      total += value;
    }

    int finalValue = total / values.length;

    if (finalValue >= 75) {
      System.out.println("Selamat " + name + ", Anda lulus");
    } else {
      System.out.println("Maaf " + name + ", Anda tidak lulus");
    }
  }

  static void sayCongratsWithVariableArgument(String name, int... values) {
    int total = 0;
    for (var value : values) {
      total += value;
    }

    int finalValue = total / values.length;

    if (finalValue >= 75) {
      System.out.println("Selamat " + name + ", Anda lulus");
    } else {
      System.out.println("Maaf " + name + ", Anda tidak lulus");
    }
  }
}
