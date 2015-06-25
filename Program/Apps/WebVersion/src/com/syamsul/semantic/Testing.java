package com.syamsul.semantic;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("api")
public class Testing {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String test(){
		return "this is testing";
	}
	
}
