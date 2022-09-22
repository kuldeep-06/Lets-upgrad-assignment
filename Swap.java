import javax.print.event.PrintJobListener;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
         System.out.println("Before swapping a and b are "+a+" "+b);
       int temp ;
        temp=a;
        a=b;
        b= temp;
        System.out.println("After swapping a and b are "+a+" "+b);
    }
}
