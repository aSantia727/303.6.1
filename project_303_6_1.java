
public class project_303_6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arraydemoOne.main(args);
		Main.main(args);
		EnhancedForLoop.main(args);
		arraydemothree.main(args);
	}

}

class arraydemoOne {
	 public static void main(String[] args) {
	  
	   int[] age = {12, 4, 5, 2, 5};

	   System.out.println("Accessing Elements of an Array:");
	   System.out.println("First Element: " + age[0]);
	   System.out.println("Second Element: " + age[1]);
	   System.out.println("Third Element: " + age[2]);
	   System.out.println("Fourth Element: " + age[3]);
	   System.out.println("Fifth Element: " + age[4]);
	 }
	}

class Main {
	 public static void main(String[] args) {
	  

	   int[] age = {12, 4, 5};

	   System.out.println("Using for Loop:");
	   for(int i = 0; i < age.length; i++) {
	     System.out.println(age[i]);
	   }
	 }
	}

class EnhancedForLoop {
    public static void main(String[] args) {
    String[] names = { "New York", "Dallas", "Las Vegas", "Florida" };
          for (String name : names) {
                System.out.println(name);
              }
           }
       }

class arraydemothree {
	 public static void main(String[] args) {

	   int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
	   int sum = 0;
	   Double average;
	   

	   for (int number: numbers) {
	     sum += number;
	   }
	  
	   int arrayLength = numbers.length;


	   average =  ((double)sum / (double)arrayLength);

	   System.out.println("Sum = " + sum);
	   System.out.println("Average = " + average);
	 }
	}

