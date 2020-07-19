public class Test3 {
    //3.打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。
    // 例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
    public static void main(String[] args) {
        System.out.println("这是一堆美丽的水仙花数");
        int a, b, c;
        for (int sanweishu = 100; sanweishu < 1000; sanweishu++) {
            //a,b,c分别表示个位数，十位数，百位数
            a = sanweishu % 10;
            b = (sanweishu % 100) / 10;
            c = sanweishu / 100;
            if (sanweishu == (a*a*a + b*b*b + c*c*c))
                System.out.println(sanweishu);
        }
    }
}

