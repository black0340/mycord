import java.awt.Point;

public class Point3D extends java.awt.Point {
	int z;
	Point3D(int x,int y,int z){
		super.x = x;
		super.y = y;
		this.z=z;
	}
	void moveUp() {z++;
	}
	void moveDown() {z--;}
	void move(int x, int y,int z) {
		super.x=x;
		super.y=y;
		this.z=z;
		
	}
	public String toString() {return "("+x+","+y+","+z+")";}
	public static void main(String[] args)
	{
		Point3D p = new Point3D(1,2,3);
		System.out.println(p.toString()+"입니다.");
		
		p.moveUp();
		System.out.println(p.toString()+"입니다.");
		p.moveDown();
		p.move(10,10);
		System.out.println(p.toString()+"입니다.");
		
		p.move(100,200,300);
		System.out.println(p.toString()+"입니다.");
	}

}
