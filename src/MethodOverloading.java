/*
* Method Overloading
*
* - Method overloading adalah kemampuan membuat method dengan nama yang sama lebih dari sekali
* - Namun ada ketentuannya, yaitu data parameter di method tersebut harus berbeda - beda, entah jumlah atau tipe data parameternya
* - Jika ada yang sama, maka program Java kita akan error
*/

public class MethodOverloading {
  public static void main(String[] args) {
    sayHello();
    sayHello("Sandy");
    sayHello("Sandy", "Dwi");
  }

  static void sayHello() {
    System.out.println("Hello");
  }

  static void sayHello(String firstName) {
    System.out.println("Hello " + firstName);
  }

  static void sayHello(String firstName, String lastName) {
    System.out.println("Hello " + firstName + " " + lastName);
  }
}
