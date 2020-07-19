import java.util.Scanner;

public class Test2 {
    //    2.给定一个字符串，统计字符串中 英文字母，空格，数字和其他字符出现的次数

    /**
     * 计算字母出现次数的方法
     * @param str
     * @return
     */
    public static int getCharacterCount(String str)
    {
        int charactercount=0;
        for(int i=0;i<str.length();i++){

            if((str.charAt(i)>='a'&&str.charAt(i)<='z')||(str.charAt(i)>='A'&&str.charAt(i)<='Z'))
                charactercount++;
        }
        return charactercount;
    }

    /**
     * 计算空格出现次数的方法
     * @param str
     * @return
     */
    public static int getBlankCount(String str)
    {
        int blankcount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                blankcount++;
        }
        return blankcount;
    }

    /**
     * 计算数字出现次数的方法
     * @param str
     * @return
     */
    public static int getNumCount(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>= '0'&&str.charAt(i)<='9')
                count++;
        }
        return count;

    }


    public static void main(String[] args){
        System.out.println("请任意给定一个字符串：");
        Scanner sc =new Scanner(System.in);
        String input=sc.nextLine();
        sc.close();
        int charactercount=getCharacterCount(input);
        int blankcount=getBlankCount(input);
        int numbercount=getNumCount(input);
        int othercount=(input.length()-charactercount-blankcount-numbercount);
        System.out.println(
                "给定一个字符串，统计字符串中 英文字母，空格，数字和其他字符出现的次数"+
                "给定字符串中，英文字母出现的次数是："+charactercount+"\r\n"
                +"空格出现的次数是："+blankcount+"\r\n"
                +"数字出现的次数是："+numbercount+"\r\n"
                +"其他字符出现的次数是："+othercount

        );

    }

}
