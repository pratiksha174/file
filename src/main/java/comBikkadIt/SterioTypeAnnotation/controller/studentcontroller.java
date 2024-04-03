package comBikkadIt.SterioTypeAnnotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import comBikkadIt.SterioTypeAnnotation.model.student;
import comBikkadIt.SterioTypeAnnotation.service.studentservice;
@RestController
public class studentcontroller {
	
	
	public studentcontroller() {
		super();
		System.out.println("StudentController CLass Contsr");
	}
@Autowired
private studentservice ss;
	public student savestudent(student stu) {
		studentservice ss = new studentservice();
		
		return stu;
	}

}
