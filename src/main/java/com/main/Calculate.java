package com.main;

public class Calculate {

	public int score;
	public String grade;
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public String CalculateGrade() {
		if(this.score>80) {
			grade = "A";
		}
		else if(this.score >=75) {
			grade = "B+";
		}
		else if(this.score >=70) {
			grade = "B";
		}
		else if(this.score >=65) {
			grade = "C+";
		}
		else if(this.score >=60) {
			grade = "C";
		}
		else if(this.score >=55) {
			grade = "D+";
		}
		else if(this.score >=50) {
			grade = "D";
		}
		else  {
			grade = "F";
		}
		
		
		return grade;
	}

}
