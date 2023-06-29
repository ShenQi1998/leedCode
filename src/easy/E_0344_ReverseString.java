package easy;

//唯一要考察的就是 如何不使用第三个变量交换两个数
public class E_0344_ReverseString {
    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        while (l < r) {
            s[l] = (char) (s[l] ^ s[r]);  //构造 a ^ b 的结果，并放在 a 中
            s[r] = (char) (s[r] ^ s[l]);  //将 a ^ b 这一结果再 ^ b ，存入b中，此时 b = a, a = a ^ b
            s[l] = (char) (s[l] ^ s[r]);  //a ^ b 的结果再 ^ a ，存入 a 中，此时 b = a, a = b 完成交换
            l++;
            r--;
        }
    }
}
