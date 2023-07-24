
package tugas_6_percabangan_meivayusnita;

import java.util.Scanner;

public class TUGAS_6_PERCABANGAN_MEIVAYUSNITA {
    static Scanner masukkan = new Scanner (System.in);
    public static void main(String[] args) {
        int nilai;
        
        System.out.println("masukkan nilai= ");
        nilai= masukkan.nextInt();
        
        if (nilai >=100){
            System.out.println("predikat A");  
            System.out.println("sangat baik");
        }
        else if(nilai>=95){
            System.out.println("predikat A-");
            System.out.println("sangat baik");
        }
        else if(nilai>=95){
            System.out.println("predikat A-");
            System.out.println("sangat baik");
        }
        else if(nilai>=90){
            System.out.println("predikat B+");
            System.out.println("baik");
        }
        else if(nilai>=85){
            System.out.println("predikat B");
            System.out.println("baik");
        }
        else if(nilai>=80){
            System.out.println("predikat B-");
            System.out.println("baik");
        }
        else if(nilai>=69){
            System.out.println("predikat C");
            System.out.println("cukup");
        }
        else if(nilai>=64){
            System.out.println("predikat C-");
            System.out.println("cukup");
        }
        else if(nilai>=59){
            System.out.println("predikat D+");
            System.out.println("kurang");
        }
        else if(nilai>=54){
            System.out.println("predikat D");
            System.out.println("kurang");
        }
        switch (nilai) {
            case 96,97,98,99,100:
                System.out.println("Kriteria : Sangat baik");
                break;
            case 91, 92, 93, 94, 95 :
                System.out.println("Kriteria : sangat Baik");
                break;
            case 86, 87, 88, 89, 90 :
                System.out.println("Kriteria : baik");
                break;
            case 81, 82, 83, 84, 85 :
                System.out.println("Kriteria : baik ");
                break;
            case 75, 76, 77, 78, 79, 80 :
                System.out.println("Kriteria : baik ");
                break;
            case 70, 71, 72, 73, 74:
                System.out.println("Kriteria : Cukup");
                break;
            case 65, 66, 67, 68, 69 :
                System.out.println("Kriteria : cukup ");
                break;
            case 60,61,62,63,64 :
                System.out.println("Kriteria : cukup");
                break;
            case 55,56,57,58,59 :
                System.out.println("Kriteria : kurang  ");
                break;
            case 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,
                 22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,
                 41,42,43,44,45,46,47,48,49,50,51,52,53,54 :
                System.out.println("predikat = D");
                System.out.println("Kriteria : kurang ");
                break;    
        }

        
    }
}
