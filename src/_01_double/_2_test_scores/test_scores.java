package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class test_scores {
public static void main(String[] args) {
	String score = JOptionPane.showInputDialog("What was your test score?");
	double grade = Double.parseDouble(score);
	System.out.println(grade);
	if (grade >= 90) {
		
		JOptionPane.showMessageDialog(null, "You did great.");
		
	}
	
	else if (grade >= 80) {
		
		JOptionPane.showMessageDialog(null, "Thats pretty good.");
		
	}
	else if (grade >= 70) {
		
		JOptionPane.showMessageDialog(null, "Thats fine.");
		
	}
	else if (grade >= 60) {
		
		JOptionPane.showMessageDialog(null, "Thats not good.");
		
	}
	else if (grade >= 50) {
		
		JOptionPane.showMessageDialog(null, "Thats really bad.");
		
	}
	else {
		
		JOptionPane.showMessageDialog(null, "Did you even try?");
		
	}
	
}
}
