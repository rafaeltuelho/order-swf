package services;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/supplier")
public class Supplier {

	@POST
	@Path("{supplier-id}")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	public String sendOrder(@PathParam("supplier-id") String supplierId, String orderNumber) {
		System.out.println(String.format("Supplier %s received the order %s", supplierId ,orderNumber));
		return "receipt-"+supplierId+"-"+orderNumber;
	}

	@DELETE
	@Path("{supplier-id}")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	public String cancelOrder(@PathParam("supplier-id") String supplierId, String orderNumber) {
		System.out.println(String.format("Supplier %s acknoledeges the order cancellation %s", supplierId ,orderNumber));
		return "cancel-ack-"+supplierId+"-"+orderNumber;
	}
}
