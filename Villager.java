package Unit;
import Auxialiary.Coordinate;
import Resources.GoldMine;
public class Villager extends Human{
	protected final String TYPE = "VILLAGER";
	protected int collectSpeed;
	
	public Villager(int ID,Coordinate coord) {
		this.ID = "V"+ID;
		life = 100;
		currentLife = life;
		type = TYPE;
		moveSpeed = 1;
		cost = 50;
		collectSpeed = 100;
		coordinate = coord;
	}
	public Object[][] Collect(Object[][] map){
		int quantity = 0;
		if(direction == 'u')
			if(coordinate.getX()-1>=0 && map[coordinate.getX()-1][coordinate.getY()] instanceof GoldMine) {
				 ((GoldMine)map[coordinate.getX()-1][coordinate.getY()]).getCurrentQuantity();
				 if(quantity < 0 )
					 ((GoldMine)map[coordinate.getX()-1][coordinate.getY()]).setCurrentQuantity(quantity-collectSpeed);
					 
			}
		return map;
	}
	
	public Object[][] Move(Object[][] map, String command){
		Coordinate old = coordinate;
		if(command.equals("left")) {
			coordinate.setY(old.getY()-1);
			direction = 'l';
		}
		else if(command.equals("right")) {
			coordinate.setY(old.getY()+1);
			direction = 'r';
		}
		else if(command.equals("up")) {
			coordinate.setX(old.getX()-1);
			direction = 'u';
		}
		else if(command.equals("down")) {
			coordinate.setX(old.getX()+1);
			direction = 'd';
		}
		if(map[coordinate.getX()][coordinate.getY()]==null) {
			map[coordinate.getX()][coordinate.getY()] = this;
			map[old.getX()][old.getY()]=null;
		}
		else {
			this.coordinate = old;
		}
		return map;
	}
}
