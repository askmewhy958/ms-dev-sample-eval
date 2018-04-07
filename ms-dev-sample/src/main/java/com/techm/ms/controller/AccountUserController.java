package com.techm.ms.controller;

import java.util.List;

import javax.ws.rs.Path;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techm.ms.model.Account;
import com.techm.ms.service.AccountService;

import io.swagger.annotations.Api;

@RestController
@Api("account")
@Path("/accounts/*")
public class AccountUserController {
	
	private AccountService serv;
	
		

}
