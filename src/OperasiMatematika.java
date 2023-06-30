/*
* Operasi Matematika
*
* 1. + -> Penjumlahan
* 2. - -> Pengurangan
* 3. * -> Perkalian
* 4. / -> Pembagian
* 5. % -> Sisa pembagian
*/

/*
* Augmented Assignments
*
* 1. a = a + 10 -> a += 10
* 2. a = a - 10 -> a -= 10
* 3. a = a * 10 -> a *= 10
* 4. a = a / 10 -> a /= 10
* 5. a = a % 10 -> a %= 10
*/

/*
* Unary Operator
*
* 1. ++ -> a = a + 1
* 2. -- -> a = a - 1
* 3. - -> Negative
* 4. + -> Positive
* 5. ! -> Boolean kebalikan
*/

public class OperasiMatematika {
  public static void main(String[] args) {
    /*
    * Kode: Operasi Matematika
    */
    int a = 100;
    int b = 10;

    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);
    System.out.println(a % b);

    /*
    * Kode: Augmented Assignments
    */
    int c = 100;
    System.out.println(c += 10);
    System.out.println(c -= 10);
    System.out.println(c *= 10);
    System.out.println(c /= 10);
    System.out.println(c %= 10);

    /*
    * Kode: Unary Operator
    */
    int d = +100;
    int e = -10;

    d++;
    System.out.println(d);

    e++;
    System.out.println(e);
  }
}
