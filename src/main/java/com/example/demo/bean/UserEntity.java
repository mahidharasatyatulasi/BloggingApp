package com.example.demo.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class UserEntity {

	@Id
	@GeneratedValue
	private int userId;
	
	@NotEmpty
	private String email;
	@Size(min=8,max=15, message="Min 8 characters required")
	private String password;
	private String role;
	//@JsonIgnore
	private boolean loginStatus;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="userId")
	@JsonIgnore
	private Admin admin;
	
	
	public UserEntity() {
		super();
	}


	public UserEntity(int userId, @NotEmpty String email,
			@Size(min = 8, max = 15, message = "Min 8 characters required") String password, String role,
			boolean loginStatus) {
		super();
		this.userId = userId;
		this.email = email;
		this.password = password;
		this.role = role;
		this.loginStatus = loginStatus;
	}
	
	
	
}
