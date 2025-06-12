/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learnings;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author root
 */
public class JavaOutputIntoFile {
    
    public static void main(String[] args) throws IOException {
        String message="Hello iam testing java output into File";
         PrintWriter out = new PrintWriter(new FileWriter("/root/Desktop/output.txt", true), true);
      out.write(message);
      out.close();
    }
    
}
