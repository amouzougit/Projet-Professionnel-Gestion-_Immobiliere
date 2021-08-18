package microservice.bien.sms;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import ClickSend.ApiClient;
import ClickSend.ApiException;
import ClickSend.Api.SmsApi;
import ClickSend.Model.SmsMessage;
import ClickSend.Model.SmsMessageCollection;

public class ClickSendService {

	public static  String API_USERNAME = "pidenam.tchodou@ipnetinstitute.com";
	public static  String API_KEY = "E50384AA-7B71-B51B-DAB9-AC8E58711970";
	
	public static int generateDigit() {
		
		Random r = new Random(System.currentTimeMillis());
		
		return  100000+r.nextInt(200000); 
	}

	  public static void main(String[] args) {
	    ApiClient defaultClient = new ApiClient();
	    defaultClient.setUsername(API_USERNAME);
	    defaultClient.setPassword(API_KEY);
	    SmsApi apiInstance = new SmsApi(defaultClient);

	    SmsMessage smsMessage=new SmsMessage();
	    smsMessage.body("code de verification: "+generateDigit());
	    smsMessage.to("+14055555555");
	    smsMessage.source("java");

	    List<SmsMessage> smsMessageList=Arrays.asList(smsMessage);
	    // SmsMessageCollection | SmsMessageCollection model
	    SmsMessageCollection smsMessages = new SmsMessageCollection();
	    smsMessages.messages(smsMessageList);
	    try {
	        String result = apiInstance.smsSendPost(smsMessages);
	        System.out.println(result);
	    } catch (ApiException e) {
	        System.err.println("Exception when calling SmsApi#smsSendPost");
	        e.printStackTrace();
	    }
	  }

}
