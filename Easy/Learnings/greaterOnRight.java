/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learnings;

/**
 *
 * @author root
 */
public class greaterOnRight {
    
    public static void main(String[] args) {
        int N = 6;
        int Arr[] = {16, 17, 4, 3, 5, 2};
        nextGreatest(Arr, N);
        for(int i=0;i<N;i++){
            System.out.print(" "+Arr[i]);
        }
    }
   static void nextGreatest(int arr[], int n) {
        // code here
        int max = -1;
        int temp=0;
        for(int i=n-1;i>=0;i--){
            temp = arr[i];//t=2,t=5,t=3
            arr[i] = max;//2=1,5=2,3=5
            max = Math.max(temp,max);//2,5,5
         
        }
    }
}
