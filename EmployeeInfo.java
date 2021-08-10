
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Employer {
	private String organisation;
	private String location;

	public Employer() {
	}

	public Employer(String organisation, String location) {
		this.organisation = organisation;
		this.location = location;
	}

	public String getOrganisation() {
		return organisation;
	}

	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

@Override
public String toString() {

return "Employer [organisation = " + organisation + ", " + ", location = " + location

+ "]";

}
}

//child 1
class Employee extends Employer {
	private String name;
	private int projects;
	private String designation;
	private double salary;

	public Employee() {
	}

	public Employee(String organisation, String location, String name, int projects, String designation,
			double salary) {
		super(organisation, location);
		this.name = name;
		this.projects = projects;
		this.designation = designation;
		this.salary = salary + salary * (projects * 0.5);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getProjects() {
		return projects;
	}

	public void setProjects(int projects) {
		this.projects = projects;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary + salary * (projects * 0.5);
	}

	@Override
	public String toString() {
		return "Employer" + super.toString() + " Employee [name=" + name +

				", noOfProjects=" + projects

				+ ", designation=" + designation + ", Salary=" + salary

				+ "]";
	}
}

//child 2
class Intern extends Employer {
	private String name;
	private String designation;
	private float stippend;

	public Intern() {
	}

	public Intern(String organisation, String location, String name, String designation, float stippend) {

		super(organisation, location);
		this.name = name;
		this.designation = designation;
		this.stippend = stippend;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public float getStippend() {
		return stippend;
	}

	public void setStippend(float stippend) {
		this.stippend = stippend;
	}

@Override
public String toString() {
return "Employer" + super.toString() + " Interns [name=" + name + ", designation=" + designation + ", Stippend="
+ stippend + "]";

}

}

public class EmployeeInfo {
	public static void main(String[] args) throws Exception {
		Employee employee = new Employee("Apisero", "Pune", "Adnan", 2,

				"Software Engineer", 1000000.99d);
		System.out.println(employee);
		Intern intern = new Intern("Apisero", "Pune", "Salman", "Intern",

				10000.01f);

		System.out.println(intern);
	}
}