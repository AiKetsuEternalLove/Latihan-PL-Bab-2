package githubpraktikum2;
/*
 *NAMA  : I KETUT SIDHARTA YOGATAMA
 *NIM   : 155150200111102
 *KELAS : IF - H
 */
public class Lintasan {
    private double panjang,lebar;
    public Lintasan(double p,double l){
        panjang = p;
        lebar = l;
    }
    public double keliling(){
        return (2*panjang)+(2*lebar);
    }
    
}
