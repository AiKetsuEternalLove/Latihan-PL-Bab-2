package githubpraktikum2;
/*
 *NAMA  : I KETUT SIDHARTA YOGATAMA
 *NIM   : 155150200111102
 *KELAS : IF - H
 */
public class Mahasiswa {
    private String nama,nim;
    private double waktu,putaran;
    public Mahasiswa(String n,String m,double l, double w){
        nama = n;
        nim = m;
        putaran = l;
        waktu = w;
}
    public double jarak(Lintasan a){
        return a.keliling()*putaran;
    }
    public String nama(){
        return nama;
    }
    public double kecepatan(){
        return putaran/waktu;
    }
}