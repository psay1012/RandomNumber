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
 * @author Pooja
 */
public class RandomNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList rand_numbers= new ArrayList(4);
        Random random= new Random();
        
        for (int i=1; i<=4; i++){
            int rand= random.nextInt(10)+1;
            //skipping number if already in list
            try{
            if (rand_numbers.contains(rand))
            {
                System.out.println("Number "+ rand + " repeated. So not adding it to list again.\n");
                throw new Exception();
            }
            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
                i--;
                continue;
                
            }
            rand_numbers.add(rand);
            
        }
        System.out.println(rand_numbers);
        //System.out.println(rand_numbers.size());
    }    
}
