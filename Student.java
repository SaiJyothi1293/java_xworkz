

class Student {
	String name;
	int rollNumber;
	String collegeName;
	String branch;

	void reading() {
		System.out.println(name + " " + collegeName + " " + rollNumber + " " + branch + "Student is reading..");
	}

	void singing() {
		System.out.println(name + " " + collegeName + " " + rollNumber + " " + branch + "Student is singing");
	}

public static void main(String args[])
{
Student Jyothi = new Student();
Jyothi.name = "Jyothi";
Jyothi.rollNumber = 1;
Jyothi.collegeName = "Best";
Jyothi.branch = "IT";
Jyothi.reading();
Jyothi.singing();


Student Sushmitha = new Student();
Sushmitha.name = "Sushmitha";
Sushmitha.rollNumber = 2;
Sushmitha.collegeName = "Best";
Sushmitha.branch = "CSE";
Sushmitha.reading();
Sushmitha.singing();

Student Srinath = new Student();
Srinath.name = "Srinath";
Srinath.rollNumber = 3;
Srinath.collegeName = "Best";
Srinath.branch = "EIE";
Srinath.reading();
Srinath.singing();




}
}
