/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;
public class exception2 {
    public static void main(String[] args){
        int i=34;
        int j=0;
        int a[];
        a=new int[4];
        Scanner obj=new Scanner(System.in);
        String s;
        try
        {
            int k;
            k=i/j;
            
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            a[4]=10;
        }
        catch(ArrayIndexOutOfBoundsException c)
        {
            System.out.println(c);
            
        }
        try
        {
            int k=Integer.parseInt(obj.next());
            System.out.println(k);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        try
        {
            s=obj.next();
            String s1=s.substring(12);
            System.out.println(s1);
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        
        
    }
}
