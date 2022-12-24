public class inventory {
    String KodeBarang;
    String NamaBarang;
    int JumlahBarang;
    int Harga;

    public inventory(){//constructor
         }
    public static void NamaBarang(){
        System.out.println("KacangPanjang");
    }

    public static void main(String[] args) {
        NamaBarang();

        new inventory();
        inventory.NamaBarang();

        inventory Mouse = new inventory();
        Mouse.NamaBarang();
    }
}

