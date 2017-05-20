import java.util.ArrayList;
public class Students
{
	private Student[] students;
	
	public Students(Student[] theStudents)
	{
		students = theStudents;
	}
	public void sortByBoroughGPA()
	{
		for(int i = 0; i < students.length-1; i++)
		{
			int minIndex = i;
			for(int y = i+1; y < students.length; y++)
			{
				if(students[y].getBorough().compareTo(students[minIndex].getBorough()) < 0)
				{
					minIndex = y;
				}	
				if(students[y].getBorough().compareTo(students[minIndex].getBorough()) == 0)
				{
					if(students[y].compareGPA(students[minIndex]) > 0)
					{
						minIndex = y;
					}
				}	
			}
			swap(students, minIndex, i);
		}
	}
	public void sortByGPA()//highest GPA on top
	{
		for(int i = 0; i < students.length-1; i++)
		{
			int maxIndex = i;
			for(int y = i+1; y < students.length; y++)
			{
				if(students[y].compareGPA(students[maxIndex]) > 0)
				{
					maxIndex = y;
				}	
			}
			swap(students, maxIndex, i);
		}
	}
	public void sortAlpha()
	{	
		//ArrayUtils.sortArray(students);
		for(int i = 0; i < students.length-1; i++)
		{
			int minIndex = i;
			for(int y = i+1; y < students.length; y++)
			{
				if(students[y].compareTo(students[minIndex]) < 0)
				{
					minIndex = y;
				}	
			}
			swap(students, minIndex, i);
		}
	}
	private void swap(Student[] arr, int a, int b)
	{
		Student temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	private void swap(String[] arr, int a, int b)
	{
		String temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	private void swap(int[] arr, int a, int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	public ArrayList<Student> getStudentsByBorough(String boro)
	{
		ArrayList<Student> boroList = new ArrayList<Student>();//List<String> boroList = newArrayList<String>();
		for(Student s: students)
		{
			if(s.getBorough().equals(boro))
			{
				boroList.add(s);
			}
		} 
		return boroList;
		/*int count = 0;
	
		for (Student s : students)
			if (s.getBorough().equals(boro))
				count++;
				
		Student[] boroList = new Student[count];
		count = 0;
		for (Student s : students)
			if (s.getBorough().equals(boro))
			{
				boroList[count] = s;
				count++;
			}
				
		return boroList;*/
	}
	
	public String toString()
	{
		String output = "";
		for (Student s : students)
			output += s.toString() + "\n";
		output += "\n";
		
		return output;	
		
	}
}