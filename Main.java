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
	public void rotateFigure(double angleOFrotation, Point b){
		for(Point point:coords){
			point.rotate(angleOFrotation, b);
		}
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
/*
class Rectangle extends Figure {
	
	private int[] coords = new int[4];
	
	
	Rectangle(){}	
	Rectangle(int[] coords) {
		this.coords = coords;
	}
	
	public void getCoords() {
		System.out.print("x1,y1,x2,y2\n");
		for(int num: coords) System.out.print(num+" ");
		System.out.println();
	}
}

class Ellipse extends Figure{
	
	private center;
	private double b;
	
	public void getCoords() {
		for(int num: coords) System.out.print(num+" ");
		System.out.println();
	}
	
	public void setCenter(Point center){
		center 
	}
}
*/
class Circle extends Figure{
	
	private double radius;
	
	
	Circle(){}	
	Circle(Point point, double radius) {
		coords.add(point);
		this.radius = radius;
	}
	
	public void getCoords() {
		for(Point point:coords){
			System.out.println("Coords:");
			System.out.print("x: "+point.x);
			System.out.println(", y: "+point.y);
		}
	}
	
	public void getRadius(){
		System.out.print("Radius:\n"+radius);
		System.out.println();
	}
}


public class Main{
	
	public static void main(String[] args) {
		/*
		int[] rec_coord = new int[] {0,0,10,5}; // x1,y1,x2,y2 левая нижняя точка, верхняя правая точка
		Rectangle a = new Rectangle(rec_coord);
		a.getCoords();
		*/
		
		double cir_radius = 2.5;
		Circle b = new Circle(new Point(100.0,300.0), cir_radius);
		b.getCoords();
		b.getRadius();
		b.rotateFigure(-45.0,new Point(100.0,100.0));
		b.getCoords();
	}
	
}