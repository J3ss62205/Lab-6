/**
 * 
 */
package cs141.jlhenry2;
import java.util.*;

/**
 * @author jlhenry2
 *
 */
public class Student {
	private String firstName;
	private String lastName;
	private int Id; 
	private double num1;
	private double num2;
	private double num3; 
	private double avg;
	
	public Student(String firstName,String lastName, int Id, int num1, int num2, int num3) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.Id = Id;
		this.num1 = num1; 
		this.num2 = num2; 
		this.num3 = num3; 
		setAverage();
	}
	
	public Student(String firstName,String lastName, int Id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.Id = Id;
		setRandomNum();
	}
	
	public void setName1(String inputName1) {
		firstName = inputName1;
	}
	
	public String getName1() {
		return firstName;
	}
	
	public void setName2(String inputName2) {
		lastName = inputName2;
	}
	
	public String getName2() {
		return lastName;
	}
	
	public void setId(int inputId) {
		Id = inputId;
	}
	
	public int getId() {
		return Id;
	}
	
	public void setRandomNum() {
		Random rnum = new Random();
		num1 = (rnum.nextInt(100));
		num2 = (rnum.nextInt(100));
		num3 = (rnum.nextInt(100));
		setAverage();
	}
	
	public void setAverage() {
		avg = (this.num1 + this.num2 + this.num3) / 3.0;
	}
	
	public double getAverage() {
		return this.avg; 
	}
	
	public void print() {
		System.out.println("Name: " + firstName + " "+ lastName);
		System.out.println("ID: " + Id);
		System.out.println("Grades: " + num1 + " "+ num2 + " " + num3);
		System.out.println("Average: " + getAverage());
		System.out.println("*****************************************");

	}

}
