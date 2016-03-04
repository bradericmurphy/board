package Game;

public class Tile {

	private AnyPiece occupant;
	private int xPosition, yPosition;
	
	public Tile(){
		
	}//ends Tile constructor
	
	public void setOccupant(AnyPiece piece){
		this.occupant = piece;
	}//ends setOccupant
	
	public anyPiece getOccupant(){
		return this.occupant;
	}
	
}//ends class Tile
