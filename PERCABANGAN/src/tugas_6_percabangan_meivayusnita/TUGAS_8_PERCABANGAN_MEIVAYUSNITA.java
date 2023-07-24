
package tugas_6_percabangan_meivayusnita;

import java.util.Scanner;

public class TUGAS_8_PERCABANGAN_MEIVAYUSNITA {
    
     static Scanner masukkan = new Scanner (System.in);
     public static void main(String[] args) {
      int pilih ;
     
      System.out.println("masukkan pilihan anda   :");
      pilih= masukkan.nextInt(); 
        
      if (pilih == 1){
      System.out.println("pilihan anda : batu");  
      System.out.println("kalah dengan 3");
      System.out.println("menang dengan 2");
        }
      else if (pilih == 2){
      System.out.println("pilihan anda : gunting");
      System.out.println("kalah dengan 1");
      System.out.println("menang dengan 2");
        }
      else if (pilih == 3){
      System.out.println("pilihan anda : kertas");
      System.out.println("kalah dengan 3");
      System.out.println("menang dengan 2");
        }
     }
}

