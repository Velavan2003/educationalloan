package com.example.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.loan.model.LoanModel;
import com.example.loan.repository.LoanRepository;
@CrossOrigin("*")
@RestController
public class LoanController {
	@Autowired
	LoanRepository lr;
	@GetMapping("/loan")
	public List<LoanModel>getAllDetails(){
		return lr.findAll();
	}
	@DeleteMapping("/loan/{id}")
   	public String deleteById(@PathVariable int id)
   	{
   		lr.deleteById(id);
   		return "Id details deleted";
   	}

}
