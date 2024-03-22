
class Employee1 {
    private String name;
    private int age;
    private String position;
	public int getAge() {
		
		return age;
	}
	public String getName() {
		return name;
	}
	public String getPosition() {
		return position;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Employee1( int age,String name, String position) {
		super();
		this.name = name;
		this.age = age;
		this.position = position;
	}
	
	

}