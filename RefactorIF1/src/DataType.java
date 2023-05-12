

public class DataType {
    private static final int[] date = {702, 1082, 1083, 1114, 1184, 1266, 12403};
    private static final int[] numeric = {20, 21, 23, 24, 26, 700, 701, 790, 1700, 2202, 2203, 2204, 2205, 2206, 3769, 12396};
    public static void main(String[] args) {
        System.out.println(DataType.gd(20));
        System.out.println(DataType.gd(702));
        System.out.println(DataType.gd(0));
    }

    public static String gd(int code) {
        for (int i : date) {
            if (code == i) {
                return "DATE";
            }
        }
        for (int i : numeric) {
            if (code == i) {
                return "NUMERIC";
            }
        }
        return "STRING";
    }


}