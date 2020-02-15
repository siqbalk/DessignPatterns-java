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
public class SInglton_AMain {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Singlton_A obj1=Singlton_A.getObject();
        obj1.setId("12345");
        obj1.getName();
        obj1.setName("qwerty");
        obj1.getId();
        obj1.Login();
        
    
    
}
}
