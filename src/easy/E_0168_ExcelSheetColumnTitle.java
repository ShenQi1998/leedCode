package easy;

//题目较难

//正常的二进制计算
//
//      0 | 100
//        |————————
//        0 |50
//          |————————
//          1 | 25
//            ————————
//            0 |  12
//              |————————
//              0 |  6
//                |—————————
//               1   |  3
//                   |——————————
//                      1
//倒序 1100100

//此题需要被除数 - 1
//余数 + 1




public class E_0168_ExcelSheetColumnTitle {
    public static void main(String[] args) {
        String a = convertToTitle(702);
        System.out.println(a);
    }
    public static  String convertToTitle(int n) {

        if (n <= 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--;
            System.out.println(n % 26);
            sb.append((char) (n % 26 + 1 + 64));
            n =n / 26;
        }
        return sb.reverse().toString();


    }
}
