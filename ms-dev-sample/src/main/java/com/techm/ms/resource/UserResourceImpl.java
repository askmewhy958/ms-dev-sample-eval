package com.techm.ms.resource;

import java.util.List;

import javax.ws.rs.core.Link;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.techm.ms.model.Account;
import com.techm.ms.model.User;
import com.techm.ms.model.representation.ResourceCollection;
import com.techm.ms.service.AccountService;
import com.techm.ms.userservice.UserService;

@Controller
public class UserResourceImpl implements UserResource {

	public static final Logger logger = LoggerFactory.getLogger(AccountResourceImpl.class);

	@Autowired
	UserService userservice; 
	
	private static String baseUrl = "/users";



	@Override
	public Response findAllUsers() {
		List<User> users = userservice.findAllUsers();	
		if (users == null) {
			return Response.noContent().build();
		}
		Link link = Link.fromUri(baseUrl).rel("self").build();		
		ResourceCollection<User> resource = new ResourceCollection<>(users);
		return Response.ok(resource).links(link).build();
	}	
}
