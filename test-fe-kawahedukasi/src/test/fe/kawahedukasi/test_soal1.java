/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Nama : Angelia Regina Ginting
Alamat Email : angeliareginagtg@gmail.com
Waktu Mulai : 12/07/2022 0:33
Waktu Selesai : 12/07/2022 1:45
*/

package test.fe.kawahedukasi;

/**
 *
 * @author Angel
 */

public class test_soal1 {
    public static void main (String[] args){
        int data[]= {1, 1, 1, 2, 2, 4, 1, 1,
                     2, 1, 2, 2, 2, 8, 1, 1,
                     3, 3, 3, 3, 2, 4, 1, 1};
        
        int dataterbesar = -1;
        int dataterbanyak = -1;
        
        for (int i=0; i<data.length; i++){
            int jumlah = 0;
            
            for (int j=0; j<data.length; j++){
                if(data[i] == data[j])
                    jumlah++;
            }
            
            if (jumlah > dataterbanyak){
                dataterbesar = data[i];
                dataterbanyak = jumlah;
            }
        }
        
        System.out.println("Total data paling banyak keluar adalah " + dataterbesar + " dengan jumlah " + dataterbanyak);
    }
}