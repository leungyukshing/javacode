public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	public Course(String courseName)
	{
		this.courseName = courseName;
	}

	public void addStudent(String student)
	{
		students[numberOfStudents++] = student;
	}

	public String[] getStudents() { return students; }

	public int getNumberOfStudents() { return numberOfStudents; }

	public String getCourseName() { return courseName; }

	public void dropStudent(String student)
	{
		for(int i = 0; i < numberOfStudents; i++)
		{
			if(students[i] == student)
			{
				for(int j = i; j < numberOfStudents - 1; j++)
				{
					students[j] = students[j + 1];
				}
				numberOfStudents--;
			}
		}
	}
}