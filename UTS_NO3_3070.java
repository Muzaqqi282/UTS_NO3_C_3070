/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts_no3_3070;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
public class UTS_NO3_3070 {
    public static void main(String[] args) {
        
        //Membuat object menggunakan array
        AsistenPraktikum_3070[] ap = new AsistenPraktikum_3070[1];
        StudentStaff_3070[] ss = new StudentStaff_3070[1];
        
        ap[0] = new AsistenPraktikum_3070();
        ss[0] = new StudentStaff_3070();

        //program input menggunakan buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        try {
            //mengisi data ke array pada data nelayan
            for(int i = 0; i < 1; i++){
                System.out.print("NIM              : ");
                ap[i].nim = br.readLine();
                System.out.print("Nama             : ");
                ap[i].nama = br.readLine();
                System.out.print("Jurusan          : ");
                ap[i].jurusan =br.readLine();
                System.out.print("IPK              : ");
                ap[i].ipk =Integer.parseInt(br.readLine());
                System.out.print("Mata Kuliah      : ");
                ap[i].mkAsisten = br.readLine();
                System.out.print("Jumlah Pertemuan : ");
                ap[i].jmlPertemuan = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            //Menampilkan semua isi array pada data nelayan
            System.out.println("DATA ASISTEN PRAKTIKUM");
            for(AsistenPraktikum_3070 AP : ap){
                AP.tampilDataAsistenPraktikum();
                System.out.println("");
            }

            //mengisi data ke array pada data dokter
            for(int i = 0; i < 1; i++){
                System.out.print("NIM         : ");
                ss[i].nim = br.readLine();
                System.out.print("Nama        : ");
                ss[i].nama = br.readLine();
                System.out.print("Jurusan     : ");
                ss[i].jurusan =br.readLine();
                System.out.print("IPK         : ");
                ss[i].ipk =Integer.parseInt(br.readLine());
                System.out.print(" Unit Kerja : ");
                ss[i].unitKerja = br.readLine();
                System.out.print("Jam Kerja   : ");
                ss[i].jamKerja = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            //Menampilkan semua isi array pada data dokter
            System.out.println("DATA STUDENT STAFF");
            for(StudentStaff_3070 SS : ss){
                SS.tampilDataStudentStaff();
                System.out.println("");
            }
        } 
        catch (Exception ex){ // menangkap kesalahan
            System.out.println(ex);
        }
        
    }
}
