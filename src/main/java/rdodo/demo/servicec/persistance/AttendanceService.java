package rdodo.demo.servicec.persistance;

import java.util.List;

public interface AttendanceService {
	List<Attendance> getAllAttendanceList();
	Attendance getStudentAttendanceById(int id);
}
