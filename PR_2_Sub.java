import java.util.*;
import java.sql.Date;
class account{

    int id;
    double balance;
    double annual_interest=7;
    String date = "01-08-2022";
    double monthly_interest;
    double monthly_interest_rate;

    account()
    {
        id = 0;
        balance = 500;
    }
    account(int a,double b)
    {
        id = a;
        balance = b;
    }
    public double getAnnual_interest() {
        return annual_interest;
    }
    public double getBalance() {
        return balance;
    }
    public Date getDate() {
        return date;
    }
    public int getId() {
        return id;
    }
    public void setAnnual_interest(double annual_interest) {
        this.annual_interest = annual_interest;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void interest_rate()
    { 
        monthly_interest_rate=annual_interest/12;
        System.out.println("Monthly Interest Rate = "+monthly_interest_rate);
    }
    public void interest()
    {
        monthly_interest = (monthly_interest_rate*balance)/100;
        System.out.println("Monthly interest = "+monthly_interest);
    }
    public void widraw(double c)
    {
        balance = balance - c;
        System.out.println("New Blanace = "+balance);
    }
    public void deposite(double d)
    {
        balance = balance + d;
        System.out.println("New Balance = "+balance);
    }
    public void details()
    {
        System.out.println("Account id = "+id);
        System.out.println("Account Balance = "+balance);
        interest_rate();
        interest();
        System.out.println(date);
    }

}

