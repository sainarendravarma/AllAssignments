package com.aaslin.march21.second;

/*Author : Narendra 
CustomDS with getter and setter methods*/

public class CustomDS {
	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CustomDS(Integer key, String value) {
		this.id = key;
		this.name = value;
	}

	@Override
	public String toString() {
		return "id = " + this.id + ", value = " + this.name;
	}

}
