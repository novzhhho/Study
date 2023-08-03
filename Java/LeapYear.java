import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int year = in.nextInt();
        
        boolean isleapyear =                                                // 这条表达式很好简化了代码的体积！！！
            (year % 4 ==0 && year % 100 !=0 || year % 400 == 0);     
        System.out.println(year + "年是闰年吗？：" + isleapyear);
        in.close();
    }
}
