
public class movesZerosToEnd {

  public static void main(String[] args) {
    //Moves Zero to End TC=0(N) and SC=0(1).
    int nonZero=0;
    int arr[]={0, 1, 0, 3, 12};
    for(int j=0;j < arr.length;j++){
        if(arr[j]!=0){
            arr[nonZero++]=arr[j];
        }
    }
    
    // Second pass: Fill the rest with zeros
    for (int i = nonZero; i < arr.length; i++) {
        arr[i] = 0;
    }
        
        // Print the updated array
    for (int num : arr) {
        System.out.print(num + " ");
    }
    
  }
}

