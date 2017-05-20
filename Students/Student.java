public class Student
{
	private String lastName;
	private String firstName;
	private String borough;
	private int[] grades;
	
	public Student(String lName, String fName, 
					String boro, int[] grades)
	{
		lastName = lName;
		firstName = fName;
		borough = boro;
		this.grades = grades;
	}
	
	public int compareTo(Student other)
	{
		int lastCompare = 
			this.lastName.compareTo(other.lastName);
		if (lastCompare == 0)
			return this.firstName.compareTo(
									other.firstName);
			
		return lastCompare;
	}
	public double compareGPA(Student other)
	{
		double gpaCompare = Double.toString(this.gpa()).compareTo(Double.toString(other.gpa()));
		if(gpaCompare == 0)
		{
			return compareTo(other);
		}
		return gpaCompare;
	}
	public double gpa()
	{
		int total = 0;

		for (int grade : grades)
			total += grade;
		
		return (double)total / grades.length;
	}
	
	public String toString()
	{
		return firstName + " " + lastName + 
			", " + borough + ", gpa = " + gpa();
	}
	
	public String getBorough()
	{
		return borough;
	}
}