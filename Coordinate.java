package Auxialiary;

public class Coordinate {
	protected int x;
	protected int y;
	
	
	public Coordinate(int x,int y) {
		this.x=x;
		this.y=y;
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if(x>=0 && x<20)
			this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if(y>=0 && y<20)
			this.y = y;
			}

}
