package comBikkadIt.SterioTypeAnnotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import comBikkadIt.SterioTypeAnnotation.controller.studentcontroller;
import comBikkadIt.SterioTypeAnnotation.model.student;


@SpringBootApplication
public class SterioTypeAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SterioTypeAnnotationApplication.class, args);
	
	//welcomecontroller wc = new welcomecontroller();
	//wc.welcomecontroler();
		student stu = new student();
		stu.setFname("pratu");
		stu.setLname("nirpal");
		stu.setAddress("pune");
		stu.setAddharNo("94754636374");
		
	studentcontroller stuc = new studentcontroller();
	stuc.savestudent(stu);
	}

}
