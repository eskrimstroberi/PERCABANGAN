package tugas_6_percabangan_meivayusnita;

import java.util.Scanner;
public class TUGAS_7_PERCABANGAN_MEIVAYUSNITA {
    static Scanner masukkan = new Scanner (System.in);
    public static void main(String[] args) {
        String jurusan;
        int rangking;
        
        System.out.println("masukkan jurusan    :");
        jurusan= masukkan.nextLine();        
        System.out.println("masukkan rangking   :");
        rangking= masukkan.nextInt();
        
        switch (jurusan){
            case "RPL" -> {
                if (rangking==1){
                    System.out.println("hadiah yan didapatkan= i7");
                }
                else if (rangking==2){
                    System.out.println("hadiah yan didapatkan= i5");
                }
                else if (rangking==3){
                    System.out.println("hadiah yan didapatkan= i3");
                }
            }       
            case "mm" -> {
                if (rangking==1){
                    System.out.println("hadiah yan didapatkan= videocam professional");
                }
                else if (rangking==2){
                    System.out.println("hadiah yan didapatkan= videocam prosumer");
                }
                else if (rangking==3){
                    System.out.println("hadiah yan didapatkan= photocam");
                }
            }
                
            }
    }
    
}

