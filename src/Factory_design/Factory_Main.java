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
public class Factory_Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your choice:");
        String ch=input.nextLine();
        Account a= Account_Factory.getAccount(ch);
        System.out.println(ch);
        a.deposite();
        a.withdraw();
        
    }
    
}
