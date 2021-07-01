package l8_CollegeTask;

public class Student {
private String name;
private long id;

//main constructor
public Student(String name, long id) {
	this.name = name;
	this.id = id;
}

//copy constructor
public Student(Student s) {
	this.name = s.name;
	this.id = s.id;
}

//GET
public String getName() {
	return name;
}

public long getId() {
	return id;
}
//toString
public String toString() {
	return "Name: " + name + ", ID: " + id;
}

}
