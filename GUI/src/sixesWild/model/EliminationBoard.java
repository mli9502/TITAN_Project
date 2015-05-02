package sixesWild.model;

public class EliminationBoard extends Board
{
	protected int moveLimit;
	protected int moveLeft;
	
	public EliminationBoard(Level l)
	{
		super(l);
		this.moveLimit = l.getMoveLimit();
		this.moveLeft = l.getMoveLimit();
	}
	
	public int getMoveLimit()
	{
		return this.moveLimit;
	}
	
	public int getMoveLeft()
	{
		return this.moveLeft;
	}
	
	/**
	 * Updates the number of moves left in Puzzle mode with input delta representing the move change.
	 * @author Mengwen Li, Yihong Zhou.
	 * @param delta
	 * @return
	 */
	public boolean updateMoveLeft(int delta)
	{
		this.moveLeft = moveLeft + delta;
		if(this.moveLeft < 0 || delta > 0)
		{
			return false;
		}
		return true;
	}
	
	public boolean allMarked()
	{
		int i=0;
		for(i=0; i<81; i++)
		{
			if(this.getSquare(i/9, i%9).getType() == 1)
			{
				if(this.getSquare(i/9,  i%9).getIsMarked() != 1)
				{
					break;
				}
			}
		}
		if(i==81)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
			
}