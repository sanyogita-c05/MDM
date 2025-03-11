package circle;



abstract class CircleOpr{

	protected double rad;

	

	public CircleOpr(double rad){

		this.rad=rad;

	}

	

	public abstract double area();

	public abstract double peri();

	

}



class Circle2 extends CircleOpr{

	public Circle2(double rad){

		super(rad);

	}

	

	public double area() {

		double area = 3.14*this.rad*this.rad;

		return area;

	}

	public double peri() {

		double peri = 2*3.14*this.rad;

		return peri;

	}

}



public class Circle {

	public static void main(String[] args) {

		CircleOpr c1 = new Circle2(2);

		CircleOpr c2 = new Circle2(4);

		

		double peri1 = c1.peri();

		double peri2 = c2.peri();

		double area1 = c1.area();

		double area2 = c2.area();



		

		System.out.println("Perimeter of first circle: "+peri1);

		System.out.println("Perimeter of second circle: "+peri2);

		System.out.println("Area of first circle: "+area1);

		System.out.println("Area of second circle: "+area2);



		if(area1>area2) {

			System.out.println("Circle 1 is larger");

		}

		else {

			System.out.println("Circle 2 is larger");

		}

		



		

	}

}
