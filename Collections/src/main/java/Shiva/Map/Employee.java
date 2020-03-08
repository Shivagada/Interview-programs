package Shiva.Map;

public class Employee {
	private int id,age;
	private String name;
	private long phno;
	 
	public Employee(int id,int age, String name, long phno) {
		super();
		this.id = id;
		this.name = name;
		this.phno = phno;
		this.age=age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", phno=" + phno + "]";
	}
	 

}
