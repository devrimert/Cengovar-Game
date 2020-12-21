package Unit;
import Auxialiary.Coordinate;;
public abstract class Human {
	protected String  ID;
	protected String type;
	protected int life;
	protected int currentLife;
	protected int cost;
	protected int moveSpeed;
	protected Coordinate coordinate;
	protected char direction;
	
	public char getDirection() {
		return direction;
	}

	public void setDirection(char direction) {
		this.direction = direction;
	}


	public int getCurrentLife() {
		return currentLife;
	}
	public void setCurrentLife(int currentLife) {
		this.currentLife = currentLife;
	}
	public Coordinate getCoordinate() {
		return coordinate;
	}
	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}
	public String getID() {
		return ID;
	}
	public String getType() {
		return type;
	}
	public int getLife() {
		return life;
	}
	public int getCost() {
		return cost;
	}
	public int getMoveSpeed() {
		return moveSpeed;
	}
	public abstract Object[][] Move(Object[][] map, String command);
}
