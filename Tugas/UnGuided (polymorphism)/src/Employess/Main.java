/***
 * Nama : RezairfanWijaya
 * NIM  : 19102149
 * Class: IF07P
 */

package Employess;

public class Main {

    public static void main(String[] args) {
        
         //pengaplikasian polimorphism
        SalariedEmployee se = new SalariedEmployee("Agus", "456agus", 10000);
        System.out.println(" ");
        System.out.println("Salaried Employee");
        se.HitungGaji();
        se.TampilInfo();
        System.out.println("");

        
        //merubah bentuk solariedEmployee ke CommisionEmployee
        System.out.println("Commission Employee");
        se = new CommissionEmployee(20000, 500, 10);
        se.HitungGaji();
        se.TampilInfo();
        System.out.println("");


        //merubah bentuk solariedEmployee ke projectPlanner
        System.out.println("Project Palanner");
        se = new ProjectPlanner(30000, 1000, 5);
        se.HitungGaji();
        se.TampilInfo();
    }
    
}
