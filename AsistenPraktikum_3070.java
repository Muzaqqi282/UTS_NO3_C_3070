/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_no3_3070;

/**
 *
 * @author ASUS
 */
  public class AsistenPraktikum_3070 extends Mahasiswa_3070 {
    String mkAsisten;
    int jmlPertemuan;
    
    public double totalPendapatan(){
        return(jmlPertemuan * 50000);
    }
    public void tampilDataAsistenPraktikum() {
        super.tampilDataMhs();
        System.out.println(" Mata Kuliah    : " + mkAsisten);
        System.out.println(" Jumlah Pertemuan   : " + jmlPertemuan);
        System.out.println(" Total Pendapatan : " + totalPendapatan());
        
        
    }
    
}