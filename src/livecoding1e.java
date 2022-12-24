public class livecoding1e {
    public static String S (int[] angka) {
     int data = angka.length;
     String status;
     if (data%2==0){
         status = "genap";
     }else {
         status = "ganjil";
     }
     return status;
    }

    public static void main(String[] args) {
        String t = S (new int[] {1,2,3,4});
        System.out.println(t);
    }
}
