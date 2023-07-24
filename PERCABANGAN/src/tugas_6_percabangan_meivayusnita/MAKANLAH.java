package tugas_6_percabangan_meivayusnita;

import java.util.Scanner;

public class MAKANLAH {
    
    static Scanner masukkan = new Scanner(System.in);
    
    public static void main(String[] args) {
       int pilih;
       
        System.out.println("1. Lapar");
        System.out.println("2. Haus");
        System.out.println("Silahkan pilih (1/2)= ");
        pilih = masukkan.nextInt();
        
        if(pilih == 1){
            System.out.println("makanlah");
        }
        
        else if(pilih == 2){
        System.out.println("minumlah");
    }
        else {
            System.out.println("salah pilih");
        }
    }
    
}
