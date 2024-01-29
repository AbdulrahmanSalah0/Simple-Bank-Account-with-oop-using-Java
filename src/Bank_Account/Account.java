package Bank_Account;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Account {
    File Test = new File("Text.txt");
    protected String name ;
    protected int id ;
    protected double balance ;
    private double annualInterestRate ;
    private Date dateCreated ;
    private ArrayList<Transaction> transactions ;

    public Account() {
        this.name = "" ;
        this.id = 0 ;
        this.balance = 0 ;
        this.annualInterestRate = 0 ;
    }

    public Account(String name , int id , double balance , double annualInterestRate ){
        this.name = name ;
        this.id = id ;
        this.balance = balance ;
        this.annualInterestRate = annualInterestRate ;
        this.transactions = new ArrayList<Transaction>();

        dateCreated = new Date();
    }
    public boolean withdraw(double amount ){
        if(balance < amount) return false;
        balance -= amount ;
        this.transactions.add(new Transaction('w',amount,this.balance,"Amount has been withdrawn ="+amount));
        return true;
    }
    public void deposit(double amount ){
        balance += amount ;
        this.transactions.add(new Transaction('D',amount,this.balance,"Amount has been deposited ="+ amount));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void AccountFile() throws FileNotFoundException {
        if(Test.exists()){
            PrintWriter writer = new PrintWriter(Test);
            writer.println(toString());
            writer.close();

        }
        PrintWriter writer = new PrintWriter(Test);
        writer.println(toString());
        writer.close();
    }
    public void PrintAccountFile() throws FileNotFoundException {
        Scanner n = new Scanner(Test);
        while(n.hasNext()){
            System.out.println(n.nextLine());
        }
        n.close();

    }
    public String toString() {
        return "Account{" +
                "name=" + name +
                ",   id=" + id +
                ",  balance=" + balance +
                ",  annualInterestRate=" + annualInterestRate +
                ",  dateCreated=" + dateCreated +
                ", \n transactions=" +getTransactions() +
                '}';
    }

}
