package StudentDatabaseApplication;

import java.util.Scanner;

public class StudentDataBaseApp {

	public static void main(String[] args)
	{		
//		ask how many number of students need to be created 
		System.out.print("Enter number of Students to Enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
	
//		create n number of students
		for(int i  = 0 ;i<numOfStudents;i++)
		{
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			System.out.println(students[i].toString());
		}
		

	}

}
