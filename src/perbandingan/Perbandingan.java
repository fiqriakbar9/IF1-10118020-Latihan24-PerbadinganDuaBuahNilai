/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perbandingan;

import java.util.Scanner;

/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk menampilkan hasil
 * perbandingan nilai dari 2 nilai yang diinputkan , program dalam dilakukan kembali
 * ketika anda menjawab "Ya" di akhir pertanyaan.
 */
public class Perbandingan {
    private static Object ulangi;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // TODO code application logic here
    
        int Nilaisatu;
        int Nilaidua;
        String Ulangi;
                
        Scanner scan = new Scanner(System.in);
        
        System.out.println("=======Program Perbandingan Nilai=======");
        do {
            System.out.printf("Masukkan Nilai Pertama\t : ");
            Nilaisatu = scan.nextInt();
            System.out.printf("Masukkan Nilai Kedua\t : ");
            Nilaidua = scan.nextInt();
            
            System.out.printf("Hasil : ");
            if (Nilaisatu > Nilaidua){
                System.out.printf(Nilaisatu + " Lebih besar dari " + Nilaidua);
            } else if (Nilaisatu < Nilaidua){
                System.out.printf(Nilaisatu + " Lebih kecil dari " + Nilaidua);
            } else if (Nilaisatu == Nilaidua){
                System.out.printf(Nilaisatu + " Sama dengan " + Nilaidua);
            }
            System.out.println("");
            System.out.printf("\nUlangi aktivitas diatas.? (Ya/Tidak) : ");
            ulangi = scan.next();     
             System.out.println ("\nDevelop by : Fiqri Akbar Pratama");
        } while (ulangi.equals("Ya"));
}
}
