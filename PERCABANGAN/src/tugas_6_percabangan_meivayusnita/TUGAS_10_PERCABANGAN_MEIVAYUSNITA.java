package tugas_6_percabangan_meivayusnita;
import java.util.Scanner;
public class TUGAS_10_PERCABANGAN_MEIVAYUSNITA {
    public static void main(String[] args) {
        Scanner masukkan = new Scanner (System.in);
        int pilihan1,pilihan2;
        System.out.println("masukan pilihan 1 (1/2/3)=");
        pilihan1=masukkan.nextInt();
        System.out.println("masukkan pilihan 2 (1/2/3)=");
        pilihan2=masukkan.nextInt();
        /*
        1. batu
        2. gunting
        3. kertas
        */
        if (pilihan1==1 && pilihan2==1){
            System.out.println("1. memilih 1 batu");
            System.out.println("2. memilih 1 batu");
            System.out.println("hasil pemenang= seri");
            }        
        else if (pilihan1==2 && pilihan2==2){
            System.out.println("1. memilih 2 gunting");
            System.out.println("2. memilih 2 gunting");
            System.out.println("hasil pemenang= seri");
        }
        else if (pilihan1==3 && pilihan2==3){
            System.out.println("1. memilih 3 kertas");
            System.out.println("2. memilih 3 kertas");
            System.out.println("hasil pemenang= seri");
        }
        else if (pilihan1==1 && pilihan2==2){
            System.out.println("1. memilih 1 batu");
            System.out.println("2. memilih 2 gunting"); 
            System.out.println("hasil pemegang= 1  batu menang");
        }
        else if (pilihan1==1 && pilihan2==3){
            System.out.println("1. memilih 1 batu");
            System.out.println("2. memilih 3 kertas");
            System.out.println("hasil pemegang= 3 kertas menang");
        }
        else if (pilihan1==2 && pilihan2==1){
            System.out.println("1. memilih 2 gunting");
            System.out.println("2. memilih 1 batu");
            System.out.println("hasil pemegang= 1 batu menang");
        }
        else if (pilihan1==2 && pilihan2==3){
            System.out.println("1. memilih 2 gunting");
            System.out.println("2. memilih 3 kertas");
            System.out.println("hasil pemegang= 3 kertas menang");
        }
        else if (pilihan1==3 && pilihan2==1){
            System.out.println("1. memilih 3 batu");
            System.out.println("2. memilih 1 kertas");
            System.out.println("hasil pemegang= 1 kertas menang");
        }
        else if (pilihan1==3 && pilihan2==2){
            System.out.println("1. memilih 3 batu");
            System.out.println("2. memilih 2 gunting");
            System.out.println("hasil pemegang= 3 batu menang");
        }
        else {
        System.out.println("salah input");
    }
    }
    }

