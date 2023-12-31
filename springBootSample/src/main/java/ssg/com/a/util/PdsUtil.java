package ssg.com.a.util;

import java.util.Date;

public class PdsUtil {
	
	// abc.txt -> 435435345.txt
	public static String getNewfileName(String filename) {
		String newfilename = "";
		String fpost = "";	// .jpg, .txt. .*
										// abc.txt
		if(filename.indexOf('.') >= 0) {	// 확장자명이 있음
			fpost = filename.substring(filename.indexOf('.'));	// .txt
			newfilename = new Date().getTime() + fpost;			// 435435345.txt
		}
		else {	// -1	// 확장자명이 없음
			newfilename = new Date().getTime() + ".back";
		}
		
		return newfilename;
	}

}