

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class replaceEleByItsRankByHashmap {

    public static void main(String[] args) {
        //int[] arr = {100, 100, 100};
         int[] arr = {37, 12, 28, 9, 100, 56, 80, 5, 12};
        //int[] arr = {30, 20, 10, 40};
        
        //System.out.println(Arrays.toString(replaceEleByItsRank(arr)));
        System.out.println(Arrays.toString(replaceEleByItsRankByHashmap(arr)));
    }

    public static int[] replaceEleByItsRank(int[] arr) {
        int result[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }

            }
            result[i] = count;

        }

        return result;
    } //TC=0(N^2). SC=0(N) for result array.

    public static int[] replaceEleByItsRankByHashmap(int[] arr) {

        int[] result=new int[arr.length];
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int rank=1;
        Arrays.sort(arr);
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]+" ");
        }
        System.out.print("]");
        System.out.println();
        
        for(int num:arr){
            if(!hashmap.containsKey(num)){
                hashmap.put(num, rank++);
            }
        }

        for(int i=0;i<arr.length;i++){
            result[i]=hashmap.get(arr[i]);
        }
        return result;
    } //TC=0(N LOGN) SC=0(N) for result array.

}

