public class Koperasi
{
    String ID, nama, alamat;
    double pinjem,angsuran;
 
 
 //Methodvoid:
    void cetakdata(){
        System.out.println("==Data Nasabah==");
        System.out.println("ID : "+ID);
        System.out.println("Nama : "+nama);
        System.out.println("Alamat : "+alamat);
        System.out.println("==Keuangan==");
    }
    
    void pinjam(){
        System.out.println("Pinjaman : "+pinjem);
    }
    
    void angsuran(){
        System.out.println("Angsuran : "+angsuran);
    }
    
    
 //Methodnonvoid:
    double hitungsumbangan(){
    double sumbangan = pinjem * 0.025;
    return sumbangan;
}
    double cicilanbulanan(){
    double cicilan = angsuran * 12;
    return cicilan;
}
    double hitungbunga(){
    double bunga = (cicilanbulanan()-pinjem)/pinjem*1;
    return bunga;
}
}