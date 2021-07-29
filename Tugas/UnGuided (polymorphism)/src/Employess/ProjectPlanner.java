/** *
 * Nama : RezairfanWijaya
 * NIM  : 19102149
 * Class: IF07P
 */
package Employess;

public class ProjectPlanner extends SalariedEmployee {
    // atribut

    int gajiPokok, komisi, tothaspo;
    double pajak;

    // konstruktor
    ProjectPlanner(int gajiPokok, int komisi, int tothaspo) {
        super("Willams", "079williams", 0);
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
        this.tothaspo = tothaspo;
        pajak = 0.05 * gajiPokok;

    }

    // method hitung gaji
    public int HitungGaji() {
        int gaji = (int) (gajiPokok + (komisi * tothaspo) - pajak);
        return gaji;
    }

    // method tampil info
    public void TampilInfo() {
        System.out.println("Nama                : " + nama);
        System.out.println("NIP                 : " + nip);
        System.out.println("Gaji Pokok          : " + gajiPokok);
        System.out.println("Komisi              : " + komisi);
        System.out.println("Total Hasil Proyek  : " + tothaspo);
        System.out.println("Gaji Final          : " + HitungGaji());
        System.out.println("");
    }
}
