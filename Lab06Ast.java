// Lab06Ast.java
// The First Bank Program
// Object Methods and Output Formatting
// This is the student, starting version of Lab 06A.

import java.text.DecimalFormat;

public class Lab06Ast
{
    public static void main(String args[])
    {
      // Create DecimalFormat and Bank Objects
      DecimalFormat money = new DecimalFormat("$00,000.00");
      Bank tom  = new Bank();
      Bank suzy = new Bank(1600,32000);
      Bank bill = new Bank(8000,Expo.random(20000,90000));

      // Display Initial Balances
      System.out.println("INITIAL BALANCES:");
      System.out.print("Tom's cheking balance:");
      System.out.println(money.format(tom.getChecking()));
      System.out.print("Tom's savings balance:");
      System.out.println(money.format(tom.getSavings()));
      System.out.print("Suzy's checking balance:");
      System.out.println(money.format(suzy.getChecking()));
      System.out.print("Suzy's savings balance:");
      System.out.println(money.format(suzy.getSavings()));
      System.out.print("Bill's checking balance:");
      System.out.println(money.format(bill.getChecking()));
      System.out.print("Bill's savings balance:");
      System.out.println(money.format(bill.getSavings()));
      System.out.println();
      // Deposits and Withdrawals
      tom.checkingDeposit(500.0);
      tom.savingsDeposit(7000.0);
      bill.checkingWithdrawal(8000.0);
      suzy.savingsWithdrawal(20000);
      suzy.checkingDeposit(20000);
      bill.savingsWithdrawal(bill.getSavings());
      





      // Display Final Balances
      System.out.println("FINAL BALANCES:");
      System.out.print("Tom's cheking balance:");
      System.out.println(money.format(tom.getChecking()));
      System.out.print("Tom's savings balance:");
      System.out.println(money.format(tom.getSavings()));
      System.out.print("Suzy's checking balance:");
      System.out.println(money.format(suzy.getChecking()));
      System.out.print("Suzy's savings balance:");
      System.out.println(money.format(suzy.getSavings()));
      System.out.print("Bill's checking balance:");
      System.out.println(money.format(bill.getChecking()));
      System.out.print("Bill's savings balance:");
      System.out.println(money.format(bill.getSavings()));







    }
}
