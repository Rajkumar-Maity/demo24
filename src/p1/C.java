package p1;

import java.io.File;

//File Handling concept in JAVA
//Exists Method:--------------------
public class C {
	public static void main(String[] args) {
		File f = new File("G://filehandling//test1.txt");
		boolean val = f.exists();
		System.out.println(val);
		
	}

}
