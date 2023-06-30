/*
* Tipe Data Array
*
* - Array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama
* - Jumlah data di Array tidak bisa berubah setelah pertama kali dibuat
*/

/*
* Operasi di Array
*
* 1. array[index] => mengambil data di array
* 2. array[index] = value => mengubah data di array
* 3. array.length => mengambil panjang array
*/

public class TipeDataArray {
  public static void main(String[] args) {
    /*
    * Kode: Membuat Array
    */
    String[] arrayString;
    arrayString = new String[3];
    arrayString[0] = "Sandy";
    arrayString[1] = "Dwi";
    arrayString[2] = "Handoko";

    int i;
    for (i = 0; i < arrayString.length; i++) {
      System.out.println(i + " = " + arrayString[i]);
    }

    /*
    * Kode: Array Initializer
    */
    int[] arrayInt = new int[]{
        10, 90, 80, 67, 29
    };

    long[] arrayLong = {
        10, 90, 80, 67, 29
    };

    String[] arrayString2 = {
        "Sandy", "Dwi", "Handoko", "Trapsilo"
    };

    int j;
    for (j = 0; j < arrayInt.length; j++) {
      System.out.println(j + " = " + arrayInt[i]);
    }

    int k;
    for (k = 0; k < arrayLong.length; k++) {
      System.out.println(k + " = " + arrayLong[k]);
    }

    int l;
    for (l = 0; l < arrayString2.length; l++) {
      System.out.println(l + " = " + arrayString2[l]);
    }

    /*
    * Kode: Array di dalam Array
    */
    String[][] members = {
        {"Sandy", "Dwi", "Handoko"},
        {"Budi", "Nugraha"},
        {"Donny", "Pratama"}
    };

    String[] member1 = members[0];
    System.out.println(member1[0]);

    System.out.println(members[1][0]);
    System.out.println(members[1][0]);
    System.out.println(members[0][0]);
  }
}
