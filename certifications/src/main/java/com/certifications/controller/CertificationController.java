package com.certifications.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.certifications.model.Certificate;

@RestController
@RequestMapping(path = "/certificates")
public class CertificationController {

	@GetMapping(path = "/list")
	public List<Certificate> getCertifications() {
		List<Certificate> list = Arrays.asList(
				new Certificate("Google Certified Profressional Architect", "GCP", "", "2019"),
				new Certificate("AWS Certified Associate  Architect", "AWS CAA", "", "2018"),
				new Certificate("AWS Certified Associate  Developer", "AWS DA", "", "2018"),
				new Certificate("Java EJB Certified", "SCBCD", "", ""),
				new Certificate("Sun Java Certified Develper (java 6)", "SCP", "", ""));
		return list;

	}

}
