/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Nama : Angelia Regina Ginting
Alamat Email : angeliareginagtg@gmail.com
Waktu Mulai : 11/07/2022 21:00
Waktu Selesai : 11/07/2022 21:27
*/

package test.fe.kawahedukasi;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class test_soal2 {
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Nama: ");
        String name = input.nextLine();
        
        System.out.print("Halo " + name + " selamat datang!");
        
        System.out.println();
        
        if (!name.matches("[a-zA-Z_]+")){
            System.out.println("Sistem kami menolak untuk inputan berisi angka");
        }else{
            System.out.println("Sistem memeriksa data anda valid dengan ketentuan kami dengan inputan hallo " + name + " selamat datang!");
        }
    }
}
