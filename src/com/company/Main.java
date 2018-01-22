package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in;
        // We are going to start working with Bank Accounts, the concept of
        // 'Object Orientated Programming"//.

        // build a //bank account class// that contains different pieces of information.
        // The account should house a//Bank Account Class= "Bank Account Number",
        // "Account Holder Name", and "Balance".

        // three member fields should be set in the constructor method, using arguments
        // to set the values.//

        // //two methods named "Withdraw" and "Deposit".// Withdraw deducts money from the
        // account, deposit adds money to the account. //Both of the methods should
        // accept an argument to altar the account.
        //
        //From the main application file, create a bank account for everyone in class.
        //Then deposit $57,000 (the average starting salary of a developer).
        // Log out the balance of each account.


        System.out.println("Welcome to Bank of Java, Clients Account Statement");

      //  Wrong
     // Boolean ask = true;
      // while (ask) {
       /*     System.out.println("Enter Client's First Name");
            Scanner sc = new Scanner(System.in);
            String firstName = sc.nextLine();
            System.out.println("Enter Client's Last Name");
            String lastName = sc.nextLine();
            System.out.println("Enter Client's Account Number");
            String accountNumb = sc.nextLine();
            System.out.println("Client's Salary");
         */   String salary = sc.nextLine();


Customer member1 = new Customer("Joan", 44556);


          //  customer1.salaryConverter();

            System.out.println("Would you like another Clients Statement?");
            Scanner sc2 = new Scanner(System.in);
            String usersAnswer = sc2.nextLine();

            if(usersAnswer.equalsIgnoreCase ("yes")) {
                ask = true;
            } else {
                ask = false;
            }

        } // While

    }  // Public

} // Main