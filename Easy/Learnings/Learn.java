/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learnings;

import java.lang.reflect.Array;

/**
 *
 * @author root
 */
public class Learn {
// 
//    public static void main(String[] args) {
//        String mskNum="8745128745";
//        System.out.println("PRINT MASK ING NO :::::::::::: \n\n\n"+maskNumber(mskNum));
//    }
// 
    public static void main(String[] args) {
        String name="kuldeep Guhani";
        char ch='A';
        for(int i=0;i<name.length();i++){
            
            System.out.print(" "+name.charAt(i)+" ");    
        }
    }
    
    
   private static String maskNumber(String number){
    number=number.trim();
       System.out.println("number::: "+number);
    if(number.equals("")){ System.out.println("true :::: "); return number;}
    String _return="";
    if(number.length()==1){ _return="XX"+number.substring(number.length()-1); System.out.println("return 1"+_return);}
    else if(number.length()==2){ _return="XX"+number.substring(number.length()-2);System.out.println("return 2"+_return);}
    else if(number.length()<=5){ _return=number.substring(0,number.length()-6)+"XX XXX ";System.out.println("return 3"+_return);}
    else {  _return=number.substring(0,number.length()-6)+"XXXXXX";System.out.println("return 4"+_return);}
    return _return;
  }
}
