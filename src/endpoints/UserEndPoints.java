package endpoints;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import webservices.LoginService;
import webservices.RegisterService;

@Path("/userendpoints")
public class UserEndPoints {
	
	@GET
	public String demofunc(){
		return "ok";
	}
	
	@Path("/login")
	public LoginService loginEndPoint() {
		return new LoginService();
	}
	
	@Path("/register")
	public RegisterService registerEndPoint() {
		return new RegisterService();
	}
}
