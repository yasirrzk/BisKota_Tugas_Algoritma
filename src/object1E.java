public class object1E {
    private String KodeBarang;
    private String NamaBarang;
    private int JumlahBarang;
    private int Harga;
    private int StokMulaMula;
    private int Stokakhir;

public object1E(){//Constructor

}
public object1E(String kdbrg, String nmbrg, int jumjual, int hrg, int mula){//constructor
    this.KodeBarang = kdbrg;
    this.NamaBarang = nmbrg;
    this.JumlahBarang = jumjual;
    this.Harga = hrg;
    this.StokMulaMula = mula;
    this.Stokakhir = 0;
}

public void JualItem(){
    Stokakhir = StokMulaMula - JumlahBarang;
    System.out.println("Stok Akhir = " + Stokakhir);
}


}

