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
        Scanner in = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);
        System.out.print("Masukan Jumlah Mahasiswa: ");
        jumlah = in.nextInt();
        
        Mahasiswa coba[] = new Mahasiswa[jumlah];
        for (int i = 0; i < jumlah; i++) {
            String nama ="nama";
            String nim ="nama";
            coba[i] = new Mahasiswa(nama,nim);
            System.out.println("===============================");
        System.out.print("Masukan Nama Mahasiswa\t: ");
        coba[i].nama(instr.nextLine());
        System.out.print("Masukan NIM \t\t: ");
        }
        
    }
    
}
