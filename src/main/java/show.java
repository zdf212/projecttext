import java.util.Random;

public class show {
    String ss = "外部类";
    public void test(){
        System.out.println(ss);
    }
    static class show1{
        show showa = new show();
        public  void test1(){
            System.out.println(showa.ss);
            System.out.println("静态内部类");
        }
    }
    String a = new String("哈哈");

    public void sss (){
        System.out.println(a);
    }
    public static void main(String[] args) {
        try{
            int i = 100 / 0;
            System.out.print(i);
        }catch(Exception e){
            System.out.print(1);
        }finally{
            System.out.print(2);
        }
        System.out.print(3);
    }
}
