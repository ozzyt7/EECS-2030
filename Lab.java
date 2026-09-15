package Lab1;

import java.util.ArrayList;

public class Lab {
	
	/**
	 * This method returns my student id as a string
	 * 
	 * @return - returns my student id 
	 * 
	 */
	
	public static String getMyID() {
		
		return "220834610";
	}
	
	
	
	/**
	 * This method accepts a double number representing a grade percentage and returns the corresponding grade letter
	 * 
	 * @param grade - a double number representing a grade percentage
	 * @return - returns the grade letter as a string 
	 * @pre - grade must be a double number between 0 and 100
	 * 
	 */
	
	public static String getLetterGrade(double grade) {
		
		double newGrade = grade / 100.0;
		String gradeLetter;
		
		if (newGrade > 1.0 || newGrade < 0.0) {
			throw new IllegalArgumentException("not a valid grade percentage");
		}
		
		if (newGrade <= 1.0 && newGrade >= 0.9) {
			gradeLetter = "A+";
		}
		else if (newGrade < 0.9 && newGrade >= 0.8) {
			gradeLetter = "A";
		}
		else if (newGrade < 0.8 && newGrade >= 0.75) {
			gradeLetter = "B+";
		}
		else if (newGrade < 0.75 && newGrade >= 0.7) {
			gradeLetter = "B";
		}
		else if (newGrade < 0.7 && newGrade >= 0.65) {
			gradeLetter = "C+";
		}
		else if (newGrade < 0.65 && newGrade >= 0.6) {
			gradeLetter = "C";
		}
		else if (newGrade < 0.6 &&  newGrade >= 0.55) {
			gradeLetter = "D+";
		}
		else if (newGrade < 0.55 && newGrade >= 0.5) {
			gradeLetter = "D";
		}
		else if (newGrade < 0.5 && newGrade >= 0.45) {
			gradeLetter = "E";
		}
		else {
			gradeLetter = "F";
		}
		
		return gradeLetter;
		
	}
	
	
	/**
	 * This method accepts an ArrayList of grades and returns the sum of the grades at the scale of 10
	 * 
	 * @param grades - an ArrayList of double numbers 
	 * @return - returns the total of the grades at scale 10
	 * @pre - grades cannot be null and must be a non empty ArrayList of double numbers
	 * 
	 */
	
	public static double addAndChangeScale(ArrayList<Double> grades) {
		
		if (grades.isEmpty() || grades == null) {
			throw new IllegalArgumentException("grades cannot be null or empty");
		}
		
		double length = grades.size();
		double total = 0.0;
		
		if (length == 1) {
			total += grades.get(0);
		}
		else {
			for (int i = 0; i < length - 1; i++) {
				total += grades.get(i);
			}
		}
		
		double avg = (total/length);
		double output = (Math.round(avg * 10) / 10) / 10;
		
		return output;
		
	}
	
}
