package method;

public class TwelveAnimals {
	  public static void main(String[] args) {
	    printAnimal(1986);
	    printAnimal(1990);
	    printAnimal(2000);
	  }

	  private static void printAnimal(int birthYear) {
	    String animal = "";
	    switch (birthYear % 12) {
	      case 0:
	        animal = "원숭이";
	        break;
	      case 1:
	        animal = "닭";
	        break;
	      case 2:
	        animal = "개";
	        break;
	      case 3:
	        animal = "돼지";
	        break;
	      case 4:
	        animal = "쥐";
	        break;
	      case 5:
	        animal = "소";
	        break;
	      case 6:
	        animal = "호랑이";
	        break;
	      
	      /* 해당 메소드를 완성하세요. */
	      
	      default:
	        animal = "ERROR!";
	        break;
	    }
	    System.out.printf("%d년 => %s띠\n", birthYear, animal);
	  }
	}
