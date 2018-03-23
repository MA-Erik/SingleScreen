package gamesource.collidables;

import gamesource.main.*;
import javafx.scene.image.*;


public class Wall extends GameObject
{
	
	public Wall(float xPosition, float yPosition)
	{
		super(xPosition, yPosition);
		
		setSprite(new Image("WallSprite.png"));
		
		scaleX = 5;
		scaleY = 5;
	}
	
	
}
