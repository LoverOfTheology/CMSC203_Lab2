package SphereVolume;
import java.lang.Math;
import java.util.Scanner;
public class SphereVolume {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double radius, diameter, volume;
	System.out.print("The purpose of this program is ");
	System.out.println("to be able to calculate the volume of a sphere.");
	System.out.println("Enter the diameter of the sphere: ");
	diameter = input.nextDouble();
	radius = diameter/2;
	volume = (4/3.0) * Math.PI * Math.pow(radius, 3);
	System.out.println("The volume of the sphere is " + volume);
	}
}
