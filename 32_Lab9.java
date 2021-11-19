import java.util.*;
abstract class Shape {
	int length, breadth;
	Scanner input = new Scanner(System.in);
	abstract void printArea();

}

class Rectangle extends Shape {
	void printArea() {
		System.out.println("Area of Rectangle... : ");
		System.out.print("Enter length and breadth: ");
		length = input.nextInt();
		breadth = input.nextInt();
		System.out.println("The area of Rectangle is: " + length * breadth);
	}
}

class Triangle extends Shape {
	void printArea() {
		int base, height;
		System.out.println("\nArea of Triangle");
		System.out.print("Enter Base And Height: ");
		base = input.nextInt();
		height = input.nextInt();
		System.out.println("The area of Triangle is: " + (base * height) / 2);
	}
}

class Circle extends Shape {
	void printArea() {
		int radius;
		System.out.println("\n** Finding the Area of Cricle **");
		System.out.print("Enter radius: ");
		radius = input.nextInt();
		System.out.println("The area of Cricle is: " + 3.14f * radius * radius);
	}
}

public class AbstractClass {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.printArea();

		Triangle tri = new Triangle();
		tri.printArea();
		
		Circle cir = new Circle();
		cir.printArea();
	}
}
