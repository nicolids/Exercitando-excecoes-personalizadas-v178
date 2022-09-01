import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner src= new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.println("Number: ");
            int number = src.nextInt();
            System.out.println("Holder:");
            String holder = src.next();
            System.out.println("Initial balance:");
            Double balance= src.nextDouble();
            System.out.println("Withdrawal limit:");
            Double wDl = src.nextDouble();
            Account account= new Account(number,holder,balance,wDl);


            System.out.println();
            System.out.println("Enter amount for withdrawal:");
            Double amount=src.nextDouble();
            account.withDraw(amount);
            Double newBalance= balance-amount;
            Double newWithDlimit= wDl - amount;
            System.out.println("New balance: $"+newBalance+ "  Remaining withdrawal limit: $"+newWithDlimit);

        }
        catch (AccountException e) {
            System.out.println("Withdrawal error: " +e.getMessage());;
        }
        catch (RuntimeException e){ // captura qualquer outro erro que não tenha sido levado em conta
            System.out.println("Unexpected error");
        }


    }
}
