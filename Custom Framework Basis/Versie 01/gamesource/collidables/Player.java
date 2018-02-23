package gamesource.collidables;

import gamesource.main.*;
import javafx.scene.canvas.*;
import javafx.scene.paint.*;


public class Player extends GameObject
{
	
	
	public Player()
	{  }
	
	public Player(double xPosition, double yPosition)
	{
		super(xPosition, yPosition);
	}
	
	
	@Override
	public void Update()
	{
		
		x -= 1;
		y -= 1;
		
		if (Input.KEYS_PRESSED.contains("D"))
		{
			x += 5;
		}
		
		if (Input.KEYS_PRESSED.contains("S"))
		{
			y += 5;
		}
		
		if (Input.MOUSE_PRESSED_LB)
		{
			scaleX += 0.01;
			scaleY += 0.01;
		}
		
	}
	
	
	@Override
	public void Draw(GraphicsContext gc)
	{
		
		// EXTRA SHADOW EFFECT:
		gc.setFill(Color.rgb(0, 0, 0, 0.5));
		gc.fillOval(x, y + (getHeight() * 0.9), getWidth(), 50 * scaleY);
		
		
		// ORIGINAL DRAWING:
		super.Draw(gc);
		
	}
	
	
}
