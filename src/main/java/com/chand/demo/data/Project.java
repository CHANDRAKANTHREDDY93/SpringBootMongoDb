package com.chand.demo.data;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Project {
	
	private String name;
	private String version;
	
}
