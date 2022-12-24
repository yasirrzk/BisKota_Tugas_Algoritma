public class materi1E {
    public static int romSumOddNumbers(int n) {
        //TODO
        int lastnum = 0;
        int total = 0;
        for (int row = 1; row <= n; row++) {
            total = 0;
            for (int x_row = 1; x_row <= row; x_row++) {
                if (row > 1) {
                    lastnum += 2;
                    System.out.println(lastnum);
                    total += lastnum;
                } else {
                    System.out.println(x_row);
                    lastnum = x_row;
                    total = 1;
                }
            }
            System.out.println("Total : " + total);
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(romSumOddNumbers(1000000));
    }
}
