/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singlton;

/**
 *
 * @author Syed Iqbal
 */
public class Main {
    public static void main(String[] args){
        A a=new A();
        B b=new B();
        a.start();
        b.start();
        
    }
    
}
