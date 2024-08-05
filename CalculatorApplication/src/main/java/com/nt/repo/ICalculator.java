package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.Calculator;

public interface ICalculator extends JpaRepository<Calculator, Integer> {

}
