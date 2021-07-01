package l8_CollegeTask;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College Singa = new College();
		Scanner scanner = new Scanner(System.in);
		int choice;
		while(true) {
		System.out.println("");
		System.out.println("1. Add new Lucturer");
		System.out.println("2. Add new Department");
		System.out.println("3. Add Lecturer to Department");
		System.out.println("4. Add new Student");
		System.out.println("5. Show all Students in chosen department");
		System.out.println("6. Show most popular department in our college");
		System.out.println("7. Show all departments in college and it's lecturers");
		choice = scanner.nextInt();
		switch(choice) {
		case 1:
			Singa.addLecturer();
			Singa.displayLecturers();
			break;
		case 2:
			Singa.addDepartment();
			Singa.displayDepartments();
			break;
		case 3:
			Singa.addLecToDep();
			break;
		case 4:
			Singa.addStudent();
			break;
		case 5:
			Singa.printDepStudentsNames();
			break;
		case 6:
			Singa.maxDepStudents();
			break;
		case 7:
			Singa.printDepsWithLect();
			break;
		default:
			break;
		}
		}
	}

}
