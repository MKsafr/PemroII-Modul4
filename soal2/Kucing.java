package soal2 ;

class Kucing extends HewanPeliharaan {
    private String bulu ;

    public Kucing(String r, String n, String w) {
        super(r, n) ;
        this.bulu = w ;
    }

    @Override
    public void display() {
        super.display() ;
        System.out.println("Memiliki warna bulu : " + bulu);
    }
}
