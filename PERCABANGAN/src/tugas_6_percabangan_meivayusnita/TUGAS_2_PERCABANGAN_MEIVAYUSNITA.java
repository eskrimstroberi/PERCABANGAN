package tugas_6_percabangan_meivayusnita;

import java.util.Scanner;
    
public class TUGAS_2_PERCABANGAN_MEIVAYUSNITA {

    static Scanner masukkan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int umur= 0;
        
        umur = masukkan.nextInt ();
        
        if (umur <- 21|| umur >=17){
            System.out.println("umur anda " +umur);
            System.out.println("memasuki masa dewasa");
        }
        else{
            System.out.println("umur anda " +umur);
            System.out.println("memasuki masa remaja");
        }

    }
}

