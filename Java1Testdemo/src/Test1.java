public class Test1 {
    public static void main(String[] args) {
        //1.给定一个字符串，实现翻转并输出，例如输入“abc”，翻转输出效果为“cba”。
        String str = "abc";
        char[] chars = str.toCharArray();
        String fanzhuan = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            fanzhuan += chars[i];
        }
        System.out.println(fanzhuan);
    }
}


