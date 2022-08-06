//this program is prepared by 21ce013 Abhi Bhimani
//Design a class named Account that contains:
//•	A private int data field named id for the account (default 0).
//•	A private double data field named balance for the account (default 500₹).
//•	A private double data field named annualInterestRate that stores the current interest rate (default 7%). Assume all accounts have the same interest rate.
//•	A private Date data field named dateCreated that stores the date when the account was created.
//•	A no-arg constructor that creates a default account.
//•	A constructor that creates an account with the specified id and initial balance.
//•	The accessor and mutator methods for id, balance, and annualInterestRate.
//•	The accessor method for dateCreated.
//•	A method named getMonthlyInterestRate() that returns the monthly interest rate.
//•	A method named getMonthlyInterest() that returns the monthly interest.
//•	A method named withdraw that withdraws a specified amount from the account.
//•	A method named deposit that deposits a specified amount to the account.
// // GITHUB LINK : https://github.com/abhii14758/-JAVA-PRACTICAL-FILE-2
import java.util.*;
public class PR_2_Main{
    public static void main(String[] args) {
        
        int c;
        double d,w;
        Scanner s = new Scanner(System.in);
        account a = new account(1,10000);
        
        System.out.println("Enter 1 For Deposite ");
        System.out.println("Enter 2 For Widraw ");
        System.out.println("Enter 3 For Account Details ");
        c = s.nextInt();
        
        if(c ==1)
        {
            System.out.print("Enter Ammount To Deposite: ");
            d = s.nextDouble();
            a.deposite(d);
            a.details();
        }
        else if(c==2)
        {
            System.out.print("Enter Ammount To Widraw: ");
            w = s.nextDouble();
            a.widraw(w);
            a.details();
        }
        else if(c==3)
        {
            a.details();
        }
    }
}
