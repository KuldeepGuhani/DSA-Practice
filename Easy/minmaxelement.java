
public class minmaxelement {

    public static void main(String[] args) {


    int [] arr={1,5,2,4,8,9,54};
    int min=arr[0],max=arr[0];
    for(int i=0;i<arr.length-1;i++){
       if(arr[i]>max){
           max=arr[i];
       }else if(arr[i]<min){
           min=arr[i];
       }
    }
    System.out.println("max: "+max);
    System.out.println("max: "+min);
        
  //optimze using divide and conquer                
        
    }
}
