package soal1 ;
import java.util.Scanner ;

public class HewanPeliharaan {
    String nama ;
    String ras ;

    Scanner masuk = new Scanner(System.in) ;

    public HewanPeliharaan(String ras, String nama) {
        System.out.print("Nama Hewan Peliharaan : ") ;
        nama = masuk.nextLine() ;
        this.nama = nama ;
        System.out.print("Ras : ") ;
        ras = masuk.nextLine() ;
        this.ras = ras ;
    }
    
    public void display() {
        System.out.println("\nDetail Hewan Peliharaan : ") ;
        System.out.println("Nama Hewan Peliharaan : " + nama) ;
        System.out.println("Dengan ras : " + ras) ;
    }
}