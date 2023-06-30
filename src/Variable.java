/*
* Variable
*
* - Variable adalah tempat untuk menyimpan data.
* - Java adalah bahasa static type, sehingga sebuah variable hanya bisa digunakan untuk menyimpan tipe data yang sama, tidak bisa berubah - ubah tipe data seperti di bahasa pemrograman PHP atau JavaScript.
* - Untuk membuat variable di Java kita bisa menggunakan nama tipe data lalu diikuti dengan nama variablenya.
* - Nama variable tidak boleh mengandung whitespace (spasi, enter, tab), dan tidak boleh seluruhnya number.
*/

/*
* Kata Kunci Var
*
* - Sejak versi Java 10. Java mendukung pembuatan variable dengan kata kunci var, sehingga kita tidak perlu menyebutkan tipe datanya.
* - Namun perlu diingat, saat kita menggunakan kata kunci var untuk membuat variable, kita harus menginisiasi value / nilai dari variable tersebut secara langsung.
*/

/*
* Kata Kunci Final
*
* - Secara default, variable di Java bisa diubah - ubah nilainya.
* - Jika kita ingin membuat sebuah variable yang datanya tidak boleh diubah setelah pertama kali dibuat, kita bisa menggunakan kata kunci final.
* - Istilah variable seperti ini, banyak juga yang menyebutnya konstan.
*/

public class Variable {
  public static void main(String[] args) {
    /*
    * Kode: variable
    */
    String name;
    name = "Sandy Dwi Handoko Trapsilo";

    int age = 30;
    String address = "Indonesia";

    System.out.println(name);
    System.out.println(age);
    System.out.println(address);

    /*
    * Kode: Kata Kunci var
    */
//    var company; // error
//    company = "Company name";

    var age2 = 30;
    var address2 = "Indonesia";

//    System.out.println(company);
    System.out.println(age2);
    System.out.println(address2);

    /*
    * Kode: Kata kunci final
    */
    final String constan = "test";

    System.out.println(constan);
  }
}
