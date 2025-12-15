package javaprogramming;


class Employee {
	
	private String name;
	private int Idno;
	private String Department;
	private double  salary;
	
	
	public String  getname() {
		return name; 
	}
	public int getIdno() {
		return Idno; 
	}
	public String getDepartment() {
		return Department; 
	}
	public double getsalary() {
		return salary; 
	}

	public void setname(String a) {
		this.name=a;
	}
	
	public void setIdno(int a) {
		this.Idno=a;
	}
	
	public void setDepartment(String a) {
		this.Department =a;
	
	}
	public void setsalary(double a) {
		this.salary =a;
	
	}

	
	
	
	
}

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e1= new Employee();
		Employee e2= new Employee();
		
		e1.setname("vivek");
		e1.setIdno(20);
		e1.setDepartment("btech");
		e1.setsalary(1000000);
		
		e2.setname("jerin");
		e2.setIdno(22);
		e2.setDepartment("btech");
		e2.setsalary(2000000);
		
		System.out.println(e1.getname());
		System.out.println(e1.getIdno());
		System.out.println(e1.getDepartment());
		System.out.println(e1.getsalary());
		System.out.println(e2.getname());
		System.out.println(e2.getIdno());
		System.out.println(e2.getDepartment());
		System.out.println(e2.getsalary());

		
	}

}
