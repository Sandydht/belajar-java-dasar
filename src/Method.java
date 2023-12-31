/*
* Method
*
* - Method adalah block kode program yang akan berjalan saat kita panggil
* - Sebelumnya kita sudah menggunakan method println() untuk menampilkan tulisan di console
* - Untuk membuat method di Java, kita bisa menggunakan kata kunci void, lalu diikuti dengan nama method, kurung() dan diakhiri dengan block
* - Kita bisa memanggil method dengan menggunakan anama method lalu diikuti dengan kurung()
* - Di bahasa pemrograman lain, method juga disebut dengan function
*/

public class Method {
  public static void main(String[] args) {
    sayHelloWorld();
  }

  static void sayHelloWorld() {
    System.out.println("Hello world");
  }
}
