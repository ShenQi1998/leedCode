package easy;

import java.util.Arrays;

public class E_0242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return Arrays.equals(sChars,tChars);
    }
}
