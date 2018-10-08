//Colin Lesser
//Bank Deposit App to generate digital deposit slips

import java.util.Scanner; //import Scanner class
public class BankDeposit
{
   public static void main(String[] args)
   {
      System.out.println("Bank Deposit app to calculate total dollar amount and produces a digital deposit slip\n"); //welcome user
      
      Scanner sc = new Scanner(System.in); //declare Scanner class
      
      System.out.println("Date: "); //ask user for date and store it to print in the output statement
      String date = sc.nextLine();

      int total = 0; //declare grand total variable
      int cashTotal = cash(); //declare variable to return method
      int checkTotal = check(); //dclare variable to return method
      String address = "**ENTER ADDRESS**";
      String accountNum = "**ENTER ACCOUNT NUMBER**";
      
      total = cashTotal + checkTotal; //add together cash and checks to get grand total
      
      System.out.println("Date: " + date + "\nAccount Number: " + accountNum + "\nAddress: " + address + "\nCash Total: " + 
                        cashTotal + "\nCheck Total: " + checkTotal + "\nTotal: " + total); //print output
   }
    
   //method to calculate total cash amounts to be deposited
   public static int cash()
   {
      int n1 = 0;
      Scanner sc = new Scanner(System.in);
      
      //user inputs how many of each bill they have
      System.out.println("Number of 1 dollar bills: ");
      int one = sc.nextInt();
      
      System.out.println("Number of 5 dollar bills: ");
      int five = sc.nextInt();
      
      System.out.println("Number of 10 dollar bills: ");
      int ten = sc.nextInt();
      
      System.out.println("Number of 20 dollar bills: ");
      int twenty = sc.nextInt();
      
      System.out.println("Number of 50 dollar bills: ");
      int fifty = sc.nextInt();
      
      System.out.println("Number of 100 dollar bills: ");
      int hundred = sc.nextInt();
      
      //declare variables to give weight to input from user
      int oneTotal = 1 * one;
      int fiveTotal = 5 * five;
      int tenTotal = 10 * ten;
      int twentyTotal = 20 * twenty;
      int fiftyTotal = 50 * fifty;
      int hundredTotal = 100 * hundred;
      
      n1 = oneTotal + fiveTotal + tenTotal + twentyTotal + fiftyTotal + hundredTotal; //add cash together
      return n1;
   }
   
   //method to calculate to total check amount to be deposited
   public static int check()
   {
      int n2 = 0;
      Scanner sc = new Scanner(System.in);
      
      System.out.println("How many checks?"); //ask user how many checks they have to create array size
      int num = sc.nextInt();
      
      //declare array to store check amounts
      int[] checkArray = new int[num];
      
      System.out.println("Enter check amounts: ");
      
      //for loop to take user's input for check amounts
      for(int i = 0; i < checkArray.length; i++)
         checkArray[i] = sc.nextInt();
      
      //for loop calculates total for user's check amounts
      for(int i = 0; i < checkArray.length; i++)
         n2 = n2 + checkArray[i];
      
      return n2;
   }
}
      
      