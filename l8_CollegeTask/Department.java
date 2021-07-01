package l8_CollegeTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Department {
private String name;
private ArrayList<Lecturer> Lecturers_list;
private ArrayList<Student> Students_list;

public Department(String name) {
	this.name = name;
	this.Lecturers_list = new ArrayList<Lecturer>();
	this.Students_list = new ArrayList<Student>();
}

public String getName() {
	return this.name;
}

//TEST
//add new lecturer to department
public void addLecturer(Lecturer l) {
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
		System.out.println(l.getName() + " Added to " + name);
	}
}

//Checking if the department exist
@Override
	public boolean equals(Object obj) {
		if(obj instanceof Department) {
			Department temp = (Department)obj;
			if(temp.name == this.name) {
				return true;
			}
		}
		return false;
	}

//Add Student
public void addStudent(Student s) {
//	System.out.println("Enter Lecturer name:");
	boolean flag = false;
	for (Student student : Students_list) {
		if(student.getId()==s.getId()) {
			System.out.println("Already Exist");
			flag = true;
			break;
		}
	}
	if(!flag) {
		Students_list.add(s);
		System.out.println(s.getName() + " Added to " + name);
	}
}

//GET
public ArrayList<Student> getStudentList(){
	return Students_list;
}

//display the lecturers list 
public void displayLect() {
	for (Lecturer lecturer : Lecturers_list) {
//		lecturer.toString();
		System.out.println(lecturer.toString());
	}
}

//display the students list
public void displayStudents() {
	for (Student Student : Students_list) {
		System.out.println(Student.toString());
	}
}

//Counting the students in each department
public int countStudents() {
	return Students_list.size();
}

public void Display() {
	System.out.println("Department name: " + name);
	this.displayLect();
}

@Override
public String toString() {
	return name;
}

}
