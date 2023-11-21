package soal2 ;

class Anjing extends HewanPeliharaan {
    private String bulu ;
    private String[] kemampuan ;

    public Anjing(String r, String n, String w, String[] k) {
        super(r, n) ;
        this.bulu = w ;
        this.kemampuan = k ;
    }

    @Override
    public void display() {
        super.display() ;
        System.out.println("Memiliki warna bulu : " + bulu) ;
        System.out.println("Memiliki kemampuan : " + kemampuan[0] + " " + kemampuan[1] + " " + kemampuan[2]) ;
    }
}
