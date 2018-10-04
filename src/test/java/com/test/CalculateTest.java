package com.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.main.Calculate;

public class CalculateTest {

	public int score;
	public Calculate cal;
	
	@Before
	public void initScoreZero() {
		this.score = 0;
	}
	
	@Before
	public void initCalculateClass() {
		this.cal = new Calculate();
	}
	
	@Test
	public void getScoreFromSetScoreByScore100() {
		this.score = 100;
		
		int expected = 100;
		
		cal.setScore(this.score);
		int actual = cal.getScore();
		

		Assert.assertEquals(expected, actual);
		 
	}
	
	@Test
	public void getScoreFromSetScoreByScore0() {
		this.score = 0;
		
		int expected = 0;
		
		cal.setScore(this.score);
		int actual = cal.getScore();
		

		Assert.assertEquals(expected, actual);
		 
	}
	
	
	@Test
	public void gradeAFromSetScoreByScore90() {
		this.score = 90;
		
		String expected = "A";
		
		cal.setScore(this.score);
		String actual = cal.CalculateGrade();
		

		Assert.assertEquals(expected, actual);
		 
	}
	
	@Test
	public void gradeBPlusFromSetScoreByScore75() {
		this.score = 75;
		
		String expected = "B+";
		
		cal.setScore(this.score);
		String actual = cal.CalculateGrade();
		

		Assert.assertEquals(expected, actual);
		 
	}
	
	public void gradeBFromSetScoreByScore74() {
		this.score = 74;
		
		String expected = "B";
		
		cal.setScore(this.score);
		String actual = cal.CalculateGrade();
		

		Assert.assertEquals(expected, actual);
		 
	}
	public void gradeCPlusFromSetScoreByScore65() {
		this.score = 65;
		
		String expected = "C+";
		
		cal.setScore(this.score);
		String actual = cal.CalculateGrade();
		

		Assert.assertEquals(expected, actual);
		 
	}
	public void gradeCFromSetScoreByScore60() {
		this.score = 60;
		
		String expected = "C";
		
		cal.setScore(this.score);
		String actual = cal.CalculateGrade();
		

		Assert.assertEquals(expected, actual);
		 
	}
	public void gradeDPlusPlusFromSetScoreByScore55() {
		this.score = 55;
		
		String expected = "D+";
		
		cal.setScore(this.score);
		String actual = cal.CalculateGrade();
		

		Assert.assertEquals(expected, actual);
		 
	}
	public void gradeDFromSetScoreByScore50() {
		this.score = 50;
		
		String expected = "D";
		
		cal.setScore(this.score);
		String actual = cal.CalculateGrade();
		

		Assert.assertEquals(expected, actual);
		 
	}public void gradeFFromSetScoreByScore20() {
		this.score = 20;
		
		String expected = "F";
		
		cal.setScore(this.score);
		String actual = cal.CalculateGrade();
		

		Assert.assertEquals(expected, actual);
		 
	}
	

}
