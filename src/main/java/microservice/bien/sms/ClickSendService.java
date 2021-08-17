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

	public static  String API_USERNAME = "kevoamouzou@gmail.com";
	public static  String API_KEY = "E4F4B459-64E5-4E90-50C5-042C48986F6E";
	
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
	    smsMessage.to("+22892502165");
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
