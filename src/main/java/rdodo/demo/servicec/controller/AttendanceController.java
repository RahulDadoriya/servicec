package rdodo.demo.servicec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import rdodo.demo.servicec.persistance.Attendance;
import rdodo.demo.servicec.persistance.AttendanceService;

@RestController
public class AttendanceController {
	@Autowired
	private AttendanceService attendanceService;
	
	@GetMapping(value = "/attendance/all")
	public ResponseEntity<List<Attendance>> getAllAttendance() {
		return new ResponseEntity<List<Attendance>>(attendanceService.getAllAttendanceList(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/attendance/student/{id}")
	public ResponseEntity<Attendance> getAttendance(@PathVariable("id") int id) {
		return new ResponseEntity<>(attendanceService.getStudentAttendanceById(id), HttpStatus.OK);
	}
}
