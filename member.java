package m;


import java.util.Scanner;

public class Member {
	private String name;
	private int age;
	private long phoneNumber;
	private String address;
	private double salary;
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	void printSalary()
	{
		System.out.println("Salary of the member is" + salary);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
		
	}
	void setDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of member");
		name = sc.next();
		System.out.println("Enter the age of member");
		age = sc.nextInt();
		System.out.println("Enter the phoneNumber of Member");
		phoneNumber = sc.nextLong();
		System.out.println("Enter the Address of the member");
		address = sc.next();
	}
	void getDetails()
	{
		System.out.println("name:" + this.name);
		System.out.println("age:" + this.age);
		System.out.println("phoneNumber:" + this.phoneNumber);
		System.out.println("address:" + this.address);
	}
}
	//Employee class
 class Employee extends Member{
		private String specialization;
		private String department;
		public String getSpecialization() {
			return specialization;
		}
		public void setSpecialization(String specialization) {
			this.specialization = specialization;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public void setDetails()
		{
			super.setDetails();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the employee specialization");
			specialization = sc.next();
			System.out.println("Enter the employee department");
			department = sc.next();
		}
		public void getDetails()
		{
			super.getDetails();
			System.out.println("specialization:" + this.specialization);
			System.out.println("department:" + this.department);
		}
	}

class Managers extends Employee{
	private String specialization;
	private String department;
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setDetails()
	{
		super.setDetails();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee specialization");
		specialization = sc.next();
		System.out.println("Enter the employee department");
		department = sc.next();
	}
	public void getDetails()
	{
		super.getDetails();
		System.out.println("specialization:" + this.specialization);
		System.out.println("department:" + this.department);
	}	
}


