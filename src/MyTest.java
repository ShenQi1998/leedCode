public class MyTest {

    public static void main(String[] args) {

        String magazine = "a";
        int[] cnt = new int[26];
        for(char c : magazine.toCharArray()) {
            cnt[c - 'a'] ++;
        }

        System.out.println( cnt[0] );
    }
}
