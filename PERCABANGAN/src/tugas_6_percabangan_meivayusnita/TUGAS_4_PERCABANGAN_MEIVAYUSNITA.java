package tugas_6_percabangan_meivayusnita;

import java.util.Scanner;

public class TUGAS_4_PERCABANGAN_MEIVAYUSNITA {
    
    static Scanner masukkan = new Scanner (System.in);
    public static void main(String[] args) {
        int nilai = 0;
    System.out.println("masukkan nilai= ");
        nilai= masukkan.nextInt();
        
            if (nilai >=90){
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat A");
                if(nilai==100){
                System.out.println("sempurna");
            }
            }
            else if (nilai >=80){
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat B");
                if(nilai >=89){
                System.out.println("sedikit lagi dapat nilai A");
            }
            }
            else if (nilai >=65){
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat C");
            }
            else if (nilai >=45){
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat D");
            }
            else{
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat E");
                if (nilai ==0){
                System.out.println("tidak lulus");
            }
            }
        }
}

