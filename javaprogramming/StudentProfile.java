package javaprogramming;

class Student {
	
	private String  name;
	private int Rollno;
	private float percentage;
	
	public String getname() {
		return name;
	}
	
	public int getRollno() {
		return Rollno;
	}
	
	public float getpercentage() {
		return percentage;
	}
	
	public void setname(String a) {
		this.name=a;
	}
	
	public void setRollno(int a) {
		this.Rollno=a;
	}
	
	public void setpercentage(float a) {
		this.percentage =a;
	
	}
}

public class StudentProfile {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.setname("virat");
		s1.setRollno(20);
		s1.setpercentage(30f);
		
		System.out.println(s1.getname());
		System.out.println(s1.getRollno());
		System.out.println(s1.getpercentage());


		
	}

}
