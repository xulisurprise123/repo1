public class Test4 {

    public static void main(String[] args) {
            System.out.println(reverse("I am a girl"));
        }


        public static String reverse(String str) {
            StringBuffer buffer = new StringBuffer();
            String temp = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                char zifu = str.charAt(i);
                if (zifu == ' ') {
                    buffer.append(temp);
                    buffer.append(zifu);
                    temp = "";
                } else {
                    temp = zifu + temp;
                }
            }
            buffer.append(temp);
            return buffer.toString();
        }
}
