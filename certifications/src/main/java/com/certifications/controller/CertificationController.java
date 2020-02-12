package com.certifications.controller;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.certifications.model.Certification;

@RestController
@RequestMapping(path = "/certificates")
public class CertificationController {
	Logger logger = org.slf4j.LoggerFactory.getILoggerFactory().getLogger(this.getClass().getName());

	@GetMapping(path = "/list")
	public List<Certification> getCertifications() {
		List<Certification> list = Arrays.asList(
				new Certification("Google Certified Profressional Architect", "GCP", "", "2019"),
				new Certification("AWS Certified Associate  Architect", "AWS CAA", "", "2018"),
				new Certification("AWS Certified Associate  Developer", "AWS DA", "", "2018"),
				new Certification("Java EJB Certified", "SCBCD", "", ""),
				new Certification("Sun Java Certified Develper(java 6)", "SCP", "", ""));
		for (Iterator<Certification> iterator = list.iterator(); iterator.hasNext();) {
			Certification certificate = iterator.next();
			logger.info("Rohit Aggarwal " + certificate.toString());
		}
		return list;

	}

}
