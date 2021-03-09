package com.in28minutes.rest.webservices.restfulwebservices.swagger.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@GetMapping(path = "v1/person")
	public PersonV1 personV1() {
		return new PersonV1("Alexandre Lopes");
	}
	
	@GetMapping(path = "v2/person")
	public PersonV2 personV3() {
		return new PersonV2(new Name("Alexandre", "Lopes"));
	}
}
