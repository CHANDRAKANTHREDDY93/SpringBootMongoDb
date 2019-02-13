package com.chand.demo.data;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data 
@Document(collection="school")
public class Schooling {
	@Id
	@Generated
	private String id;
	private String schoolId;
	private String schoolName;
	private List subjects;
	private Date startYear;
	private Date endYear;
	
}
