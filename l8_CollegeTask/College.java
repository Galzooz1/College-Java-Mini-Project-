package l8_CollegeTask;

import java.util.ArrayList;
import java.util.Scanner;

public class College {
private ArrayList<Lecturer> Lecturers_list;
private ArrayList<Department> Departments_list;
private ArrayList<Student> Students_list;

public College() {
	this.Lecturers_list = new ArrayList<Lecturer>();
	this.Departments_list = new ArrayList<Department>();
	this.Students_list = new ArrayList<Student>();
}

//Add Department
public void addDepartment() {
	System.out.println("Enter department name:");
	Scanner scanner = new Scanner(System.in);
	String name = scanner.next();
	Department d = new Department(name);
	boolean flag = false;
	
	for (int i = 0; i < Departments_list.size(); i++) {
		if(Departments_list.get(i).getName().equals(d.getName())) {
			System.out.println("ERROR! Department didn't added!");
			flag=true;
			break;
			}
	}
	if(!flag) {
		Departments_list.add(d);
		flag=false;
		System.out.println("succesefuly added!");
	}
}

//ADD Lecturer
public void addLecturer() {
	System.out.println("Enter Lecturer name:");
	Scanner scanner = new Scanner(System.in);
	String name = scanner.next();
	System.out.println("Enter lecturer salary:");
	double salary = scanner.nextDouble();
	System.out.println("Enter lecturer ID:");
	long id = scanner.nextLong();
	Lecturer l = new Lecturer(name, salary, id);
	boolean flag = false;
	for (Lecturer lecturer : Lecturers_list) {
		if(lecturer.getId()==l.getId()) {
			System.out.println("Already Exist");
			flag = true;
			break;
		}
	}
	if(!flag) {
		Lecturers_list.add(l);
		System.out.println(l.getName() + " Added");
	}
}

//Add Lecturer to Department
public void addLecToDep() {
System.out.println("Here's the lecturers in our college");
displayLecturers();
System.out.println("Enter the ID of your chosen lecturer:");
Scanner scanner = new Scanner(System.in);
long id = scanner.nextLong();
System.out.println("To which Department you want to add?");
displayCollegeDeps();
String name = scanner.next();
boolean flag = false;
for (Department department : Departments_list) {
	if(department.getName().equals(name)) {
		flag = true;
		for (Lecturer lecturer : Lecturers_list) {
			if(lecturer.getId() == id) {
				department.addLecturer(lecturer);
				System.out.println("Our lecturers in " + name + " department");
				department.displayLect();
				}
			}
		}
	}
	if(!flag) {
		System.out.println("There is no such department, click 2 to add new department!");
	}
}

//Add Student
public void addStudent() {
	System.out.println("Enter Student's name:");
	Scanner scanner = new Scanner(System.in);
	String Studentname = scanner.next();
	System.out.println("Enter Student's ID:");
	long Studentid = scanner.nextLong();
	boolean flag = false;
	for (Student student : Students_list) {
		if(student.getId() == Studentid) {
			flag = true;
			System.out.println("Student ID " + Studentid + " already exist!");
			break;
		}
	}
	if(!flag) {
		Student s = new Student(Studentname, Studentid);
		System.out.println("Here's our available departments");
		displayCollegeDeps();
		System.out.println("Enter department name:");
		String Depname = scanner.next();
		for (Department department : Departments_list) {
			if(department.getName().equals(Depname)) {
				department.addStudent(s);
				Students_list.add(s);
				}
			}
		}
	}

//Print all departments with it's lecturers
public void printDepsWithLect() {
	for (Department department : Departments_list) {
		department.Display();
	}
}

//Print Chosen department students
public void printDepStudentsNames() {
	System.out.println("Here's our departments");
	displayCollegeDeps();
	System.out.println("Enter department name to show the students in:");
	Scanner scanner = new Scanner(System.in);
	String Depname = scanner.next();
	boolean flag = false;
	for (Department department : Departments_list) {
		if(department.getName().equals(Depname)) {
			flag = true;
			System.out.println("Our Students in " + Depname + " department:");
			department.displayStudents();
		}
	}
	if(!flag) {
		System.out.println("There is no such department!");		
	}
}

//Show the biggest department in college by amount of students
public void maxDepStudents() {
	int max = 0;
	String DepName = "";
	for (Department department : Departments_list) {
		if(department.countStudents() > max) {
			max = department.countStudents();
			DepName = department.getName();
		}
	}
	System.out.println("Our most popular department is " + DepName + " with " + max + " Students!");
}


//display departments in college
public void displayCollegeDeps() {
	for (Department department : Departments_list) {
		System.out.println(department.toString());
	}
}

//display the departments
public void displayDepartments() {
	for (Department department : Departments_list) {
		department.displayStudents();
	}
}

public void displayLecturers() {
	for (Lecturer lecturer : Lecturers_list) {
		System.out.println(lecturer.toString());
	}
}


}
