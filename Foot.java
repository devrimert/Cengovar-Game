package Unit;

import Auxialiary.Coordinate;

public class Foot extends Human implements ISoldier{
	protected int attackSpeed;
	protected int attackDamage;
	protected final String TYPE = "FOOT";
	
	public Foot(String ID,Coordinate coord) {
		this.ID = "F"+ID;
		life = 200;
		currentLife = life;
		type = TYPE;
		moveSpeed = 1;
		cost = 100;
		direction =' ';
		coordinate = coord;
		attackDamage = 100;
		attackSpeed = 1;
		
		
	}
	
	
	public Object[][] Attack(Object[][] map){
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
