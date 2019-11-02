package com.lti.jerseyWebApp;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("/books")
public class BookService {
	
	@Path("/commited")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Book getBook()
	{
		Book b=new Book();
		b.setId(1);
		b.setName("Head First Java");
		b.setIsbn("ISBN-000-1111");
		b.setAuthor("Kathy");
		b.setPrice(2000.45f);
		
		return b;
	}

	@Path("/single")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Book getBook1()
	{
		Book b=new Book();
		b.setId(1);
		b.setAuthor("Kathy");
		//b.setPublish("ABC");
		
		return b;
	}
}

