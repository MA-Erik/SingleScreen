package gamesource.main;

import java.util.*;


// THIS CLASS HELPS OBTAINING DATA FROM THE GameManager.
public class Helper
{
	
	private static GameManager _GM = null;
	
	public static void SetGameManagerReference(GameManager ref)
	{
		_GM = ref;
	}
	
	public static GameObject CheckCollisionRectangle(GameObject objA, Class type)
	{
		return _GM.CheckCollisionRectangle(objA, type);
	}

}
