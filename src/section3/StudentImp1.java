package section3;

public class StudentImp1 extends PersonBaseImp1 implements Student {
public String takenCourseTitle;
public StudentImp1(String _name, String _takenCourseTitle)
{
	super(_name);
	name = _name;
	takenCourseTitle = _takenCourseTitle;
}
	public String studiesFor() {
		// TODO Auto-generated method stub
		return takenCourseTitle;
	}
	public String getDetails()
	{
		return studiesFor();
	}
}
