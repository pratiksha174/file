package comBikkadIt.SterioTypeAnnotation.controller;


import comBikkadIt.SterioTypeAnnotation.service.welcomeservice;

public class welcomecontroller {
public void welcomecontroler() {


	System.out.println("Taking date from UI layer And send to service layer");
	
	welcomeservice ws = new welcomeservice();
	ws.welcomeservice();
}


	
}

