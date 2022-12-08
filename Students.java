package Collaction.Genrics.Exercises02;

public class Students  implements Comparable<Students> {
	private String code;  
	private String name;
	private int age;
	private String state;
	public Students() {
		
	}
	
	
	public Students(String code,String name,int age,String state){  
	   this.code=code;  
	   this.name=name;  
	   this.age=age;  
	   this.state=state;
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

	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}
	
	


	@Override
	public int compareTo(Students student) {
		if(age==student.age) {
			return 0;
		}
		else if (age>student.age) {
			return 1;
		}
		else {
			return -1;
		}
		
	}


	@Override
	public String toString() {
		return "Student [code: " + code + ", name: " + name + ", age: " + age +", state: " +state
				+ "]";
	}
}

