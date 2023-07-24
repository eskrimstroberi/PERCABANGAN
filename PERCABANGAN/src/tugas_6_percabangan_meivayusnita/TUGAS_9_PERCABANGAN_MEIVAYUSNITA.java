package tugas_6_percabangan_meivayusnita;
import java.util.Scanner;
import static tugas_6_percabangan_meivayusnita.TUGAS_8_PERCABANGAN_MEIVAYUSNITA.masukkan;

public class TUGAS_9_PERCABANGAN_MEIVAYUSNITA {
    
    static Scanner masukkan = new Scanner (System.in);
    public static void main(String[] args) {
        String pilih;
        
        System.out.println("masukkan pilihan anda   :");
        pilih= masukkan.nextLine(); 
        
        switch (pilih) {
            case "1":
                System.out.println("anda memilih batu");
                System.out.println("kalah dengan 3");
                System.out.println("menang dengan 2");
                break;
            case "2":
                System.out.println("anda memilih gunting");
                System.out.println("kalah dengan 1");
                System.out.println("menang dengan 3");
                break;
            case "3":
                System.out.println("anda memilih kertas");
                System.out.println("kalah dengan 2");
                System.out.println("menang dengan ");
                break;
            }
        }
}
