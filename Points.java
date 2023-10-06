package proj2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Points {
	public double x,y;
	private int n =100000;
	 List<Points>list = new ArrayList<Points>();
	public Points(){
		this(0,0);
	}
	public Points(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public List<Points> randomPoints() {
		Random random = new Random();

		for(int i =0; i<n ; i++) {
			double x  = random.nextDouble()*100;
			double y = random.nextDouble()*100;
			Points points = new Points(x,y);
			list.add(points);
		}
		return list;
	}
	
}
