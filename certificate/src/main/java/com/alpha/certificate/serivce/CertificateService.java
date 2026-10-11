package com.alpha.certificate.serivce;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpha.certificate.entity.Certificate;
import com.alpha.certificate.repository.CertificateRepo;




@Service
public class CertificateService {

	@Autowired
	public CertificateRepo crepo;

	public Certificate addCertificate(Certificate c) {
		return crepo.save(c);
	}
	
	//getting the data from database
	public List<Certificate> getCertificate(){
		return crepo.findAll();
	}
	
	//delete the data from database
	public void deleteCertificate(Integer cid) {
		crepo.deleteById(cid);
	}
	
	//update data
	 //update Certificate 
	public Certificate updateCertificate(Certificate c) {
		
		Integer cid=c.getCid();
		Certificate c1=crepo.findById(cid).get();
		c1.setCyear(c.getCyear());
		c1.setCcollege(c.getCcollege());
		return crepo.save(c1);
		
	}
}
