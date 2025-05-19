public class reverseArray {

    public static void main(String[] args) {

//        int[] arr = {1, 5, 2, 4, 8, 9, 54};
//        for (int i = arr.length - 1; i >= 0; i--) {
//            System.out.print(" "+arr[i]);
//        }
        //IN-PLACE 2 POINTER  APPROACH OPTIMIZE USING THIRD VARIABLE TEMP.
        int[] arr = {1, 5, 2, 4, 8, 9, 54};
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for (int val : arr) {
            System.out.print(" " + val + " ");
        }

    }

}

