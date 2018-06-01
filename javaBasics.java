package javaBasic;

import java.util.Scanner;

public class simpleConverter {
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		double number =  sc.nextDouble();
		String from = sc.next();
		String to = sc.next();
		double result = 0 ;
		switch (from)
		{
		case("mm"):
		{
			result = number * 0.001;
			break;
		}
		
		case("cm"):
		{
			result = number * 0.01;
			break;
		}
		
		case("mi"):
		{
			result = number * 1609.344;
			break;
			
		}
		case("in"):
		{
			result = number * 0.0254;
			break;
		}
		case("km"):
		{
			result = number * 1000;
			break;
		}
		case("ft"):
		{
			result = number * 0.3048;
			break;
			
		}
		case("yd"):
		{
			result = number * 0.9144 ;
			break;
		}
		case("m") :
			{
			result = number ;
			}
				}
		
		switch(to)
		{
		case("mm"):
		{
			result = result * 1000;
			break;
		}
		case("cm"):
		{
			result = result * 100;
			break;
		}
		case("mi"):
		{
			result = result * 0.000621371192;
			break;
			
		}
		case("in"):
		{
			result = result * 39.3700787;
			break;
		}
		case("km"):
		{
			result = result * 0.001;
			break;
		}
		case("ft"):
		{
			result = result * 3.2808399;
			break;
		}
		case("yd"):
		{
			result = result * 1.0936133;
			break;
		}
		
		
		
		
		}
		
		
		System.out.format("%.8f", result);
		
		
		
		
		
		
	}

}
