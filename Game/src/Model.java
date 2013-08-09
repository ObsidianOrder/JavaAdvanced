import java.util.ArrayList;


public class Model {

	int playerX, playerY;
	int playerXV, playerYV;
	int level = 1;
	
	
	
	Player player;
 ArrayList <Enemy> enemies;
ArrayList <Obstacle> obstacles;
 
 
 public Model() {
	 player = new Player(250, 250);
	 enemies = new ArrayList <Enemy> ();
	 obstacles = new ArrayList <Obstacle> ();
	 enemies.add(new Enemy(200, 300));
	 enemies.add(new Enemy(400, 100));
	 enemies.add(new Enemy(346, 410));
	 obstacles.add(new Obstacle(0, 0, 100, 100));
	 obstacles.add(new Obstacle(0, 200, 50, 300));
 }
 
 public Player getPlayer() {
	return player;
	 
 }
 
 public Enemy getEnemy(int index) {
	 return enemies.get(index);
 }
 
 public Obstacle getObstacle(int index) {
	 return obstacles.get(index);
 }
	
 public int getEnemyCount() {
	 return enemies.size();	 
 }
 
 public int getObstacleCount() {
	 return obstacles.size();
 }
 
	public int getEnemyX(int index) {
		return enemies.get(index).x;
	}
	
	public int getEnemyY(int index) {
		return enemies.get(index).y;
	}
	
	public void setPosition(int x, int y) {
		playerX = x;
		playerY = y;
		
	}

	
	
	public void movePlayer(){
		playerX = playerX + playerXV;
		if (playerX > 490) {
			playerX = 490;
		}
		if (playerX < 10) {
			playerX = 10;
		}
		if (playerY >= 490) {
			playerY = 490;
		}
		if (playerY < 10) {
			playerY = 10;
		}
		playerY = playerY + playerYV;
	}

	public void moveEnemies() {
		for(int i = 0 ; i < enemies.size() ; i++) {
			
		}
		
	}
	
}
