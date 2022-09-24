import java.util.*;
public class numberGuessing {
    public static void main(String[] args) {
        
       
         guess();
         System.out.println("You have guessed correctly");
       
    }
    static void guess(){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int number=0;
        int temp = rand.nextInt(1000);
        while(number!=temp){
            System.out.print("Guess a number  ");
             number = sc.nextInt();
            if(number<temp){
                System.out.println("Number is smaller");
            }else if (number>temp){
                System.out.println("Number is larger");
            }
        }
        sc.close();
    }
}
