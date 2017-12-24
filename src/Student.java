import java.util.Scanner;

public class Student {

	private String name;
	private double GPA;
	private int ID;
	
	public String getName() { //getters setters
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getGPA() {
		return GPA;
	}
	
	public void setGPA(double GPA) {
		this.GPA = GPA;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public Student() {//default constructor
	}
	
	public Student(String name, double GPA, int ID) { //constructor with fields
		super();
		this.name = name;
		this.GPA = GPA;
		this.ID = ID;
	}
	
	
	public static void calculateAverage(int studentNumber) { //calculating average after getting information about student.

		double sum=0;
		
		Scanner sc=new Scanner(System.in);
			
			
			if(studentNumber==0) {
				
				System.out.println("Average of the class is zero."); //zero is not valid.
			}
			
			else {
			
			Student average[]=new Student[studentNumber]; //Set student number to array. Now array has that number of students.
			
			for(int j=0; j<studentNumber; j++) {  
				
				average[j]=new Student();
		
			}
			
			for( int i=0; i<studentNumber; i++) {  
				
				System.out.println("Enter Student #" + (i+1) + "'s name: ");
				average[i].setName(sc.next().toString());
				
				System.out.println("Enter student #" + (i+1) + "'s GPA: ");
				
				average[i].setGPA(sc.nextDouble());
			
				if(average[i].getGPA()>4) {
					
					System.out.println("GPA can not be more than 4.0."); 
					break;
					
				}
				
				System.out.println("Enter student#" + (i+1) + "'s ID: ");
				average[i].setID(sc.nextInt());
				
				sum = sum + average[i].getGPA();
				
				
			}
			
			System.out.println("Average of the class is "+ (sum/studentNumber));  

		}		
	}
	
	public static void main(String[]args) {
      
		Scanner sc=new Scanner(System.in);
       
		System.out.println("Please enter the student number in the class: ");  //setting student number
		int a=sc.nextInt();
				
		calculateAverage(a); //enter number of student here
			
		}
	}

