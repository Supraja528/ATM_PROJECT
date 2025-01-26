package AtmProject;
import java.util.Scanner;

public class UserInterface {
    private static int status;
    public static void main(String[] args) {
        AtmOperationImplement impl=new AtmOperationImplement();
        Scanner scan =new Scanner(System.in);
        int atmNumber=123456;
        int atmPin=123;
        System.out.println("WELCOME TO THE ATM MACHINE");
        System.out.println("ENTER THE ATM NUMBER");
        int atmNumber2=scan.nextInt();
        System.out.println("ENTER THE ATM PIN");
        int atmPin2=scan.nextInt();
        if(atmNumber==atmNumber2 && atmPin==atmPin2){
            while (true) {
             System.out.println("1.viewAvailable\n 2.WithdrawAmount\n 3.DepositAmount\n 4.viewMiniStatement\n 5.exit");
             System.out.println("Enter the choice :");
             int ch=scan.nextInt();
             if(ch==1){
                   impl.viewBalance();
             }
             else if(ch==2){
                System.out.println("Enter the amount to withdraw");
                double withdrawAmount=scan.nextDouble();
                impl.withdrawAmount(withdrawAmount);
             }
             else if(ch==3){
                System.out.println("Enter the amount to deposit :");
                double depositAmount=scan.nextDouble();
                impl.depositAmount(depositAmount);
             }
             else if(ch==4){
             
                impl.viewMiniStatement();
             }
             else if(ch==5){
                System.out.println("Collect your ATM card\n Thank You");
                System.exit(status);
             }
            }
        }
        else{
            System.out.println("INCORRECT ATM NUMBER OR PIN");
        }
    }  
   
}
 
