package com.alpha.certificate.repository;




import org.springframework.data.jpa.repository.JpaRepository;


import com.alpha.certificate.entity.Certificate;



public interface CertificateRepo extends JpaRepository<Certificate,Integer> {

}
