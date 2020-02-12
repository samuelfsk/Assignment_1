/*
 * name: samuel Hailemichael
 * Assignment_1.java
 * date: feb 10, 2020
 */
import java.util.Scanner;

public class WindChill {

public static void main(String[] args) {
	final double CONSTANT_1=35.74;
	final double CONSTANT_2=0.625;
	final double CONSTANT_3=35.75;
	final double CONSTANT_4=0.4275;
	final double CONSTANT_5=0.16;
	double outsideTemp;
	double windSpeed;
	double windChill;
	    System.out.println("This program calculates the Windchill for a given Temprature and windspeed.");
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the outside Temprature in Fahrenheit(must be >=-40 and <=40): ");
	    outsideTemp= input.nextDouble();
	System.out.println("Enter the wind speed(must be >=5 and <=60): ");
	    windSpeed=input.nextDouble();
	
	
	 //Wind Chill (oF) = 35.74 + 0.6215T - 35.75(V0.16) + 0.4275T(V0.16)
	windChill = CONSTANT_1 + (CONSTANT_2*outsideTemp) - CONSTANT_3*( Math.pow(windSpeed,CONSTANT_5)) +CONSTANT_4*outsideTemp*(Math.pow(windSpeed,CONSTANT_5));
	
         System.out.println("The wind chill for the given Temprature and wind speed is "+windChill + " degree fahrenheit.");
         
         System.out.println("programmer: Samuel Hailemichael");
  input.close();
	
	}

}
