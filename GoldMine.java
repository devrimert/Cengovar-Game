package Resources;
import Auxialiary.Coordinate;
import java.util.Random;

public class GoldMine {
	protected Coordinate coordinate;
	protected int quantity;
	protected int currentQuantity;
	
	public GoldMine(Coordinate c) {
		Random rand = new Random();
		quantity = rand.nextInt((((1000 - 500)+1)+500)/100)*100;
	    coordinate = c;
	    currentQuantity = quantity;
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getCurrentQuantity() {
		return currentQuantity;
	}

	public void setCurrentQuantity(int currentQuantity) {
		this.currentQuantity = currentQuantity;
	}

}
