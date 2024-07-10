package staticKeyword;

public class StudentsResult {
	
	int roll;
	String name;
	int marks;
	static String schoolName = "ReGrow Tech";  //class Area memory

	public static void main(String[] args) {
		
		StudentsResult s1 = new StudentsResult();
		StudentsResult s2 = new StudentsResult();
		StudentsResult s3 = new StudentsResult();
		
		System.out.println(s1.schoolName);
		System.out.println(s2.schoolName);
		System.out.println(s3.schoolName);
		
		s3.schoolName = "XYZ School";
		System.out.println(s3.schoolName);
		System.out.println(s1.schoolName);
		
		s2.schoolName = "RGT";
		System.out.println(s1.schoolName);
		
		
	}

}
