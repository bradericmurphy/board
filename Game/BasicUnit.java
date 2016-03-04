package Game;

public class BasicUnit extends AnyPiece{
	
	private int health, xPosition, yPosition;
	
	public BasicUnit(int hlth, int xPos, int yPos){
		super(xPos, yPos);
		this.health = hlth;
	}
	
	public void moveUp(){
		this.yPosition +=1;
	}

}
