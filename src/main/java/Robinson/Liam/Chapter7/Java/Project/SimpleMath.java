package Robinson.Liam.Chapter7.Java.Project;

public class SimpleMath {
	double divide(double numerator, double denominator) {
		
		if ( denominator == 0) {
			 throw new ArithmeticException("Cannot divide by zero");
		 }
		
		return numerator / denominator;
		
	}

}
