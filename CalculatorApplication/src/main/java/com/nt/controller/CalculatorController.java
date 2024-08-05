package com.nt.controller;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.model.Calculator;
import com.nt.service.ICalculationService;

@Controller
public class CalculatorController {
	@Autowired
	private ICalculationService service;
    @GetMapping("/")
	public String showHome() {
		return "home";
	}
    @GetMapping("/cal")
    public String calculationPart(Map<String, Object> map) {
    	map.put("abc", LocalDateTime.now());
    	return "show_calculation";
    }
    @GetMapping("/add")
    public String addition(Map<String, Object> map) {
    	map.put("ram", LocalDateTime.now());
    	return "addition_part";
    }
    @GetMapping("/sub")
    public String substraction(Map<String, Object> map) {
    	map.put("ram", LocalDateTime.now());
    	return "substraction_part";
    }
    @GetMapping("/mul")
    public String multiplication(Map<String, Object> map) {
    	map.put("ram", LocalDateTime.now());
    	return "multiplication_part";
    }
    @GetMapping("/div")
    public String division(Map<String, Object> map) {
    	map.put("ram", LocalDateTime.now());
    	return "division_part";
    }
    @GetMapping("/sin")
    public String sinTheta(Map<String, Object> map) {
    	map.put("ram", LocalDateTime.now());
    	return "sin_part";
    }
    @GetMapping("/cos")
    public String cosTheta(Map<String, Object> map) {
    	map.put("ram", LocalDateTime.now());
    	return "cos_part";
    }
    @GetMapping("/tan")
    public String tanTheta(Map<String, Object> map) {
    	map.put("ram", LocalDateTime.now());
    	return "tan_part";
    }
    @GetMapping("/cot")
    public String cotTheta(Map<String, Object> map) {
    	map.put("ram", LocalDateTime.now());
    	return "cot_part";
    }
    @GetMapping("/sec")
    public String secTheta(Map<String, Object> map) {
    	map.put("ram", LocalDateTime.now());
    	return "sec_part";
    }
    @GetMapping("/cosec")
    public String cosecTheta(Map<String, Object> map) {
    	map.put("ram", LocalDateTime.now());
    	return "cosec_part";
    }
    @GetMapping("/log")
    public String logTheta(Map<String, Object> map) {
    	map.put("ram", LocalDateTime.now());
    	return "log_part";
    }
    @GetMapping("/ln")
    public String lTheta(Map<String, Object> map) {
    	map.put("ram", LocalDateTime.now());
    	return "ln_part";
    }
    @GetMapping("/mean")
    public String mean(Map<String, Object> map) {
    	map.put("ram", LocalDateTime.now());
    	return "mean_part";
    }
    @GetMapping("/median")
    public String median(Map<String, Object> map) {
    	map.put("ram", LocalDateTime.now());
    	return "median_part";
    }
    @GetMapping("/deviation")
    public String deviation(Map<String, Object> map) {
    	map.put("ram", LocalDateTime.now());
    	return "deviation_part";
    }
    @GetMapping("/exp")
    public String exponent(Map<String, Object> map) {
    	map.put("ram", LocalDateTime.now());
    	return "exp_part";
    }
    @GetMapping("/power")
    public String power(Map<String, Object> map) {
    	map.put("ram", LocalDateTime.now());
    	return "power_part";
    }
    
    @GetMapping("/show_report")
    public String showAllCalculation(Map<String, Object> map) {
    	Iterable<Calculator> al = service.getAllCalculation();
    	map.put("calList", al);
    	return "show_all_details";
    }
    
}
