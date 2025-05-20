
public class gcdNo {
    public static void main(String[] args) {
        int a=36;
        int b=60;
        int rs=gcd(a,b);
        System.out.println("result : "+rs);
        
    }   
    public static int gcd(int num1,int num2){
        
        while(num2!=0){
            int temp=num2;
            num2= num1%num2;
            num1=temp;
        }
        return num1;
    }
}
