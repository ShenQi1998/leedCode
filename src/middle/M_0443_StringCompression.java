package middle;

// 无重复联系意义
public class M_0443_StringCompression {
    public static void main(String[] args) {
        String a = "aabbcc";
        compress(a.toCharArray());
    }

    public static int compress(char[] chars) {

        int write = 0;
        char lastChar = chars[0];
        int sum = 1 ;
        for ( int i = 1 ; i <= chars.length  ; i ++ ){

            if( i == chars.length || chars[i] != lastChar ){

                chars[write] = lastChar ;
                System.out.println(lastChar);
                write ++ ;
                if(sum != 1) {
                    String str = sum + "";
                    char[] charToWrite = str.toCharArray();
                    for (char c : charToWrite) {
                        chars[write] = c ;
                        System.out.println(c);
                        write ++;
                    }
                }
                if( i != chars.length  ) {
                    sum = 1 ;
                    lastChar = chars[i];
                }

            }else{
                sum = sum + 1;
            }
        }

        return write;

    }
}
