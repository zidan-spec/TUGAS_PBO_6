import java.text.DecimalFormat;
public class Data
{
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main (String[] args){
    //intansiasi objek Koperasi
    Koperasi Kpr01 = new Koperasi();
    //mengisi data pada objeck Koperasi.
    Kpr01.ID="K001";
    Kpr01.nama="Zidane Maulana Aziz";
    Kpr01.alamat="Mustika Ratu";
    Kpr01.pinjem= 1630000;
    Kpr01.angsuran = 400000;
 
    ///menganngi methodvoid()
    Kpr01.cetakdata();
    Kpr01.pinjam();
    Kpr01.angsuran();
    
    //Memanggil Methodnonvoid
    System.out.println("Sumbangan zakat : "+Kpr01.hitungsumbangan());
    System.out.println("Cicilan Pertahun : "+Kpr01.cicilanbulanan());
    System.out.println("Bunga : "+ df.format(Kpr01.hitungbunga()));
 
}
}