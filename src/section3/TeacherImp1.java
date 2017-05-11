package section3;

public class TeacherImp1 extends PersonBaseImp1 implements Teacher {
public String thoughtCourseTitle;

public TeacherImp1(String _name, String _thoughtCourseTitle)
{
	super(_name);
	name = _name;
	thoughtCourseTitle = _thoughtCourseTitle;
}
	public String teachesFor() {
		return thoughtCourseTitle;
	}
	@Override
	public String getDetails() {
		return teachesFor();
	}

}
