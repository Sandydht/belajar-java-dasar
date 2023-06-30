/*
* Operasi Boolean
*
* 1. && -> Dan
* 2. || -> Atau
* 3. ! -> Kebalikan
*/

/*
* Operasi &&
*
* 1. true && true = true
* 2. true && false = false
* 3. false && true = false
* 4. false && false = false
*/

/*
* Operasi ||
*
* 1. true || true = true
* 2. true || false = true
* 3. false || true = true
* 4. false || false = false
*/

/*
* Operasi !
*
* 1. !true = false
* 2. !false = true
*/

public class OperasiBoolean {
  public static void main(String[] args) {
    /*
    * Kode: Operasi Boolean
    */
    var absen = 75;
    var nilaiAkhir = 75;

    boolean lulusAbsen = absen >= 75;
    boolean lulusNilaiAkhir = nilaiAkhir >= 75;

    var lulus = lulusAbsen && lulusNilaiAkhir;
    System.out.println(lulus);
  }
}
