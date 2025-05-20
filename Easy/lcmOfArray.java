

public class lcmOfArray {
    public static void main(String[] args) {
        int a=36;
        int b=60;
        int rs=gcd(a,b);
        int lcm=findlcm(a,b);
        System.out.println("result : "+rs);
        System.out.println("result LCM: "+lcm);
        int[] numbers = {4, 6, 8};  // Example: LCM(4, 6, 8)
        int result = findLCMofArray(numbers);
        System.out.println("Array LCM Result "+result);
        
    }   
    public static int findLCMofArray(int []numbers){
        
        int lcm=numbers[0];
        for(int i=1;i<numbers.length;i++){
            lcm=findlcm(lcm,numbers[i]);
        }
    
        
        return lcm;
    }
    public static int gcd(int num1,int num2){
        
        while(num2!=0){
            int temp=num2;
            num2= num1%num2;
            num1=temp;
        }
        return num1;
    }
    
    public static int findlcm(int num1,int num2){
        
          return (num1 * num2)/gcd(num1,num2);
    }
}


