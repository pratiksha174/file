package comBikkadIt.SterioTypeAnnotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comBikkadIt.SterioTypeAnnotation.dao.studentdao;
import comBikkadIt.SterioTypeAnnotation.model.student;
@Service
public class studentservice {
	

public studentservice() {
		super();
		System.out.println("StudentService Class Constr");
	}
@Autowired
private studentdao sd;

public student savestudent(student stu) {
	student stu1 = studentdao.savestudent(stu);
	return stu1;
	
}
}