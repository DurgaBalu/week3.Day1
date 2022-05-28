package week3.Day1;

//Week3 Day1 Assignment - 4
public class Students {

	public void studentInfo(int id) {
		System.out.println("This Method Contains Student ID details : " + id);
	}

	public void studentInfo(int id, String name) {
		System.out.println("This Method Contain Student ID and  Name details : " + id + " and " + name);
	}

	public void studentInfo(String email, long phoneNumber) {
		System.out.println("This Method Contain Student Email and  Phone Number details : " + email + " and " + phoneNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students studDetail = new Students();
		studDetail.studentInfo(127);
		studDetail.studentInfo(128, "Durga");
		studDetail.studentInfo("Durgabalu@gmail.com", 9951446543l);
	}

}
