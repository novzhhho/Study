import java.util.Scanner;

public class studentlianxi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result;
        int num1 = (int) (Math.random()*10);
        int num2 = (int) (Math.random()*10);
        int num3;
        if (num1 < num2){
            num3 = num1;
            num1 = num2;
            num2 = num3;
        }
        System.out.println("请输入" + num1 + "-"+ num2 + "的结果");
        result = in.nextInt();
        if (result == (num1 - num2)) {
            System.out.println("you are right!");
        }
        else{
            System.out.println("you are wrong!");
        }
        in.close();
    }

    }

