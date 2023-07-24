package tugas_6_percabangan_meivayusnita;
import java.util.Scanner;
public class TUGAS_11_PERCABANGAN_MEIVAYUSNITA {
    static Scanner masukkan = new Scanner (System.in);
    public static void main(String[] args) {
        /*
        1.batu
        2.gunting
        3.kertas
        */
       int nomer;
        System.out.println("1.batu");
        System.out.println("2.gunting");
        System.out.println("3.kertas");
        System.out.println("masukkan angka random (1,2,3)=");
        nomer=masukkan.nextInt();
        
        if (nomer==1){
            System.out.println("mendapat batu");
            System.out.println("melawan komputer= kertas");
            System.out.println("AI MENANG");
        }
        else if (nomer==2){
            System.out.println("mendapat gunting");
            System.out.println("melawan AI=batu");
            System.out.println("AI MENANG");
        }
        else if (nomer==3){
            System.out.println("mendapat kertas");
            System.out.println("melawan AI=gunting");
            System.out.println("AI MENANG");
        }
        else {
            System.out.println("salah input");
        }
        
           }
    
}

