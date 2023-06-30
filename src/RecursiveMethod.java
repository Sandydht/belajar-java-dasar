/*
* Recursive Method
*
* - Recursive method adalah kemampuan method memanggil method dirinya sendiri
* - Kadang memang ada banyak problem, yang lebih mudah diselesaikan menggunakan recursive method, seperti contohnya kasus factorial
*/

/*
* Problem Dengan Recursive
*
* - Walaupun recursive methos itu sangat menarik, namun kita perlu berhati - hati
* - Jika recursive terlalu dalam, maka akan ada kemungkinan terjadi error StackOverflow, yaitu error dimana stack method terlalu banyak di Java
* - Kenapa problem ini bisa terjadi ? Karena kita memanggil method, Java akan menyimpannya dalam stack, jika method tersebut memanggil method lain, maka stack akan menumpuk terus, dan jika terlalu dalam, maka stack akan terlalu besar, dan bisa menyebabkan error StackOverflow
*/

public class RecursiveMethod {
  public static void main(String[] args) {
    /*
    * Kode: Factorial loop
    */
    System.out.println(factorialLoop(10));

    /*
    * Kode: Factorial Recursive
    */
    System.out.println(factorialRecursive(10));

    /*
    * Kode: Error StackOverflow
    */
    loop(100000);
  }

  static int factorialLoop(int value) {
    var result = 1;
    for (int i = 1; i <= value; i++) {
      result *= i;
    }

    return result;
  }

  static int factorialRecursive(int value) {
    if (value == 1) {
      return 1;
    } else {
      return value * factorialRecursive(value - 1);
    }
  }

  static void loop(int value) {
    if (value == 0) {
      System.out.println("Selesai");
    } else {
      System.out.println("Loop-" + value);
      loop(value - 1);
    }
  }
}
