package com.mondia.swagger.test.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

@Path("/customers")
@Api(value = "/customers", description = "Operations about Customers")
public class BillingService {

	@GET
	@Path("/getallcustomers")
	@ApiOperation(value = "Find pet by ID", notes = "More notes about this method", response = BillingService.class)
	@ApiResponses({
	  @ApiResponse(code = 400, message = "Invalid ID supplied"),
	  @ApiResponse(code = 404, message = "Pet not found") 
	})
	@Produces(MediaType.APPLICATION_JSON)
	public String getallCustomers() {
		return "HelloWorld";
	}

	
	
	

}
