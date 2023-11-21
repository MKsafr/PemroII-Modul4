package soal2 ;
import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in) ;
        System.out.println("Pilih jenis hewan yang ingin diinputkan : ") ;
        System.out.println("1 = Kucing") ;
        System.out.println("2 = Anjing") ;
        System.out.print("Masukkan pilihan : ") ;
        int pilihan = masuk.nextInt() ;

        masuk.nextLine() ;
        System.out.print("Nama Hewan Peliharaan : ") ;
        String NamaHewan = masuk.nextLine() ;
        System.out.print("Ras : ") ;
        String RasHewan = masuk.nextLine() ;
        System.out.print("Warna Bulu : ") ;
        String BuluHewan = masuk.nextLine() ;

        HewanPeliharaan hewan ;

        if(pilihan == 1) {
            hewan = new Kucing(RasHewan, NamaHewan, BuluHewan) ;
        }

        else {
            System.out.print("Kemampuan : ") ;
            String isi = masuk.nextLine() ;
            String[] Kemampuan = isi.split("\\,") ;
            hewan = new Anjing(RasHewan, NamaHewan, BuluHewan, Kemampuan) ;
        }

        hewan.display() ;
    }
}
