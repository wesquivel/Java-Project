package Data;

public class Teacher {
	
	public int id_teacher;
	private String name;
	private int salary;
	private boolean fulltime;
	private int hours_per_week;
	
	
	public Teacher(int id_teacher, String name, int salary, boolean fulltime,
						int hours_per_week) {
		
		this.id_teacher = id_teacher;
		this.name = name;
		this.salary = salary;
		this.fulltime = fulltime;
		this.hours_per_week = hours_per_week;
		
	}
	
	public int getId_teacher() {
		return id_teacher;
	}

	public void setId_teacher(int id_teacher) {
		this.id_teacher = id_teacher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public boolean isFulltime() {
		return fulltime;
	}

	public void setFulltime(boolean fulltime) {
		this.fulltime = fulltime;
	}

	public int getHours_per_week() {
		return hours_per_week;
	}

	public void setHours_per_week(int hours_per_week) {
		this.hours_per_week = hours_per_week;
	}

	public int newsalary(boolean fulltime, int salary, int hours_per_week) {
		int newsalary = 0;
		if (fulltime == true) {
			newsalary = salary + (salary * 110)/100; 
			return newsalary;
		}
		 else{
			newsalary = salary * hours_per_week;
			return (newsalary);
		}	
	}
	
	@Override
	public String toString() {
		return "Teacher[Teacher ID: "+ id_teacher + ", Name: \"+ name +\", Salary: \"+ salary+\", Full Time?: \"+ fulltime +\", Hours Per Week: " + hours_per_week +"]\n";
	}
}

