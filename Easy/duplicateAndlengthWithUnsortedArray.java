import java.util.HashSet;
import java.util.LinkedHashSet;
public class duplicateAndlengthWithUnsortedArray {

    public static void main(String[] args) {
    int[] nums = {4, 2, 4, 5, 2, 3, 1};
    int[] unique = duplicateAndlengthunsoreted(nums);

        System.out.print("Array after removing duplicates: ");
        for (int num : unique) {
            System.out.print(num + " ");
        }
        
    }
   
    
    public static int[] duplicateAndlengthunsoreted(int []nums){
        HashSet<Integer> hashset=new LinkedHashSet<>();
        
        for(int val:nums){
            hashset.add(val);
        }
        
        int result[]=new int[hashset.size()];
        int i=0;
        for(int res:hashset){
            result[i++]=res;
        }
        
        
        return result;
    }
    
    
        
}
