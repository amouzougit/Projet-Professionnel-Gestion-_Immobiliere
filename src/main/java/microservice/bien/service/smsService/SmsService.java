package microservice.bien.service.smsService;

import java.util.List;

import org.springframework.stereotype.Service;

import microservice.bien.model.SmsVerification;


	@Service("SmsService")
	public interface SmsService {
		
		public static  String API_USERNAME = "kevoamouzou@gmail.com";
		public static  String API_KEY = "E4F4B459-64E5-4E90-50C5-042C48986F6E";
		
		
		
		public  String sendCode(String telephone);
		
		public List<SmsVerification> getAll();
		
		public SmsVerification getById(Integer id);
		
		public SmsVerification getByTelephoneAndCode(String telephone, String code);
		
		public SmsVerification save(SmsVerification smsVerification);
		
		public List<SmsVerification> saveAll(List<SmsVerification> smsVerifications);
		
		public void delete(SmsVerification smsVerification);
		
		public void deleteAll();


}
