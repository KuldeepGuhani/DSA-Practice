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
public class RomanToInteger {
 
    public static void main(String[] args) {
        String str="XXIV";
    Map<Character, Integer> map=new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    
        int result=map.get(str.charAt(str.length()-1));
        
        for(int i=str.length()-2;i>=0;i--){
            if(map.get(str.charAt(i))< map.get(str.charAt(i+1))){
                result-=map.get(str.charAt(i));
            }else{
                result+=map.get(str.charAt(i));
            }
        }
        System.out.println("result "+result);
    }
    
}
