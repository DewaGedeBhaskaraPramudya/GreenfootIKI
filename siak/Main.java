package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.Student;
import id.ac.undiksha.siak.entities.Lecturer;
import id.ac.undiksha.siak.entities.Staff;
import id.ac.undiksha.siak.entities.Person;

public class Main {

	public static void main(String[] args) {		
		//System.out.println(std1.getName());
		//System.out.println(std1.getAddress());
		
		
		//std2.printAllInfo();
		
		//Lecturer lect1 = new Lecturer(
		//		"192837",
		//		"Made Bagker",
		//		"Tukad Buluh",
		//		true,
		//		"Computer Science",
		//		"Informatika",
		//		"FTK"
		//					
		//		);
		/*
		Staff st1 = new Staff(
				"192887",
				"Made Jangkrik",
				"Tukad Buluh",
				true,
				"Unit 1"	
				);
		
		lect1.printAllInfo();
		st1.printAllInfo();
		*/
		
		//Person siX = new Student();
		Student siZ = new Student("Caca", "Buleleng", false, "1223", "Computer", "Informatika","FTK");
		
		siZ.printAllInfo();
		
		Lecturer lc1 = new Lecturer("Jaka", "Buleleng", true, "1122", "Computer", "Informatika", "FTK");
		
		lc1.printAllInfo();
		
		Staff st1 = new Staff("Toyib", "Gobleg", true, "1133", "1");
		
		st1.printAllInfo();
	}
	
		
		

}
