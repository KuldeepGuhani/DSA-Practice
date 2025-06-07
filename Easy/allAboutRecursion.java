
/**
 * ALL ABOUT RECURSION
 *
 * @author Kuldeep Guhani
 */
public class recursionSeries {

    public static void main(String[] args) {
        //printName(1, 4);//(i,n)
        //printing1toN(1, 50); //(i,n)
        //printingNto1Case2(5, 5); //(n,n)
        //System.out.println(sumOfNNaturalNo(6, 0));
        //System.out.println(sumOfNNaturalNoCase2(6));
        //System.out.println(factorialOfNo(3));

//reverse array start
//        int[] arr = {5, 4, 3, 2, 1};
//        int start = 0;
//        int n = 5;
//        int end = n - 1;
//        reverseArray(arr, start, end);
//        printArray(arr, n);
//        System.out.println();
//reverse array end.
        
       String s = "madam";
       System.out.println(palindrome(0,s));
    }

    static void printName(int i, int n) {

        if (i > n) {
            return;
        }

        System.out.println("KD RECURSIVLY PRINTING NAME .");
        printName(i + 1, n); //TC =0(N) for printing name n times. & SC =0(N) for recursive calls

    }

    static void printing1toN(int i, int n) {

        if (i > n) {
            return;
        }

        System.out.println("" + i);
        printing1toN(i + 1, n); //TC =0(N) for printing name n times. & SC =0(N) for recursive calls

    }

    static void printingNto1(int i, int n) {

        if (i > n) {
            return;
        }

        printingNto1(i + 1, n); //TC =0(N) for printing name n times. & SC =0(N) for recursive calls
        System.out.println("" + i);//backward direction recursion also called backtracking.
    }

    static void printingNto1Case2(int i, int n) {

        if (i < 1) {
            return;
        }

        System.out.println("" + i);
        printingNto1Case2(i - 1, n); //TC =0(N) for printing name n times. & SC =0(N) for recursive calls

    }

    static int sumOfNNaturalNo(int n, int sum) {
        if (n < 1) {
            return sum;
        }

        return sumOfNNaturalNo(n - 1, sum += n); //TC =0(N) for printing n times. & SC =0(N) for recursive calls
    }

    static int sumOfNNaturalNoCase2(int n) {
        if (n == 0) {
            return 0;
        }

        return n + sumOfNNaturalNoCase2(n - 1); //TC =0(N) for printing n times. & SC =0(N) for recursive calls
    }

    static int factorialOfNo(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorialOfNo(n - 1); //TC =0(N) for printing n times. & SC =0(N) for recursive calls
    }

    /**
     * Reverse array by swapping values by start with end and print array.
     * recursive call to swap and print .*
     */
    static void printArray(int[] arr, int n) {

        System.out.print("Reverse Array :");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }

    }

    static void reverseArray(int[] arr, int start, int end) {
        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArray(arr, start + 1, end - 1);
        }
    }

    
    
    /**
     * TC =0(N) (Precisely, O(N/2) as we compare the elements N/2 times and swap them) & SC =0(1)  { The elements of the given array are swapped in place so no extra space is required}..
     */
    static boolean palindrome(int i, String s){
        
            // Base Condition
            // If i exceeds half of the string, means all the elements 
            // are compared, we return true.
            if(i>=s.length()/2) return true;
            
            // If start is not equal to end, not palindrome.
            if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
            
            // If both characters are same, increment i and check start+1 and end-1.
            return palindrome(i+1,s);
    }

    
}

