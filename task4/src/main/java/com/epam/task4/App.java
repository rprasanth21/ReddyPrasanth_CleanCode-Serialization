package com.epam.task4;

import java.util.Scanner;
import java.io.PrintStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;

public class App {
	static double principalAmount,time,rateOfInterest,simpleInterest,compoundInterest,numberOfCompoundings_PerAnnum;static Scanner input;
	public static double calSimpleInterest()
	{
	input=new Scanner(System.in);
	PrintStream myout = new PrintStream(new FileOutputStream(FileDescriptor.out));
		myout.print("Enter Principal Amount:\n");
		principalAmount=input.nextDouble();
		myout.print("Enter the Number of Years:\n");
		time=input.nextDouble();
	     myout.print("Enter Rate Of Interest:\n");
		rateOfInterest=input.nextDouble();
		SimpleInterest simpleObj=new SimpleInterest();
		simpleInterest=simpleObj.calculate_Simple_Interest(principalAmount,time,rateOfInterest);
	
		return simpleInterest;
		}
	public static double calCompoundInterest()
	{
		input=new Scanner(System.in);
		System.out.format("%s","Enter the Principal Amount:\n");
		principalAmount=input.nextDouble();
		System.out.format("%s","Enter the Number of Years\n");
		time=input.nextDouble();
		System.out.format("%s","Enter the Rate Of Interest:\n");
		rateOfInterest=input.nextDouble();
		System.out.format("%s","Specify Compound Interval in Years Format:\n");
		numberOfCompoundings_PerAnnum=input.nextDouble();
		CompoundInterest compoundObj=new CompoundInterest();
		compoundInterest=compoundObj.calculate_Compound_Interest(principalAmount,time,rateOfInterest,numberOfCompoundings_PerAnnum);
		return compoundInterest;
	}
	
	
	public static void main(String args[]) {
		System.out.format("%s","Enter \'simple\' for simple interest or \'compound\' for compound interest:\n");
		input=new Scanner(System.in);
		String ch=input.nextLine();
		switch(ch)
		{
			case "simple":
			System.out.format("%.4f",calSimpleInterest());break;
			case "compound":
				System.out.format("%.4f",calCompoundInterest());break;
				default:
					System.out.format("%s","\nInvalid option");break;
					}
		
	}
	

}

