package microservice.bien.serviceImpl;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ClickSend.ApiClient;
import ClickSend.ApiException;
import ClickSend.Api.SmsApi;
import ClickSend.Model.SmsMessage;
import ClickSend.Model.SmsMessageCollection;
import microservice.bien.dao.sms_dao.SmsVerificationDao;
import microservice.bien.model.SmsVerification;
import microservice.bien.service.smsService.SmsService;

@Service("smsService")
public class smsServiceImpl  implements SmsService{

	
	@Autowired
	private SmsVerificationDao smsverificationDao;

	@Override
	public List<SmsVerification> getAll() {
		
		return this.smsverificationDao.findAll();
	}

	/*
	 * @Override public SmsVerification getById(Integer id) { return
	 * this.smsverificationDao.getById(id); }
	 */

	@Override
	public SmsVerification save(SmsVerification smsVerification) {
		return this.smsverificationDao.save(smsVerification);
	}

	@Override
	public List<SmsVerification> saveAll(List<SmsVerification> smsVerifications) {
		return this.smsverificationDao.saveAll(smsVerifications);
	}

	@Override
	public void delete(SmsVerification smsVerification) {
		this.smsverificationDao.delete(smsVerification);
		
	}

	@Override
	public void deleteAll() {
		this.smsverificationDao.deleteAll();
		
	}
	
	@Override
	public SmsVerification getByTelephoneAndCode(String telephone, String code) {
		return this.smsverificationDao.findByTelephoneAndCode(telephone, code);
	}


	

	public String sendCode(String telephone) {
		Random r = new Random(System.currentTimeMillis());
		
		Integer code = 100000+r.nextInt(200000); 
		
		
		  ApiClient defaultClient = new ApiClient();
		    defaultClient.setUsername(API_USERNAME);
		    defaultClient.setPassword(API_KEY);
		    SmsApi apiInstance = new SmsApi(defaultClient);

		    SmsMessage smsMessage=new SmsMessage();
		    smsMessage.body("Afe Nye vous ai envoyer un message: "+code);
		    smsMessage.to(telephone);
		    smsMessage.source("java");

		    List<SmsMessage> smsMessageList=Arrays.asList(smsMessage);
		    // SmsMessageCollection | SmsMessageCollection model
		    SmsMessageCollection smsMessages = new SmsMessageCollection();
		    smsMessages.messages(smsMessageList);
		    try {
		        String result = apiInstance.smsSendPost(smsMessages);
		        System.out.println(result);
		        return code.toString();
		    } catch (ApiException e) {
		        System.err.println("Exception when calling SmsApi#smsSendPost");
		        e.printStackTrace();
		        return null;
		    }
	
		
		
	}

	@Override
	public SmsVerification getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}


	

	
}
