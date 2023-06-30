/*
* Tipe Data String
*
* - Tipe data String adalah tipe data yang berisikan data kumpulan karakter atau sederhanannya adalah teks
* - Di Java, tipe data String direpresentasikan dengan kata kunci String.
* - Untuk membuat String di Java, kita menggunakan karakter "(petik dua) sebelum dan setelah teks nya
* - Default value untuk String adalah null
*/

public class TipeDataString {
  public static void main(String[] args) {
    /*
    * Kode: String
    */
    String s = "S";
    String a = "A";
    String n = "N";
    String d = "D";
    String y = "Y";

    String firstName = "Sandy Dwi";
    String lastName = "Handoko Trapsilo";

    System.out.println(s);
    System.out.println(a);
    System.out.println(n);
    System.out.println(d);
    System.out.println(y);

    System.out.println(firstName);
    System.out.println(lastName);

    /*
    * Kode: Menggabungkan String
    */
    String fullname = firstName + " " + lastName;
    System.out.println(fullname);
  }
}
