package com.juliano.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.juliano.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		User juliano = new User("1", "Juliano Borel", "juliano@gmail.com");
		User camila = new User("2", "Camila Paz", "camila@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(juliano, camila));
		return ResponseEntity.ok().body(list);
	}
}
