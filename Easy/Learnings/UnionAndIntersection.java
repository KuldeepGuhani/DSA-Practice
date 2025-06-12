package Learnings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author root
 */
public class UnionAndIntersection {
    
    public static void main(String[] args) {
        int arr1[] = {1, 3, 4, 5, 7};
        int arr2[] = {2, 3, 5, 6};
        uAndI(arr1,arr2);
    }
    
    static void uAndI(int[] arr,int[] arr2){
        
        List list =new ArrayList();
        
//        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr[i]==arr2[j]){
                    list.add(arr[i]);
                }
                    
            }
        }
       System.out.println("Intersection : "+list);
       
//       HashSet<Integer> list2 =new HashSet<>();
//       
//       for(int i=0;i<arr.length;i++){
//         list2.add(arr[i]);
//           System.out.println("list 1"+list2);
//        }
//       
//       for(int j=0;j<arr2.length;j++){
//           list2.add(arr[j]);
//           System.out.println("list 2"+list2);      
//        }
//        System.out.println("UNION : "+list2);
//    }
//    
    }
    
}
