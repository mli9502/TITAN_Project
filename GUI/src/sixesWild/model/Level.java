package sixesWild.model;

import java.awt.Color;
import java.util.ArrayList;

public class Level 
{
	//Highest score stores in the same place with lock state.
	protected int levelNum;
	//Mode can be calculated by levelNum.
	//true represents locked.
	protected int locked;
	protected int moveLimit;
	protected int timeLimit;
	protected int swapLimit;
	protected int removeLimit;
	protected ArrayList<Integer> starGoals;
	protected ArrayList<Integer> numFrequency;
	protected ArrayList<Integer> multiFrequency;
	//Represents the type of the square,
	//0: Disable
	//1: Normal
	//2: Bucket
	//The position of 6 in tileNum should be on the same col with buckets in squareType.
	protected ArrayList<Integer> squareType;
	protected ArrayList<Integer> tileNum;
	protected ArrayList<Integer> tileMulti;
	
	public Level(int levelNum, 
			int locked, 
			int moveLimit, 
			int timeLimit, 
			int swapLimit, 
			int removeLimit, 
			ArrayList<Integer> starGoals, 
			ArrayList<Integer> numFrequency,
			ArrayList<Integer> multiFrequency,
			ArrayList<Integer> squareType, 
			ArrayList<Integer> tileNum,
			ArrayList<Integer> tileMulti)
	{
		this.levelNum=levelNum;
		this.locked=locked;
		this.moveLimit=moveLimit;
		this.timeLimit=timeLimit;
		this.swapLimit=swapLimit;
		this.removeLimit=removeLimit;
		this.starGoals=starGoals;
		this.numFrequency=numFrequency;
		this.multiFrequency=multiFrequency;
		this.squareType=squareType;
		this.tileNum=tileNum;
		this.tileMulti=tileMulti;
	}
	//Getters.
	
	public ArrayList<Integer> getNumFrequency()
	{
		return this.numFrequency;
	}
	
	public ArrayList<Integer> getMultiFrequency()
	{
		return this.multiFrequency;
	}
	
	public ArrayList<Integer> getStarScore()
	{
		return this.starGoals;
	}
	
	public int getLevelNum()
	{
		return this.levelNum;
	}
	public int getRemoveLimit()
	{
		return this.removeLimit;
	}
	
	public int getMoveLimit()
	{
		return this.moveLimit;
	}
	
	public int getTimeLimit()
	{
		return this.timeLimit;
	}
	
	public int getSwapLimit()
	{
		return this.swapLimit;
	}
	
	public ArrayList<Integer> getTileNum()
	{
		return this.tileNum;
	}
	
	public ArrayList<Integer> getTileMulti()
	{
		return this.tileMulti;
	}
	
	public ArrayList<Integer> getSquareType() 
	{
		// TODO Auto-generated method stub
		return this.squareType;
	}
	
	public boolean isLocked()
	{
		if(locked == 0)
		{
			return true;
		}
		return false;
	}

	public int getLockState()
	{
		return this.locked;
	}
	
	//Store the unlock state in a separate file.
	public void setLocked(Integer locked)
	{
		this.locked=locked;
		return;
	}
	
	
	
}
