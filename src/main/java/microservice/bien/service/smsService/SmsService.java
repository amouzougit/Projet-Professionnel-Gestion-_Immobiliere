package microservice.bien.service.smsService;

import java.util.List;

import org.springframework.stereotype.Service;

import microservice.bien.model.SmsVerification;


	@Service("SmsService")
	public interface SmsService {
		
		public static  String API_USERNAME = "pidenam.tchodou@ipnetinstitute.com";
		public static  String API_KEY = "E50384AA-7B71-B51B-DAB9-AC8E58711970";
		
		
		public  String sendCode(String telephone);
		
		public List<SmsVerification> getAll();
		
		public SmsVerification getById(Integer id);
		
		public SmsVerification getByTelephoneAndCode(String telephone, String code);
		
		public SmsVerification save(SmsVerification smsVerification);
		
		public List<SmsVerification> saveAll(List<SmsVerification> smsVerifications);
		
		public void delete(SmsVerification smsVerification);
		
		public void deleteAll();


}
