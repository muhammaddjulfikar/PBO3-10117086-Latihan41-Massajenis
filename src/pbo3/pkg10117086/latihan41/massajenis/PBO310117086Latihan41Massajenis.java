/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117086.latihan41.massajenis;

/**
 * @author Lenovo 
 * NAMA : RD Muhammad Djulfikar BU 
 * KELAS : IF3 
 * NIM : 10117086
 * DESKRIPSI PROGRAM :
 */
public class PBO310117086Latihan41Massajenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kubus objK = new Kubus();
        System.out.println("==== Massa Jenis Kubus====");
        objK.setSisi(5);
        objK.setMassa(250);
        System.out.println("Sisi : " + objK.getSisi());
        System.out.println("Massa : " + objK.getMassa());
        System.out.println("");
        System.out.println("==== Hasil Perhitungan====");
        System.out.println("Volume : " + objK.hitungVolume(0));
        System.out.println("Massa Jenis : " + objK.hitungMassaJenis(0, 0));

    }

}
