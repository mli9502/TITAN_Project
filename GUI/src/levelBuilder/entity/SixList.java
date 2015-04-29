package levelBuilder.entity;

import java.util.ArrayList;

public class SixList {
	protected ArrayList<Position> sList;
	
	public SixList(){
		sList = new ArrayList<Position>();
	}
	
	public ArrayList<Position> getSixList() {
		return sList;
	}
	public boolean add(Position ps){
		if(inList(ps)) return false;

		if(sList.add(ps)){
			System.out.println("Six at Position (" + ps.row + " ," + ps.col +") is set!");
			return true;
		}
		return false;
	}
	
	public void clearAll(){
		sList.clear();
	}
	
	public boolean remove(Position ps){
		if(sList.remove(ps)){
			System.out.println("Six at Position (" + ps.row + " ," + ps.col +") is removed!");
			return true;
		}
		return false;
	}
	
	public boolean inList(Position ps){
		for(Position pos:sList){
			if(pos.equals(ps))
				return true;
		}
		return false;
	}
	
}
