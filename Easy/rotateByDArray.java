
public class rotateByDArray {

    public static void main(String[] args) {
    //Left Rotate Array by 1 Element TC=0(N * D) and SC=0(1).
    int []arr={1,2,3,4,5};
        int d=2;
        for(int i=0;i<d;i++){
            rotateByOne(arr);
        }
        for(int num:arr){
            System.out.print(" "+num+"    ");
        }
    
    }
    
    public static void rotateByOne(int[] arr) {
        int temp=arr[0];
     for(int i=0;i<arr.length-1;i++){    
         arr[i]=arr[i+1];
     }   
     arr[arr.length-1]=temp;
    }
    
    
    
}
