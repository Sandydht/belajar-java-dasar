/*
* For Each Loop
*
* - Kadang kita biasa mengakses data array menggunakan perulangan
* - Mengakses data array menggunakan array sangat bertele - tele, kita harus membuat counter, lalu mengakses array menggunakan counter yang kita buat
* - Namun untungnya, di Java terdapat perulangan for each, yang bisa digunakan untuk mengakses seluruh data array secara otomatis
*/

public class ForEachLoop {
  public static void main(String[] args) {
    /*
    * Kode: Tanpa For Each
    */
    String[] array = {
        "Sandy", "Dwi", "Handoko", "Trapsilo",
        "Fullstack", "Software", "Engineer"
    };

    System.out.println("Tanpa for each");
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }

    /*
    * Kode: For Each
    */
    System.out.println("For each");
    for (var value : array) {
      System.out.println(value);
    }
  }
}
