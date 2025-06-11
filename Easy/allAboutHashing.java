package DSA_Learnig2025.Hashing;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Kuldeep Guhani
 * @Topic Basics All About Hashing.
 */
public class allAboutHashing {

    public static void main(String[] args) {

        int arr[] = {1, 2, 1, 3, 2};
        //intFetching(arr);
        String s = "abcdacbefcd";
        //characterFetching(s);
        // usingIntegerHashmap(arr);
        //usingCharacterHashmap(s);
        highestLowestFrequencyElementUsingHashArr(arr);
    }

    public static void intFetching(int arr[]) {

        int[] hashArr = new int[13];
        //Precompute/Precalculating.
        for (int i = 0; i < arr.length; i++) {
            hashArr[arr[i]] += 1;

        }
        //Fetching
        for (int num : hashArr) {
            System.out.print(" " + num + " ");
        }
        //TC=0(Q*N) precalculate and fetching. & SC=0(N) //hash array

    }

    public static void characterFetching(String str) { //lowercase character hasharray would be 26 fixed.

        int hashArr[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            hashArr[str.charAt(i) - 'a']++;
        }
        //Fetching
        for (int num : hashArr) {
            System.out.print(" " + num + " ");
        }

        //TC=0(Q*N) precalculate and fetching. & SC=0(N) //hash array
    }

    public static void usingIntegerHashmap(int[] arr) { //For numbers like 10^9,10^13,10^18. we can't use fixed array/hash array. In this case we use map datastructure in collection. for bigger input data use hashmap and use only it's just store the elements that are only required.
        Map<Integer, Integer> hashmap = new HashMap<>();

        //Pre-fetching.
        for (int num : arr) {
            hashmap.put(num, hashmap.getOrDefault(num, 0) + 1);
        }

        //Fetching.
        for (Map.Entry<Integer, Integer> map : hashmap.entrySet()) {
            System.out.println(" " + map.getKey() + " : " + map.getValue() + " "); //sorted order
        }
        //TC=0(N) & SC=0(N)
    }

    public static void usingCharacterHashmap(String str) { //For numbers like 10^9,10^13,10^18. we can't use fixed array/hash array. In this case we use map datastructure in collection. for bigger input data use hashmap and use only it's just store the elements that are only required.

        Map<Character, Integer> hashmap = new HashMap<>();

        //Pre-fetching.
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            hashmap.put(ch, hashmap.getOrDefault(ch, 0) + 1);

        }

        //Fetching.
        for (Map.Entry<Character, Integer> map : hashmap.entrySet()) {
            System.out.println(" " + map.getKey() + " : " + map.getValue() + " "); //sorted order
        }
        //TC=0(N) & SC=0(N)
    }

    public static void highestLowestFrequencyElementUsingHashArr(int[] arr) { //For numbers like 10^9,10^13,10^18. we can't use fixed array/hash array. In this case we use map datastructure in collection. for bigger input data use hashmap and use only it's just store the elements that are only required.

        int[] hashArr = new int[13];

        //Pre-fetching.
        int highest = Integer.MIN_VALUE;
        int highestEle = 0;
        int lowest = Integer.MAX_VALUE;
        int lowestEle = 0;
        
        for (int i = 0; i < arr.length; i++) {
            hashArr[arr[i]]++;
        }

        //Fetching
        for (int num : hashArr) {
            System.out.print(" " + num + " ");
        }

        for (int i = 0; i < hashArr.length; i++) {
            if (hashArr[i] > 0 && hashArr[i] > highest) {
                highest=hashArr[i];
                highestEle=i;
            }
            if (hashArr[i] > 0 && hashArr[i] < lowest) {
                lowest=hashArr[i];
                lowestEle=i;
            }
        }
        System.out.println();
        System.out.println("Highest ELE : "+highestEle+" Highest Freq : "+highest);
        System.out.println("Lowest ELE : "+lowestEle+" Lowest Freq : "+lowest);
    }
    //Time Complexity=O(N)
    //Space Complexity=O(1) 

}

