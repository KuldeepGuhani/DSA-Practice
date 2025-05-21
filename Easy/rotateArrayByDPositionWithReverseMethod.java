
import java.util.Arrays;
import java.util.Scanner;

public class rotateArrayByDPositionWithReverseMethod {

    public static void main(String[] args) {
        //Left Rotate Array by 1 Element TC=0(N) and SC=0(1).

        do {
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

            System.out.println(Arrays.toString(arr));
            System.out.println(""
                    + "give d");
            Scanner sc = new Scanner(System.in);
            int d = sc.nextInt();

//            for (int i = 0; i < d; i++) {
            int s = 0, e = d - 1;
            while (s < e) {

                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
            System.out.println(Arrays.toString(arr));

            int i = d, j = arr.length - 1;
            while (i < j) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;

                j--;
            }
            System.out.println(Arrays.toString(arr));
            int m = 0, n = arr.length - 1;
            while (m < n) {
                int temp = arr[m];
                arr[m] = arr[n];
                arr[n] = temp;
                m++;
                n--;
            }

            System.out.println(Arrays.toString(arr));
        } while (true);
    }

}

