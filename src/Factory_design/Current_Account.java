/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory_design;

import java.util.Scanner;

/**
 *
 * @author Syed Iqbal
 */
public class Current_Account implements Account {

    Scanner input = new Scanner(System.in);
    int balance = 40000;

    public void withdraw() {
        System.out.println("\n----------------------");
        System.out.println("CURRENT ACCOUNT WITHDRAW");
        System.out.println("-------------------------");
        System.out.println("ENTER AMOUNT TO WITHDRAW:");
        int withdraw = input.nextInt();
        if (balance > withdraw) {
            balance = balance - withdraw;
            System.out.println("YOUR REMAINING BALANCE IS: " + balance);
        } else {
            System.out.println("YOU ENTER MORE AMOUNT THAN YOUR BALANCE:");
        }

    }

    public void deposite() {
        System.out.println("\n-----------------------");
        System.out.println("CURRENT ACCOUNT DEPOSITE");
        System.out.println("--------------------------");
        System.out.println("ENTER AMOUNT TO WITHDRAW:");
        int deposite = input.nextInt();
        balance = balance + deposite;
        System.out.println("YOUR REMAINING BALANCE IS: " + balance);

    }

}
