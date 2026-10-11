package com.alpha.certificate.controller;



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

import com.alpha.certificate.entity.Certificate;
import com.alpha.certificate.serivce.CertificateService;





@RestController
@CrossOrigin(origins="http://localhost:4200")

public class CertificateController {

		
		@Autowired
		public CertificateService cser;
		
		//insert
		@PostMapping("/addc")
		public Certificate addCertificate(@RequestBody Certificate c) {
			return cser.addCertificate(c);
		}
		
		//Get
		@GetMapping("/getc")
		public List<Certificate> getCertificate(){
			return cser.getCertificate();
		}
		
		//delete
		@DeleteMapping("/deletec/{cid}")
		public void deleteCertificate(@PathVariable Integer cid) {
			cser.deleteCertificate(cid);
		}
		@PutMapping("/updatec")
		public Certificate updateCertificate(@RequestBody Certificate c) {
			return cser.updateCertificate(c);
		}
	}

