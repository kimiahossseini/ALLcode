package ir.freeland.serialization.security;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L; 

    private String name;
    private int age;
    private String password; //transient 

	public User(String name, String password, int age) {
		this.name = name;
		this.password = password;
		this.age = age;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

   
}