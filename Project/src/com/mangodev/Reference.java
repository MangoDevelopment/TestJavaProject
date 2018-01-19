package com.mangodev;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Reference {
	
	public static String timeStamp = new SimpleDateFormat("dd.HH.mm.ss").format(new Date());
	
	public static void Stamp(String messageType){
		System.err.println("[" + timeStamp + "] [" + messageType + "]");
	}
	
	
}
