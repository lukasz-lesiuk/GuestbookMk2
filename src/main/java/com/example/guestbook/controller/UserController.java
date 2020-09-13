package com.example.guestbook.controller;

import com.example.guestbook.model.User;
import com.example.guestbook.service.userService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
public class UserController {
	//temp
//	List<User> userList = Stream.of(
//			new User(1, "Adam", "1st message"),
//			new User(2, "Ewa", "2nd message")
//	).collect(Collectors.toList());

	private userService userService;

	public UserController(userService userService) {
		this.userService = userService;
	}

	@GetMapping("/users")
	public String greetingForm(Model model) {
		model.addAttribute("greetingList", userService.getUsers());
		model.addAttribute("greeting", new User());
		return "allUsers";
	}

	@PostMapping("/users")
	public String greetingSubmit(@ModelAttribute User user, Model model) {
		userService.addUser(user);
		model.addAttribute("greetingList", userService.getUsers());
		return "allUsers";
	}

}
