import java.util.Scanner;

public class tiaojiantest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ages = in.nextInt();
        int ticketprice;
        ticketprice = (ages >= 16) ? 20 : 10;                 //重点在于这个条件表达式
        System.out.println("票价为：" + ticketprice);
        in.close();
    }
}
