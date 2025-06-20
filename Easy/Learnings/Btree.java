package Learnings;

import java.util.ArrayList;

class Node{
        int data;
        Node left;
        Node right;
        
        public Node(int value){
            this.data=value;
            this.left=null;
            this.right=null;
        }
}

public class Btree {
    
  
    static void postOrder(Node curr,ArrayList<Integer> postArray){
        if(curr==null){ return;}
        
        postArray.add(curr.data);
        postOrder(curr.left, postArray);
        postOrder(curr.right, postArray);
        
        
        
    }
            
    public static void main(String[] args) {
       Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);
        
        ArrayList<Integer> postArray= new ArrayList<>();
        postOrder(root, postArray);
        
        
        for(int i=0;i<postArray.size();i++){
            System.out.print (" "+postArray.get(i)+"");
        }
        System.out.println();
    } 
}
