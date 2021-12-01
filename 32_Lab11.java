package com.company;
import java.util.*;

class OutOfRange extends Exception{
    int num;
    OutOfRange(int a){
        num = a;
    }

    public String toString()
    {
        return ("num is out of range: "+ num);
    }

}

class Main{

    void test(int num)
    {
        try{
            if(num<0||num>10)
                throw new OutOfRange(num);

            System.out.println();
            System.out.print("num square is: ");
            System.out.println( num*num);
        }
        catch(OutOfRange u)
        {
            System.out.println("Out of range ");
            u.printStackTrace();
            System.out.println("This num is not eligible");
            System.exit(0);
        }
        System.out.println("This num is eligible ");
    }

    public static void main(String args[])
    {
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER : ");
        num = sc.nextInt();

        Main e = new Main();
        e.test(num);
    }
}





package com.company;
import java.io.*;
import java.util.Scanner;
class IsNum extends Exception{

    public String toString()
    {
        return ("number is not valid it should be an integer : ");
    }

}

class Main{

    void test(int num1,int num2)
    {
        try{

            int res=num1/num2;
            System.out.println();
            System.out.print("        num1/num2 is: ");
            System.out.println(res);
        }
        catch(ArithmeticException e)
        {
            System.out.println(" can't divide by zero "+e);
        }

    }

    public static void main(String args[])
    {
        int num1=0,num2=0;

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE NUMBERS : ");
        try
        {
            if(sc.hasNextInt())
            {
                num1=sc.nextInt();
            }
            else
            {
                throw new IsNum();
            }
            if(sc.hasNextInt())
            {
                num2=sc.nextInt();
            }
            else
            {
                throw new IsNum();
            }
        }

        catch(IsNum u)
        {
            System.out.println(" INVALID ");
            u.printStackTrace();
            System.out.println("his number is not entered");
            System.exit(0);
        }

        System.out.println("numbers are entered ");
        Main e = new Main();
        e.test(num1,num2);
    }
}
