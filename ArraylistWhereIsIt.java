/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistwhereisit;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author kendrabooker
 */
public class ArraylistWhereIsIt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Integer> arrlist = new ArrayList<>();
        Scanner kb = new Scanner(System.in);
        Random r = new Random();
        
        do{
        
            Integer num = 1 + r.nextInt(49);
            arrlist.add(num);
        
        }while(arrlist.size() < 10);
        
        System.out.println(arrlist);
        
        System.out.print("Value to find: ");
        Integer input = kb.nextInt();
        
        if( arrlist.contains(input) ){
        
            System.out.println(input + " is in slot " + arrlist.indexOf(input));
        }else{
        
            System.out.println(input + " is not in ArrayList ");
        }
        
        
    }
    
}
