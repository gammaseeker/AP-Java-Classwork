public class TestStudents
{
	public static void main(String[] args)
	{
		Student s = new Student("Samuel", new int[]{74, 65, 70}, "none");
		Student u = new UnderGrad("Ulysses", new int[] {74, 65, 70}, "none");
		Student g = new GradStudent("Gunner", new int[] {95, 90, 85}, "none", 1234);
		//g.getID() does not work. During compile time g is a Student and it does not have getID() until run time
		//where it becomes a GradStudent
		
		s.computeGrade();//Compile time: sees Student. Run time: sees actual datatype
		u.computeGrade();
		g.computeGrade();
		
		System.out.println(s.getName() + ", " + s.getGrade());
		System.out.println(u.getName() + ", " + u.getGrade());
		System.out.println(g.getName() + ", " + g.getGrade());
		int gradNum = ((GradStudent)g).getID();//down casting
		System.out.println(gradNum);
	}
}