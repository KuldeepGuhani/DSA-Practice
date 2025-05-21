
public class frequencyOfAnEle {

    public static void main(String[] args) {
        //Frequency of each element in array TC=0(N^2) and SC=0(1).

        int arr[] = {1, 2, 2, 3, 1, 4, 1};
        int l = arr.length - 1;
        for (int i = 0; i <= l; i++) {
            int count = 1;
            for (int j = i + 1; j <= l; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = arr[l];// place last ele to found index.
                    j--;//recheck last ele
                    l--;//no use of checking last ele (eleminate last index)
                }
           }
            System.out.println("arr of i " + arr[i] + " is frequency of " + count);
        }


//        OPTIMIZE USING HASHMAP BY CHECKING IT'S FREQUENCY[O(n)/O{N}]

    }
}

