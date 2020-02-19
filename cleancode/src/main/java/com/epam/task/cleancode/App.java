package com.epam.task.cleancode;


/**
 * Hello world!
 *
 */
import java.io.*;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.print("Enter principle: ");
    	 double principle=sc.nextInt();
    	 System.out.print("Enter rate: ");
    	 double rate=sc.nextInt();
    	 System.out.print("Enter time: ");
    	 double time=sc.nextInt();
         Simpleinterest sinterestobj=new Simpleinterest(principle,rate,time);
         double val=sinterestobj.getinterest();
         System.out.print("SimpleInterest is: ");
         System.out.println((float)val);
         Compoundinterest cinterestobj=new Compoundinterest(principle,rate,time);
         double compoundinterestvalue=cinterestobj.getinterest();
         System.out.print("CompoundInterest is: ");
         System.out.println((float)compoundinterestvalue);
         Construction c=new Construction();
         System.out.println("Enter Area ofthe house: ");
         double area=sc.nextDouble();
         System.out.print("1200INR if we use standard materials\n"+"1500INR if we use above standard materials\n"+"1800INR  for high standard material\n"
         +"2500INR for high standard material and fully automated home\n");
         System.out.print("Enter the type:\n"+"1.standard\n"+"2.Above standard\n"+"3.High standard\n"+"4.High standard and fully automated home\n");
         int option=sc.nextInt();
         if(option<1 || option>4)
         System.out.print("Select valid option from the list\n");
         else
         System.out.println((int)(Math.ceil(c.getcost(option,area)))+":is the Cost for construction");
  
    }
}