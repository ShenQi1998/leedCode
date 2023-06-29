package middle;

//792 = 700 + 90 + 2 = 500 + 100 + 100  + (100 - 10) + 2
//DCCXCII

//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000

//这道题没什么意义f

public class M_0012_IntegerToRoman {

    public static void main(String[] args) {
        String a = intToRoman(1994);
        System.out.println(a);
    }

    public static String intToRoman(int num) {

        if( num == 0){
            return "";
        }

        String now = "";

        if(num >= 1000){
            now = "M";
            num = num - 1000;
        }else if( num >= 900 ){
            now = "CM";
            num = num - 900;
        }else if( num >= 500 ){
            now = "D";
            num = num - 500;
        }else if( num >= 400 ){
            now = "CD";
            num = num - 400;
        }else if( num >= 100 ){
            now = "C";
            num = num - 100;
        }else if( num >= 90 ){
            now = "XC";
            num = num - 90;
        }else if( num >= 50 ){
            now = "L";
            num = num - 50;
        }else if( num >= 40 ){
            now = "XL";
            num = num - 40;
        }else if( num >= 10 ){
            now = "X";
            num = num - 10;
        }else if( num >= 9 ){
            now = "IX";
            num = num - 9;
        }else if( num >= 5 ){
            now = "V";
            num = num - 5;
        }else if( num >= 4 ) {
            now = "IV";
            num = num - 4;
        }else if( num >= 1 ) {
            now = "I";
            num = num - 1;
        }

        return now + intToRoman( num);
    }
}
