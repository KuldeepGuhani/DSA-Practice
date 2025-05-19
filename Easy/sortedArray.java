public class sortedArray {

    public static void main(String[] args) {
        int[] inArr = {1, 2, 3, 41, 5};  // Change this to test other cases
        boolean isSort=true;
        for (int i = 0; i < inArr.length - 1; i++) {
            //System.out.println("checking for ele:::" + inArr[i] + "  and " + inArr[i + 1]);
            if (inArr[i] > inArr[i + 1]) {
                System.out.println("arr is not sorted at index::" + i);
                isSort = false;
                break;
            } else {
                continue;
            }
        }

        if (isSort) {
            System.out.println("arr is sorted in non decreasing");
        }

        
    }

}
