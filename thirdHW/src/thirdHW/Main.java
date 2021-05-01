package thirdHW;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		instructor.name = "Engin Demiro�";

		UserManager userManager = new UserManager();
		userManager.add(new InstructorManager());

		Student student = new Student();
		student.name = "Abdullah Umut �zt�rk";
		userManager.add(new StudentManager());
	}

}
