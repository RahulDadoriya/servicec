package rdodo.demo.servicec.persistance;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AttendanceServiceImpl implements AttendanceService{
	
	@Autowired
	private AttendanceRepo attendanceRepo;
	
	@Override
	public List<Attendance> getAllAttendanceList() {
		// TODO Auto-generated method stub
		return attendanceRepo.findAll();
	}

	@Override
	public Attendance getStudentAttendanceById(int id) {
		// TODO Auto-generated method stub
		return attendanceRepo.getOne(id);
	}

}
