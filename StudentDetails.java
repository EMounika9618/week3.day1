package week3.Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDetails {
	public static void main (String arg[])
	{
	List<College> list = new ArrayList<College>(); 
	list.add(new College(1,"mounika",90632,01, 0));
	list.add(new College(2,"kavya",90633,02, 0)); 
	list.add(new College(3,"pradeep",90634,03, 0));
	list.add(new College(4,"adwike",90635,04, 0));
	//Collections.sort(list,Collections.reverseOrder());
	Collections.reverse(list); 
	System.out.println("Reverse operation:"); 
	System.out.println("SNo\t StudentName \t StudentRollNo \tStudentClass"  );
	for(College str: list)
	{ 
	    System.out.println(str);
	} 
	}
}
