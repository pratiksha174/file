package comBikkadIt.SterioTypeAnnotation.dao;

import org.springframework.stereotype.Repository;

import comBikkadIt.SterioTypeAnnotation.model.student;
@Repository
public class studentdao {
	
	
public studentdao() {
		super();
		System.out.println("StudentDao Class Constr");
	}

public static student savestudent(student stu) {
	
	System.out.println(stu);
	return stu;
	
}
}