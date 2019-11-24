package com.bankapp.web.controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bankapp.model.entities.User;
import com.bankapp.model.service.UserService;
import com.bankapp.web.forms.UserFormBean;

@Controller
@RequestMapping(path="empmgt")
public class UserCurdController {

	@Autowired
	private UserService userService;
	
	@GetMapping
	public String accountMenu(){
		return "user_mgt";
	}
	
	@GetMapping(path="adduser")
	public String addNewUserGet(ModelMap map){
		map.addAttribute("userFormBean", new UserFormBean());
		return "add_user";
	}
	
	@PostMapping(path="adduser")
	public String addNewAccountPost(@ModelAttribute(name="userFormBean") 
	UserFormBean userFormBean){
	
		User accountFormBean=init(userFormBean);
		userService.addUser(accountFormBean);
		return "redirect:/empmgt";
	}

	private User init(UserFormBean userFormBean) {
		//name, password, email, phone, address, roles, active
		User user=new User
				(userFormBean.getName(),
				userFormBean.getPassword(),
				userFormBean.getEmail(),
				userFormBean.getPhone(),
				userFormBean.getAddress(), 
				new String[]{userFormBean.getRoles()}, 
				true);
		
		return user;
	}
	
	@ModelAttribute(name="user_roles")
	public List<String> userRoles(){
		return Arrays.asList("ROLE_ADMIN","ROLE_MGR","ROLE_CLERK");
	}
}










