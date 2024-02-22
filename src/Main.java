
import java.util.Scanner;
public class Main {

   public static void main(String[] args) {

        int num1, num2 ,ebob=1,ekok=1,i=1;

        Scanner userInp = new Scanner(System.in);

        System.out.println("1. Sayiyi Giriniz: ");
            num1= userInp.nextInt();
            System.out.println("2. Sayiyi Giriniz: ");
            num2= userInp.nextInt();


            while (i<=num1 && i<=num2 ){
                  if(num1 % i ==0 && num2 % i==0 ) {
                    ebob = i;
                }
                i++;
            }

            System.out.println("EBOB: "+ebob);

       while (i<=(num1*num2) ){
        if(i % num1 ==0 && i % num2 ==0 ) {
               ekok = i;
               break;
           }
           i++;
       }

       System.out.println("EKOK: "+ekok);
 }
}
