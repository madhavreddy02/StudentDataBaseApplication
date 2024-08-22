package StudentDatabaseApplication;

import java.util.Scanner;

public class Student {

	private String firstName ;
	private String lastName  ;
	private int  gradeYear ;
	private String  studentID = "";
	private String courses = "";
	private int tuitionBalance = 0;
	private int costOfCourse = 600;
	private static int id = 1001;
	
	public Student()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Student First Name:");
		this.firstName = in.nextLine();
		System.out.print("\nEnter Student Last Name :");
		this.lastName = in.nextLine();
		System.out.print("\n1-Freshman\n2-Sophmore\n3-junior\n4-Senior\nEnter Student Grade Level:");
		this.gradeYear = in.nextInt();
		setStudentID();
//		System.out.println("\n"+firstName+" "+lastName+" "+gradeYear+" "+studentID);
	}
//	generate an ID
	private void setStudentID()
	{
//		studentID + grade Level
		id++;
		this.studentID = gradeYear +""+ id;
		
	}
//	Enroll in courses
	public void enroll()
	{
		while(1>0)
		{
			System.out.print("\nEnter course to Enroll(Q to Quit):");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q"))
			{
				courses = courses + "\n    " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else {
				break;			
			}
		}
//		System.out.println("Enrolled in :	"+courses);
//		System.out.println("Tuition Balance:	"+tuitionBalance);
		viewBalance();
	}
//	view Balance 
	public void viewBalance()
	{
		System.out.println("Your Tuition Balance is : $"+tuitionBalance);
	}
	
//	pay tuition Fee Payment
	public void payTuition()
	{
		System.out.print("Enter Your Paymet : ");
		Scanner in = new Scanner(System.in);	
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank You for your Payment 0f :$"+payment);
		viewBalance();
	}
	public String toString()
	{
		return "Name: "+firstName+" "+lastName+"\nGrade Level: "+gradeYear+"\nCourses Enrolled: "+courses+"\nBalance: $"+tuitionBalance;
	}
	
	
	
}
