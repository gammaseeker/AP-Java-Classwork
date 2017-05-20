import java.util.ArrayList;
public class Students
{
	//private Student[] students;
	private ArrayList<Student> students = new ArrayList<Student>();
	
	public Students(Student[] theStudents)
	{
		for(int i = 0; i < theStudents.length; i++)
		{
			students.add(theStudents[i]);
		}
	}
	public Students(ArrayList<Student> theStudents)
	{
		students = theStudents;
	}
	public void sortByBoroughGPA()
	{
		for(int i = 0; i < students.size()-1; i++)
		{
			int minIndex = i;
			for(int y = i+1; y < students.size(); y++)
			{
				if(students.get(y).getBorough().compareTo(students.get(minIndex).getBorough()) < 0)
				{
					minIndex = y;
				}	
				if(students.get(y).getBorough().compareTo(students.get(minIndex).getBorough()) == 0)
				{
					if(students.get(y).compareGPA(students.get(minIndex)) > 0)
					{
						minIndex = y;
					}
				}	
			}
			swap(students, minIndex, i);
		}
	}
	public int removeByBorough(String boro)//the borough to be removed
	{
		int ctr = 0;
		for (int i = students.size()-1; i >= 0; i--)
		{
			if(students.get(i).getBorough().equals(boro))
			{
				students.remove(i);
				ctr++;
			}
		}
		return ctr;
	}
	public int removeTopStudents(double score)//score is min value needed for removal
	{
		int ctr = 0;
		for (int i = students.size()-1; i >= 0; i--)
		{
			if(students.get(i).gpa() >= score)
			{
				students.remove(i);
				ctr++;
			}
		}
		return ctr;
	}
	public void sortByGPA()//highest GPA on top
	{
		for(int i = 0; i < students.size()-1; i++)
		{
			int maxIndex = i;
			for(int y = i+1; y < students.size(); y++)
			{
				if(students.get(y).compareGPA(students.get(maxIndex)) > 0)
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
		for(int i = 0; i < students.size()-1; i++)
		{
			int minIndex = i;
			for(int y = i+1; y < students.size(); y++)
			{
				if(students.get(y).compareTo(students.get(minIndex)) < 0)
				{
					minIndex = y;
				}	
			}
			swap(students, minIndex, i);
		}
	}
	private void swap(ArrayList<Student> arr, int a, int b)
	{
		arr.set(b, arr.set(a, arr.get(b)));
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