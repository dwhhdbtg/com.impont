package com.impont.utils;

public class RestJsonUtils {
		
	 public static JonsUtils success(Object object){
		 JonsUtils jons=new JonsUtils();
		 jons.setData(object);
		 jons.setCode(0);
		 jons.setMsg("成功");
	        return  jons;
	    }
	 public static JonsUtils success(){
	        return  success(null);
	    }
	 public static JonsUtils Error(Integer code,String msg){
		 JonsUtils jons=new JonsUtils();
	
		 jons.setCode(code);
		 jons.setMsg(msg);
	        return  jons;
	    }
}
