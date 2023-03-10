package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.model;
import com.example.demo.Services.services;

@CrossOrigin
@RestController
public class controller {
	
		@Autowired
		services s;

		@GetMapping("/get")
		public List<model> showDetails() {
			return s.getDetails();
		}

		@PostMapping("/post")
		public String addDetails(@RequestBody model m) {
			s.add(m);
			return "Added product " + m.getSno();
		}
		@PutMapping("/update")
		public model updateInfo(@RequestBody model st1) {
			return s.updateDetails(st1);
		}
		
		@DeleteMapping("/delete/{sno}")
		public String deleteInfo(@PathVariable("sno") int sno) {
			s.deleteDetails(sno);
			return "Deleted Details";
		}

		//sorting
		@GetMapping("/product/{field}")
		public List<model> getWithSort(@PathVariable String field) {
			return s.getSorted(field);
		}

		// pagination
		@GetMapping("/product/{offset}/{pageSize}")
		public List<model> productsWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
			return s.getWithPagination(offset, pageSize);
		}

		

}
