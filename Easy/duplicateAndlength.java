public class duplicateAndlength {

    public static void main(String[] args) {
     int arr[]={1, 1, 2, 2, 3, 4, 4};
     
     int length=duplicateAndlength(arr);
     for(int i=0;i<length;i++ ){
         System.out.print(" "+arr[i]);
     }
        System.out.println();
        System.out.println(" LENGTH:  "+length);
    }
    
    public static int duplicateAndlength(int []nums){
         int i=0;
         for(int j=1;j<nums.length;j++){
             if(nums[i]!=nums[j]){
                 i++;
                 nums[i]=nums[j];
             }
         }
         
         return i+1;
    }
}
