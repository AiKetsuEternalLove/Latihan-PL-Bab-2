package githubpraktikum2;
import java.util.Scanner;
/*
 *NAMA  : I KETUT SIDHARTA YOGATAMA
 *NIM   : 155150200111102
 *KELAS : IF - H
 */
public class GitHubPraktikum2 {
    public static void main(String[] args) {
       int jumlah;
       double panjang=0,lebar=0;
        Scanner in = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);
        System.out.print("Masukan Jumlah Mahasiswa: ");
        jumlah = in.nextInt();
        
        Lintasan coba2 = new Lintasan(panjang,lebar);
            System.out.println("===============================");
        System.out.print("Masukan Panjang :");
        panjang = in.nextInt();
        System.out.print("Masukan Lebar \t:");
        lebar = in.nextInt();
        coba2 = new Lintasan(panjang,lebar);
        
        Mahasiswa coba[] = new Mahasiswa[jumlah];
        for (int i = 0; i < jumlah; i++) {
            System.out.println("===============================");
          System.out.print("Masukan Nama Mahasiswa\t: ");
          String name = instr.nextLine();
          System.out.print("Masukan NIM \t\t: ");
          String nim = instr.nextLine();
          System.out.print("Masukan Putaran \t: ");
          double putaran = in.nextDouble();
          System.out.print("Masukan Waktu\t\t: ");
          double waktu = in.nextDouble();
            System.out.println("===============================");
          coba[i] = new Mahasiswa(name,nim,putaran,waktu);
        }
        for (int i = 0; i < jumlah; i++) {
            System.out.println(coba[i].nama()+" "+coba[i].jarak(coba2)+"m");
                System.out.println("===============================");
        }
        double maks = coba[0].kecepatan();
        String fastest = coba[0].nama();
        for (int i = 0; i < jumlah; i++) {
            if(coba[i].kecepatan()>maks){
                maks = coba[i].kecepatan();
                fastest = coba[i].nama();
            }
        }
        System.out.print(fastest+" waktu tercepat");
    }  
}