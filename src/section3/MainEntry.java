package section3;

public class MainEntry {

	public static void main(String[] args) {
		Person p1;
		Person p2;
		Teacher t = new TeacherImp1("ilker", "java");
		Student s = new StudentImp1("Tyler Merker", "java");
		p1 = (Person) t;
		p2 = (Person) s;
		System.out.println("Person 1 name: " + p1.getName());
		System.out.println("Person 2 name: " + p2.getName());
	}

}
