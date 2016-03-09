package githubpraktikum2;
import java.util.Scanner;
/*
 *NAMA  : I KETUT SIDHARTA YOGATAMA
 *NIM   : 155150200111102
 *KELAS : IF - H
 */
public class GitHubPraktikum2 {
    public static void main(String[] args) {
       int jumlah,angka;
        Scanner in = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);
        System.out.print("Masukan Jumlah Mahasiswa: ");
        jumlah = instr.nextInt();
        angka = in.nextInt();
        Lintasan coba2 = new Lintasan(angka,angka);
        Mahasiswa coba[] = new Mahasiswa[jumlah];
        for (int i = 0; i < jumlah; i++) {
            System.out.println("===============================");
          System.out.print("Masukan Nama Mahasiswa\t: ");
          String name = instr.nextLine();
          System.out.print("Masukan NIM \t\t: ");
          String nim = instr.nextLine();
          coba[i] = new Mahasiswa(name,nim);
            
        

        
        }
    }
    
}
