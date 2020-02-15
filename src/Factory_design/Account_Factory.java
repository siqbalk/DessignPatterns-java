  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory_design;

/**
 *
 * @author Syed Iqbal
 */
public class Account_Factory {
    
    public static Account getAccount(String account){
        System.out.println(account);
        if(account=="saving"){
            return new Saving_Account();
        }
        else if(account=="current"){
            return new Current_Account();
        }
        return null;
    
    }
}
