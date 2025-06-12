/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learnings;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author root
 */
public class multipleChararcterInString {
    public static void main(String[] args) {
        String str="abcdbcdacda"; 
    
        System.out.println(printCharMultiple(str));
    }
    
    static char printCharMultiple(String str){
        
        HashMap<Character,Integer> hmap=new HashMap<>();
        char[] arr=str.toCharArray();
        
        for(char chwq:arr){
             if(hmap.containsKey(chwq)){
                 hmap.put(chwq,hmap.get(chwq)+1 );
             }else{
                 hmap.put(chwq,1);
             }
            
        }
        
        int maxcount=0;
        char maxchar='A';
        for(Map.Entry map:hmap.entrySet()){
            if(maxcount < (int)map.getValue()){
                maxcount=(int)map.getValue();
                maxchar=(char)map.getKey();
            }
        }
        return maxchar;
    }
    
}
