package rdodo.demo.servicec;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import rdodo.demo.servicec.persistance.Attendance;
import rdodo.demo.servicec.persistance.AttendanceRepo;

public class DatabaseInit implements CommandLineRunner{
	@Autowired
	private AttendanceRepo attendanceRepo;
	@Override
	public void run(String... args) throws Exception {
		List<Attendance> attendanceList = new ArrayList<Attendance>();
		
		attendanceList.add(new Attendance("Rahul Dadoriya", 400, 350));
		attendanceList.add(new Attendance("Tommy Hilfigure", 400, 300));
		attendanceList.add(new Attendance("Purnima Singhal", 400, 390));
		attendanceList.add(new Attendance("Jackson", 400, 300));
		attendanceList.add(new Attendance("Ramesh Yadav", 400, 350));
		attendanceList.add(new Attendance("Jonny Sinn", 400, 350));
		attendanceList.add(new Attendance("Emma Watson", 400, 300));
		attendanceList.add(new Attendance("Eva Green", 400, 390));
		attendanceList.add(new Attendance("Narendra Modi", 400, 300));
		
		attendanceRepo.saveAll(attendanceList);
	}

}
