
package tugas_6_percabangan_meivayusnita;
import java.util.Scanner;
public class TUGAS_1_PERCABANGAN_MEIVAYUSNITA {
    static Scanner masukkan = new Scanner(System.in);
    public static void main(String[] args) {
        int nilai;
        
        System.out.println("Masukkan nilai= ");
        nilai = masukkan.nextInt();
        
        if (nilai > 100 || nilai < 0){
            System.out.println("salah input nilai");
        }
        else if (nilai >= 90){
            System.out.println("Predikat A");
        }
        else if (nilai >= 80){
            System.out.println("Predikat B");
        }
        else if (nilai >= 60){
            System.out.println("Predikat C");
        }
        else if (nilai >= 50){
            System.out.println("Predikat D");
        }
        else if (nilai >= 0){
            System.out.println("Predikat E");
        }
        
        
        
    }      
}
