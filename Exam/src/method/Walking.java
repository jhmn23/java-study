package method;

public class Walking {
	
	  public static void main (String[] args) {
		  double myCal = calorieCalculator(540);
		  System.out.printf("삼겹살 3인분: %.2f kcal", myCal);
	  }	 
	  
	  public static double calorieCalculator(double pork) {
		  double result = pork * 5.179;
		  return result;
	  }
}
