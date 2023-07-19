/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumber;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Jatin
 */
public class RandomNumber {

    /**
     * @param args the command line arguments dummy commit
     */
    public static void main(String[] args) {
        
        ArrayList rand_number= new ArrayList(4);
        Random random= new Random();
        
        for (int i=1; i<=4; i++){
            int randomNum= random.nextInt(10)+1;
            //skipping number if already in list
            try{
            if (rand_number.contains(randomNum))
            {
                System.out.println("Number "+ randomNum + " repeated. So not adding it to list again.\n");
                throw new Exception();
            }
            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
                i--;
                continue;
                
            }
            rand_number.add(randomNum);
            
        }
        System.out.println(rand_number);
        //System.out.println(rand_numbers.size());
    }    
}
