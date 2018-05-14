package com.impont.utils;

import java.util.List;

import lombok.Data;
@Data
public class JonsUtils<T> {
	
	private Integer code;
	
	private String msg;
	
	private T data;
	
	
}
