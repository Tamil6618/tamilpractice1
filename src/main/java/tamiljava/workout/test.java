package tamiljava.workout;
import java.util.Scanner;
public class test 

{
public static void main(String[] args) {
    

    Scanner scan=new Scanner(System.in);
    double balance=10000;
    String cond ;
    System.out.println("which proces do you choose \n withdraw \n balance check \n depoisit");
    cond=scan.nextLine();
    switch (cond) {
        case "withdraw":
        System.out.println("enter amout you need");
        int withdraw=scan.nextInt();
        if (balance>=withdraw) 
        {
            balance-=withdraw;
            System.out.println("withdraw succesfully");

            
        }
        else
        {
            System.out.println("insufficient balance");
        }
        System.out.println("your current balance is"+balance);
            break;

        case "deposite":
        System.out.println("enter your amout in deposit");
        int deposite=scan.nextInt();
        balance+=deposite;
        System.out.println("your amout is depositted"+deposite);
        System.out.println("your current balance is "+balance);


        break;
        case "balance_check":
        System.out.println("current balance is"+balance);

        break;

    
        default:
        System.out.println("insufficient funds");
            break;
    }


}
    
}
