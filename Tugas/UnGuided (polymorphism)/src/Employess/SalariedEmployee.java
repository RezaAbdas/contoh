/** *
 * Nama : RezairfanWijaya
 * NIM  : 19102149
 * Class: IF07P
 */

package Employess;

public class SalariedEmployee{
    
  // atribut
    String nama;
    String nip;
    int upahMingguan;

    // konstuktor
    SalariedEmployee(String nama, String nip, int upahMingguan) {
        this.nama = nama;
        this.nip = nip;
        this.upahMingguan = upahMingguan;

    }

    // method hitung gaji
    public int HitungGaji() {
        int gaji = upahMingguan;
        return gaji;
    }

    // method tampil info
    public void TampilInfo() {
        System.out.println("Nama                : " + nama);
        System.out.println("NIP                 : " + nip);
        System.out.println("Upah Mingguan       : " + upahMingguan);
        System.out.println("Gaji                : " + HitungGaji());
        System.out.println("");
    }
  
}
