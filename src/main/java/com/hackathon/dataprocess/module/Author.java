package com.hackathon.dataprocess.module;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "AUTHOR")
@Data
@Setter
@Getter
public class Author {

	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	@Column(name="AUTHORNAME")
	private String authorName;
	@Column(name="SEX")
	private String sex;
	
}
