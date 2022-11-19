package mm;

public class Member {
	  String name;
	  int age;
	  String number;
	  String address;
	  int salary;

	  public void printSalary(){
	    System.out.println(salary);
	  }

	}

	class Employee extends Member{
	  String specialization;
	}

	class Manager extends Member{
	  String department;
	}

	class Ans{
	  public static void main(String[] args){
	    Employee e = new Employee();
	    e.name = "sam";
	    e.age = 24;
	    e.number = "9542219183";
	    e.address = "hyd";
	    e.salary = 30000;
	    e.specialization = "devloper";

	    Manager m = new Manager();
	    m.name = "suhas";
	    m.age = 23;
	    m.number = "9538857802";
	    m.address = "hyd";
	    m.salary = 80000;
	    m.department = "dev";
	    
	    System.out.println("empl name is:"+e.name);
	    System.out.println("empl age is:"+e.age);
	    System.out.println("empl salary is:"+e.salary);
	    System.out.println("empl number is:"+e.number);
	    System.out.println("empl address is:"+e.address);
	    
	    System.out.println("man name is:"+m.name);
	    System.out.println("man age is:"+m.age);
	    System.out.println("man number is:"+m.number);
	    System.out.println("man salary is:"+m.salary);
	    System.out.println("man address is:"+m.address);

	    
	  }
	
	
}


