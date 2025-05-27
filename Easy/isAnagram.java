
import java.util.Arrays;

public class isAnagram {

    public static void main(String[] args) {

////        String str1 = "abc";
////        String str2 = "bca";
        String str1 = "aab";
        String str2 = "abb";
        System.out.print("is Anagram : " + isAnagramUsingSorting(str1, str2));
        System.out.println();
    }
//
//    public static boolean isAnagram(String str1, String str2) {
//
////        What is an Anagram?
////        Two strings are anagrams if:
////        They contain the same characters
////        With the same frequency
////        In any order
//        char ch[] = str1.toCharArray();
//        char ch2[] = str2.toCharArray();
////          for(Character sr1:ch){
////            System.out.print(" "+sr1);
////          }
////          System.out.println();
////          for(Character sr2:ch2){
////            System.out.print(" "+sr2);
////          }    
//        for (int i = 0; i < ch.length; i++) {
//            int vst = 0;
//
//            for (int j = 0; j < ch2.length; j++) {
//
//                if (ch[i] == ch2[j]) {
//                    vst = 1;
//                }
//
//            }
//            if (1 != vst) {
//                return false;
//            }
//        }
//        return true;
//    }

    //SOLUTOINS : For checking if two strings are anagrams, including: ✅ Case-insensitive ✅ Ignoring spaces.
    
    public static boolean isAnagram(String str1,String str2){
        
        if(str1.length()!=str2.length()) return false;
        str2=str2.toLowerCase().replaceAll("\\s+", "");
        StringBuilder sb=new StringBuilder(str2);
        
        for(char ch:str1.toCharArray()){
            int index=sb.indexOf(String.valueOf(ch));//get's index of each and every characters. 
            if(index==-1){  // if character not found then return false.
                return false;
            }
            sb.deleteCharAt(index);//delete charcter from string builder.
        }
        
        
        return sb.length()==0; //if string builder have no charcter that mean strings are anagram.
    }
//TC=0(N^2).//traversing.
//SC=0(N). //using string builer.
    
    
    
    //using sorting.
        
    public static boolean isAnagramUsingSorting(String str1,String str2){
        if(str1.length()!=str2.length()) return false;
        str1=str1.toLowerCase().replaceAll("\\s+", "");
        str2=str2.toLowerCase().replaceAll("\\s+", "");
        
        char a1[]=str1.toCharArray();
        char a2[]=str2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        
        return Arrays.equals(a1, a2);//TC=0(nlogn).//sorting.
                                     //SC=0(N). //due to char array.
    

    }
    
    //using frequency array.
    public static boolean isAnagramUsingFreqreqArray(String str1,String str2){
        if(str1.length()!=str2.length()) return false;
        str1=str1.toLowerCase().replaceAll("\\s+", "");
        str2=str2.toLowerCase().replaceAll("\\s+", "");
        
        char a1[]=str1.toCharArray();
        char a2[]=str2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        
        return Arrays.equals(a1, a2);//TC=0(nlogn).//sorting.
                                     //SC=0(N). //due to char array.
    

    }

}

