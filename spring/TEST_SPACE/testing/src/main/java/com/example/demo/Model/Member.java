package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {

	private String mail;
	private String name;
	private String mobile;
	private String gender;
	
	public Member(String mail, String name, String mobile, String gender) {
		super();
		this.mail = mail;
		this.name = name;
		this.mobile = mobile;
		this.gender = gender;
	}

	public Member() {
		super();
	}
	
	
}
