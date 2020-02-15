/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singlton;

import java.util.Scanner;

/**
 *
 * @author Syed Iqbal
 */
public class Singlton_A {

    Scanner input = new Scanner(System.in);
    static Singlton_A obj = new Singlton_A();
    private Singlton_A() {

    }

    public static Singlton_A getObject() {
        if(obj==null){
       
        }
         return obj;
    }
    int count = 0;
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    
    }

    public void Login() {

        while (true) {
            System.out.println("ENTER USERNAME:");
            String user_name = input.next();
            System.out.println("ENTER PASSWORD:");
            String pass = input.next();

            if ((user_name.equals(name)) && pass.equals(id)) {
                System.out.println("\t\t\t\t---------------------");
                System.out.println("\t\t\t\tSUCCESSFULLY LOGIN...");
                System.out.println("\t\t\t\tWELCOME TO SITE");
                System.out.println("\t\t\t\t----------------------");
                break;
            } else {
                count++;
                System.out.println("\t\t\t\t-------------------------");
                System.out.println("\t\t\t\tWRONG ENTRY TRY AGAIN....");
                System.out.println("\t\t\t\t-------------------------");
            }
            if (count > 5) {
                System.out.println("\n\t\t\t============================================================================");
                System.out.println("\t\t\t   YOU ENTER WRONG PASSWORD MORE THAN 5 TIME....TRY AFTER A FEW MINUTE.....");
                System.out.println("\t\t\t============================================================================");
                break;
            }
        }

    }

}
