package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.Student;
import id.ac.undiksha.siak.entities.Lecturer;
import id.ac.undiksha.siak.entities.Staff;
import id.ac.undiksha.siak.entities.Person;

public class Main {

	public static void main(String[] args) {		
		Student siA = new Student();
		siA.setName("Jaka Sembung");
		siA.setAddress("Singaraja");
		siA.setNim("666");
		siA.setGender(true);
		siA.getStudyProgram().setStudyProgramCode("12334");
		siA.getStudyProgram().setStudyProgramName("Ilmu Komputer");

		siA.getStudyProgram().getCoordinator().setName("Made Sutisna");
		siA.getStudyProgram().getCoordinator().setNip("6699442200");
		siA.getStudyProgram().getCoordinator().setGender(true);
		siA.getStudyProgram().getCoordinator().setAddress("Banyuning");
		siA.printAllInfo();
		siA.getName();
		siA.getStudyProgram().getStudyProgramName();	
	}
}
