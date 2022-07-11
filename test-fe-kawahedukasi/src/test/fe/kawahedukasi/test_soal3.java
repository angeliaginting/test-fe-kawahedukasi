/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Nama : Angelia Regina Ginting
Alamat Email : angeliareginagtg@gmail.com
Waktu Mulai : 11/07/2022 21:50
Waktu Selesai : 11/07/2022 22:18
*/

package test.fe.kawahedukasi;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class test_soal3 {
    public static void main (String[] args){
        
        String output1 = "Output 1";
        System.out.println(output1);
        
        Scanner input = new Scanner(System.in);
        int a = 6;
        for (int b = 1; b <= a; b++){
            for(int c = 1; c <= b; c++){
                System.out.print('*');
            }
            System.out.println();
        }
        
        System.out.println();
        
        String output2 = "Output 2";
        System.out.println(output2);
        
        int i = 5;
        for (int j = 1; j <= i; j++){
            for (int k = 4; k >= j; k--){
                System.out.print(' ');
            }
            for (int l = 1; l <= j; l++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
