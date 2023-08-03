import java.util.Scanner;

public class testboolean {
    
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int number = in.nextInt();

    boolean newline                                          //注意这条语句的等价写法
        = number % 10 == 0;
    
    System.out.println("test:" + newline);
    in.close();
}
 
}
