package p1;

import java.io.File;

//File Handling concept in JAVA
// Delete Method:--------------------
public class D {
	public static void main(String[] args) {
		File f = new File("G://filehandling//test1.txt");
		boolean val = f.delete();
		System.out.println(val);
		
	}

}
