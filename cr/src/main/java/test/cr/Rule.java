package test.cr;

public class Rule {

	public boolean getNextIsAlive(boolean[][] area, int myCellX, int myCellY) {

		int topLeftX = myCellX - 1;
		int topLeftY = myCellY - 1;
		int topX = myCellX;
		int topY = myCellY-1;
		int topRightX = myCellX+1;
		int topRightY = myCellY-1;
		
		int leftX = myCellX-1;
		int leftY = myCellY;
		int rightX = myCellX+1;
		int rightY = myCellY;
		
		int buttomLeftX = myCellX - 1;
		int buttomLeftY = myCellY + 1;
		int buttomX = myCellX;
		int buttomY = myCellY+1;
		int buttomRightX = myCellX+1;
		int buttomRightY = myCellY+1;
		
		
		int count = 0;
		
		
		count = count + this.isHaveToCount(area, topLeftX, topLeftY);
		count = count + this.isHaveToCount(area, topX, topY);
		count = count + this.isHaveToCount(area, topRightX, topRightY);
		
		count = count + this.isHaveToCount(area, leftX, leftY);		
		count = count + this.isHaveToCount(area, rightX, rightY);
		
		count = count + this.isHaveToCount(area, buttomLeftX, buttomLeftY);
		count = count + this.isHaveToCount(area, buttomX, buttomY);
		count = count + this.isHaveToCount(area, buttomRightX, buttomRightY);

		
		if(count<2){
			return false;
		}
		else if(count>3){
			return false;
		}
		
		
		
		return true;
	}

	private int isHaveToCount(boolean[][] area, int x, int y){
		
		if (x < 0 || y < 0)
			return 0;

		if (area[x][y]) {
			return 1;
		}else {
			return 0;
		}		
		
	}
	
}
