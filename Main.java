import java.util.Scanner;

class Figure{
	private Point[] coords;
	
	public void getCoords(); 
	public void addPoint(Point);
	//добавление точек в масиив coords
	public void rotateFigure();
}

class Point{
	public double x;
	public double y;
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	public void rotate(){
	//x = x*cos(angle) - y*sin(angle)
	//y = x*sin(angle) + y*cos(angle)
	}
}

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

class Circle extends Figure{
	
	private double radius;
	
	
	Circle(){}	
	Circle(Point point, double radius) {
		
	}
	
	public void getCoords() {
		System.out.print("x:"+coords[0]);
		System.out.print(" y:"+coords[1]);
		System.out.println();
	}
	
	public void getRadius(){
		System.out.print("Radius: "+radius);
	}
}


public class Main{
	
	public static void main(String[] args) {
		
		int[] rec_coord = new int[] {0,0,10,5}; // x1,y1,x2,y2 левая нижняя точка, верхняя правая точка
		Rectangle a = new Rectangle(rec_coord);
		a.getCoords();
		
		int[] cir_coord = new int[] {0,0};
		double cir_radius = 2.5;
		Circle b = new Circle(new Point(x,y), cir_radius);
		b.getCoords();
		b.getRadius();
		
	}
	
}