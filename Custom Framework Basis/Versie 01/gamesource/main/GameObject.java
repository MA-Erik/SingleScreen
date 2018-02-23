package gamesource.main;


import javafx.scene.canvas.*;
import javafx.scene.image.*;
import javafx.geometry.*;


public class GameObject extends ImageView
{
	
	public int layer = 0;
	
	public double x = 0;
	public double y = 0;
	public double scaleX = 1.0;
	public double scaleY = 1.0;
	
	public boolean isActive = true;
	public boolean isCollidable = false;
	public boolean isVisible = true;
	
	
	
	private Image _sprite;
	private Rectangle2D _boundingBox = new Rectangle2D(0, 0, 0, 0);
	
	
	
	// ------------------------------------------------- PROPERTIES (aka GETTERS/SETTERS) -------------------------------------------------
	public Image getSprite()
	{
		if (_sprite != null)
		{ return _sprite; }
		else
		{ return null; }
	}
	
	/** Based on the given image, it will automatically set the bounding box of the GameObject. */
	public void setSprite(Image newSprite)
	{
		_sprite = newSprite;
		_boundingBox = new Rectangle2D(0, 0, (double)_sprite.getWidth(), (double)_sprite.getHeight());
	}
	
	
	public double getBBoxTop()
	{
		return _boundingBox.getMinX();
	}
	public double getBBoxLeft()
	{
		return _boundingBox.getMinY();
	}
	public double getBBoxBottom()
	{
		return _boundingBox.getMaxX() * scaleX;
	}
	public double getBBoxRight()
	{
		return _boundingBox.getMaxY() * scaleY;
	}
	
	
	public double getWidth()
	{
		if (_sprite != null)
		{
			return _sprite.getWidth() * scaleX;
		}
		
		return 0.0;
	}
	public double getHeight()
	{
		if (_sprite != null)
		{
			return _sprite.getWidth() * scaleX;
		}
		
		return 0.0;
	}
	
	
	
	
	// -------------------------------------------------           CONSTRUCTORS           -------------------------------------------------
	public GameObject()
	{ /* You are allowed to instantiate this class without arguments. */ }
	
	public GameObject(double xPosition, double yPosition)
	{
		x = xPosition;
		y = yPosition;
	}
	
	
	
	// -------------------------------------------------              METHODS             ------------------------------------------------- 
	/** Override this method to insert your own game logic. */
	public void Update()
	{
		
	}
	
	
	/** This object will draw itself on the given GraphicsContext: */
	public void Draw(GraphicsContext gc)
	{
		if (_sprite != null)
		{
			gc.drawImage(_sprite, x, y, _sprite.getWidth() * scaleX, _sprite.getHeight() * scaleY);
		}
	}
	
}
