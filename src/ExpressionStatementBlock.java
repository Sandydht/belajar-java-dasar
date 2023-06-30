/*
* Expression
*
* - Expression adalah konstruksi dari variabel, operator dan pemanggilan method yang mengevaluasi menjadi sebuah single value.
* - Expression adalah core component dari statement
*/

/*
* Statement
*
* - Statement bisa dibilang adalah kalimat lengkap dalam bahasa.
* - Sebuah statement berisikan execution komplit, biasanya diakhiri dengan titik koma.
* - Ada beberapa jenis statement:
*   - Assignment expression.
*   - Penggunaan ++ dan --
*   - Method invocation
*   - Object creation expression
*/

/*
* Block
*
* - Block adalah kumpulan statement yang terdiri dari nol atau lebih statement.
* - Block diawali dan diakhiri dengan kurung kurawal {}.
*/

public class ExpressionStatementBlock {
  public static void main(String[] args) {
    /*
    * Kode: Expression
    */
    int value; // expression || statement
    value = 10; // expression || statement

    System.out.println(value = 100); // Statement

    /*
    * Kode: Statement
    */
    double aValue = 8933.234; // assignment statement
    aValue++; // increment statement
    System.out.println("Hello world"); // method invocation statement
//    Date date = new Date(); // object creation statement
  }
}
