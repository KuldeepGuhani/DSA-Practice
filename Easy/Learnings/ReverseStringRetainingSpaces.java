package Learnings;
/**
 *
 * @author kuldeep guhani
 * 
 */
public class ReverseStringRetainingSpaces {
    
    public static void main(String[] args) {
        String str=" Hello i am KD ";
        reverseString(str);
        
    }
    
    static void reverseString(String str){
        
        char input[]=str.toCharArray();
        char[] result=new char[input.length];
        
        for(int i=0;i<input.length;i++){
            if(input[i]==' '){
            result[i]=' ';
            }
        }
        int n=result.length-1;
        for(int i=0;i<input.length;i++){
            if(input[i]!=' '){
                if(result[n]==' '){
                    n--;
                }
                
                result[n]=input[i];
                n--;
            }
            
        }
        System.out.println("result"+String.valueOf(result));
        
    }
    
}
