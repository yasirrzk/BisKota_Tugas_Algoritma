public class Main {
    public static void Jumlah(){
        int angka1=3;
        int angka2=4;
        int hasil_jumlah = angka1+angka2;
        System.out.println("hasil_jumlah");
    }
    //new metodhe yang 3
    //non void, tanpa parameter

    public static String _Message(){
        return "hallo dek,kuliah apa kerja?";
    }
    public static int[] inputAngka(){
        int[] number = new int[]{4,7,10,11};
        return number;

    }

    public static void main(String[] args) {
        String msg=_Message();
        System.out.println(msg);

        int[] angkaSaya = inputAngka();
        for(int n : angkaSaya){
            System.out.println("Angka Saya = " + n);
        }

        for(int index=0; index< angkaSaya.length;index++){
            System.out.println("Menggunakan for biasa : " + angkaSaya[index]);
        }
    }


}