/** *
 * Nama : RezairfanWijaya
 * NIM  : 19102149
 * Class: IF07P
 */
package Employess;

public class CommissionEmployee extends SalariedEmployee {

    // atrribut
    int gajiPokok;
    int komisi;
    int totalJual;

    // konstruktor
    CommissionEmployee(int gajiPokok, int komisi, int totalJual) {
        super("Richard", "567Richard", 0);
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
        this.totalJual = totalJual;
    }

    // method hitung gaji
    public int HitungGaji() {
        int gaji = gajiPokok + (komisi * totalJual);
        return gaji;
    }

    // method tampil info
    public void TampilInfo() {
        System.out.println("Nama                : " + nama);
        System.out.println("NIP                 : " + nip);
        System.out.println("Gaji Pokok          : " + gajiPokok);
        System.out.println("Komisi              : " + komisi);
        System.out.println("Total Penjualan     : " + totalJual);
        System.out.println("Gaji Final          : " + HitungGaji());
        System.out.println("");
    }

}
