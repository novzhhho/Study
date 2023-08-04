public class random {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 12 + 1 );           //random生成的是大于0小于1的无限位数字，这很重要
        System.out.println("生成的随机数的大小为：" + num);
    }
}
