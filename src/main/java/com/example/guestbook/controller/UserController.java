package com.example.guestbook.controller;

import com.example.guestbook.Model.User;
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
	List<User> userList = Stream.of(
			new User(1, "Adam", "1st message"),
			new User(2, "Ewa", "2nd message")
	).collect(Collectors.toList());


	@GetMapping("/users")
	public String greetingForm(Model model) {
		model.addAttribute("greetingList", userList);
		model.addAttribute("greeting", new User());
		return "allUsers";
	}

	@PostMapping("/users")
	public String greetingSubmit(@ModelAttribute User user, Model model) {
		userList.add(user);
		model.addAttribute("greetingList", userList);
		return "allUsers";
	}

}
