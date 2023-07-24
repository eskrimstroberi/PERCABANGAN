package tugas_6_percabangan_meivayusnita;

import java.util.Scanner;

public class TUGAS_3_PERCABANGAN_MEIVAYUSNITA {
    
    static Scanner masukkan = new Scanner (System.in);
    
    public static void main(String[] args) {
        
        int nilai= 0-100;
        /* nilai 90-100 = predikat A
           nilai 80- 89 = predikat B
           nilai 60- 79 = predikat C
           nilai 50- 59= predikat D
           nilai  0- 49 = predikat E
        */
        System.out.println("masukkan nilai= ");
        nilai= masukkan.nextInt();
    
        if (nilai >=90){
        System.out.println("nilai anda "+nilai);
        System.out.println("mendapat predikat A");
        }
        else if (nilai >=80){
        System.out.println("nilai anda "+nilai);
        System.out.println("mendapat predikat B");
        }
        else if (nilai >=65){
        System.out.println("nilai anda "+nilai);
        System.out.println("mendapat predikat C");
        }
        else if (nilai >=45){
        System.out.println("nilai anda "+nilai);
        System.out.println("mendapat predikat D");
        }
        else if (nilai >=0){
        System.out.println("nilai anda "+nilai);
        System.out.println("mendapat predikat E");
        }   
    }
}

