package test.cr;

import junit.framework.Assert;

import org.junit.Test;


public class CodeOfLifeTest {
	@Test
	public void whenCellHaveLessFriendThanTwoThenNextIsAliveIsFalse() {
		
		boolean[][] area = new boolean[3][3];
		
		int myCellX = 0;
		int myCellY = 0;
		
		// set friend
		area[0][1] = true;
		area[1][0] = false;
		area[1][1] = false;
		
		Rule rule = new Rule();
		boolean actual = rule.getNextIsAlive(area, myCellX, myCellY);
		
		boolean expected = false;
		Assert.assertEquals(expected, actual);
		
		
	}
	
	@Test
	public void whenCellHaveTwoFriendThenNextIsAliveIsTrue() {
		
		boolean[][] area = new boolean[3][3];
		
		int myCellX = 0;
		int myCellY = 0;
		
		// set friend
		area[0][1] = true;
		area[1][0] = true;
		area[1][1] = false;
		
		Rule rule = new Rule();
		boolean actual = rule.getNextIsAlive(area, myCellX, myCellY);
		
		boolean expected = true;
		Assert.assertEquals(expected, actual);
		
		
	}	
	
	@Test
	public void whenCellHaveThreeFriendsThenNextIsAliveIsFalse() {
		
		boolean[][] area = new boolean[3][3];
		
		int myCellX = 0;
		int myCellY = 0;
		
		// set friend
		area[0][1] = true;
		area[1][0] = true;
		area[1][1] = true;
		
		Rule rule = new Rule();
		boolean actual = rule.getNextIsAlive(area, myCellX, myCellY);
		
		boolean expected = true;
		Assert.assertEquals(expected, actual);
		
		
	}	
	
	@Test
	public void whenCellHaveFourFriendsThenNextIsAliveIsFalse() {
		
		boolean[][] area = new boolean[3][3];
		
		int myCellX = 0;
		int myCellY = 1;
		
		// set friend
		area[0][0] = true;
		area[0][2] = true;
		area[1][0] = true;
		area[1][1] = true;
		
		Rule rule = new Rule();
		boolean actual = rule.getNextIsAlive(area, myCellX, myCellY);
		
		boolean expected = false;
		Assert.assertEquals(expected, actual);
		
		
	}	
	
}
