package l8_CollegeTask;

public class Lecturer {
private String name;
private double salary;
private long id;

//main constructor
public Lecturer(String name, double salary, long id) {
	this.name = name;
	this.salary = salary;
	this.id = id;
}

//copy constructor
public Lecturer(Lecturer l) {
	this.name = l.name;
	this.salary = l.salary;
	this.id = l.id;
}

//GET Method
public String getName() {
	return name;
}

public double getSalary() {
	return salary;
}

public long getId() {
	return id;
}

@Override
	public boolean equals(Object obj) {
		if (obj instanceof Lecturer) {
			Lecturer temp = (Lecturer)obj;
			if (temp.id == this.id) {
				return true;
			}
		}
		return false;
	}

//toString
public String toString() {
	return "Name: " + name + ", Salary: " + salary + ", ID: " + id;
}

}
