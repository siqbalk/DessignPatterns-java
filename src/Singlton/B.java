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
public class B extends Thread {
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("THREADING 2");
            try{
               Thread.sleep(1000);
            }
            catch(Exception e){
                
            }
        }
    }
    
}
