package microservice.bien.dao.sms_dao;

import org.springframework.data.jpa.repository.JpaRepository;

import microservice.bien.model.SmsVerification;

public interface SmsVerificationDao  extends JpaRepository<SmsVerification, Integer>{

	SmsVerification findByTelephoneAndCode(String telephone, String code);

}
