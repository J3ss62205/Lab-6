/**
 * 
 */
package cs141.jlhenry2;
import java.util.*;

/**
 * @author jlhenry2
 *
 */
public class GPACalc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		String inputName1;
		String inputName2; 
		int inputId;
		int num1;
		int num2;
		int num3; 
		
		System.out.println("Please input a first name: ");
		inputName1 = scnr.nextLine();
		System.out.println("Please input a last name: ");
		inputName2 = scnr.nextLine();
		System.out.println("Please input an ID: ");
		inputId = scnr.nextInt();
		System.out.println("Please input a grade: ");
		num1 = scnr.nextInt();
		System.out.println("Please input a grade: ");
		num2 = scnr.nextInt();
		System.out.println("Please input a grade: ");
		num3 = scnr.nextInt();
		
		
		System.out.println("*****************************************");
		Student number1 = new Student("Bob", "Grey", 1 );
		Student number2 = new Student("Sam", inputName2, 2, num1, num2, num3 );
		Student number3 = new Student(inputName1, "Smith", 3);
		number1.print();
		number2.print();
		number3.print();

	}

}
