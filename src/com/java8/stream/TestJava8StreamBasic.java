package com.java8.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestJava8StreamBasic {
	public static void main(String[] args) {
		List<Employee> emplist = List.of(
				new Employee(101, "Nandan", 5500.0, "DEV"),
				new Employee(103, "Rohan", 4500.0, "QA"),
				new Employee(102, "Nikhil", 6500.0, "BA"),
				new Employee(107, "Lakshmi", 5000.0, "BA"),
				new Employee(104, "Sonali", 5500.0, "DEV"),
				new Employee(105, "Asma", 4000.0, "QA"),
				new Employee(106, "Geetha", 4800.0, "DEV"),
				new Employee(108, "Mihir", 6000.0, "BA"),
				new Employee(109, "Suraj", 7500.0, "DEV"));
		
//		emplist.stream().forEach(System.out::println);
		
//		Find Max Salary of Employee
//		Employee emp = emplist.stream().max((e1,e2)-> e1.getEsal().compareTo(e2.getEsal())).get();
//		System.out.println(emp);
//		Employee emp = emplist.stream().max(Comparator.comparingDouble(Employee::getEsal)).get();
//		System.out.println(emp);
		
		//Get second Highest salary of employee
//		emplist.stream().sorted((e1, e2) -> e2.getEsal().compareTo(e1.getEsal()))
//		.skip(1).limit(2)
//		.collect(Collectors.toList()).forEach(System.out::println);
		
		//Get department wise highest salary
//		emplist.stream()
//		.collect(Collectors.groupingBy(Employee::getDept, Collectors.maxBy(Comparator.comparingDouble(Employee::getEsal))))
//		.forEach((d, e)->System.out.println(e.get()));
		
		//filter/sort data based on department, name and then salary
		emplist.stream()
		.sorted(Comparator.comparing(Employee::getDept)
				.thenComparing(Employee::getEname)
				.thenComparingDouble(Employee::getEsal))
		.collect(Collectors.toList())
		.forEach(System.out::println);
	}
}
