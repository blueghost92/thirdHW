package thirdHW;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		instructor.firstName = "Engin Demiroğ";

		UserManager userManager = new UserManager();
		userManager.add(new InstructorManager());

		Student student = new Student();
		student.firstName = "Abdullah Umut Öztürk";
		userManager.add(new StudentManager());
	}

}
