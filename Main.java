import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.lang.Math; 

class Figure{
	protected List<Point> coords = new ArrayList<>();
	
	public void getCoords(){}; 
	public void rotateFigure(double angleOFrotation){
		rotateFigure(angleOFrotation, new Point(0.0,0.0));
	}	
	// поворот относительно точки b
	public void rotateFigure(double angleOFrotation, Point b){ 
		for(Point point:coords){
			point.rotate(angleOFrotation, b);
		}
	}
	public double areaFigure(){
		double sum = 0;
		for(Point point:coords) sum+=(point.x)*(point.y);		
		return sum;
	}
}

class Point{
	public double x;
	public double y;
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	public void rotate(double a, Point b){
		double x,y;
		a = Math.toRadians(a);
		x = (this.x-b.x)*Math.cos(a) - (this.y-b.y)*Math.sin(a);
		y = (this.x-b.x)*Math.sin(a) + (this.y-b.y)*Math.cos(a);
		this.x = Math.round(x+b.x);
		this.y = Math.round(y+b.y);
	}
}

class Circle extends Figure{
	
	private double radius;
	
	Circle(){}	
	Circle(Point point, double radius) {
		coords.add(point);
		this.radius = radius;
	}
	
	public void getCoords() {
		System.out.println("Coords:");
		for(Point point:coords){
			System.out.print("x: "+point.x);
			System.out.println(" | y: "+point.y);
		}
	}
	
	public void getRadius(){
		System.out.print("Radius:\n"+radius);
		System.out.println();
	}
}


class Rectangle extends Figure{
	
	Rectangle(){}
	Rectangle(Point point1, Point point2){
		/* этот конструктор рассчитывает остальные 2 точки,
		и отправляет в другой конструктор 4 точки
			1--4
			|  |
			3--2 */
		this(point1, point2, new Point(point1.x, point2.y), new Point(point2.x, point1.y));
	}
	Rectangle(Point point1, Point point2, Point point3, Point point4){
		coords.add(point1);
		coords.add(point2);
		coords.add(point3);
		coords.add(point4);
	}
	
	public void getCoords() {
		int counter = 0;
		System.out.println("Coords:");
		for(Point point1:coords){
			System.out.print("Point"+ ++counter);
			System.out.print(" x: "+ point1.x);
			System.out.println(" | y: "+ point1.y);
		}
		System.out.println("\t1--4 \n\t|  | \n\t3--2"); // символьное описание точек прямоугольника
	}
	
}


public class Main{
	
	public static void main(String[] args) {
		Rectangle a = new Rectangle(new Point(0.0, 10.0), new Point(10.0, 0.0));
		a.getCoords();
		System.out.println("Area: " + a.areaFigure());
		
		/* поворот окружности
		double cir_radius = 2.5;
		Circle b = new Circle(new Point(100.0,300.0), cir_radius);
		b.getCoords();
		b.getRadius();
		b.rotateFigure(-45.0,new Point(100.0,100.0));
		b.getCoords();
		*/
	}
	
}