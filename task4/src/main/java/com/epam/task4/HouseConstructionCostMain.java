package com.epam.task4;
import java.util.Scanner;
public class HouseConstructionCostMain{
	static String material;
	static boolean is_automated;
	static int area;
	static Scanner input;
	public static void main(String[] args) {
		input=new Scanner(System.in);
		System.out.format("%s","Enter Material Type (Standard,Above,High):-");material=input.next();
		System.out.format("%s","Enter Area of house in square feets :-");area=input.nextInt();
		System.out.format("%s","Enter Is House should beFully automated  home or not (true,false):-");is_automated=input.nextBoolean();
		HouseConstruction_Cost obj=new HouseConstruction_Cost();
		System.out.format("Overall Estimation Cost for House Construction is:-%d",obj.costEstimation(material,area,is_automated));

}
}
