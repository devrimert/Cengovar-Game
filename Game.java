package Initialization;
import Resources.GoldMine;
import java.util.Random;
import Auxialiary.Coordinate;
public class Game {
	Object [][] map;
	public Game() {
		map = new Object [20][20];
		CreateMap();
		Menu();
	}
	private void CreateMap() {
		Random rand = new Random();
		int i = 0;
		int x,y;
		while(i<25) {
			x = rand.nextInt((map.length-0))+0;
			y = rand.nextInt((map[0].length-0))+0;
			if(map[x][y]==null) {
				map[x][y] = new GoldMine(new Coordinate(x,y));
				i++;
			}
			
		}
		
	}

}
