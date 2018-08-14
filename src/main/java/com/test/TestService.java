package com.test;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
/**
 * @author naveenvemulapalli
 *
 */
@Path("/testservice")
public class TestService {
 
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String getTestService() {
    return "Hello World! This is coming from webservice!!";
  }
  
}