package test;

public class Person implements java.io.Serializable {
	private static final long serialVersionUID = 282847449445553822L;
	private String name;
	private Integer age;

	public Person() {
	}

	public Person(String name, Integer age) {
		this.name = name + "(Object Processed by Mule Java Class)";
		this.age = age;
	}

	public String getEmpName() {
		return name + " (Object processed by Java Class)";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
