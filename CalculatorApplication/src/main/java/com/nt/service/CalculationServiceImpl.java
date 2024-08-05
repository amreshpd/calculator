package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Calculator;
import com.nt.repo.ICalculator;

@Service("/calculation")
public class CalculationServiceImpl implements ICalculationService{
	@Autowired
	private ICalculator repo;

	@Override
	public Iterable<Calculator> getAllCalculation() {
		
		return repo.findAll();
	}
	
}
