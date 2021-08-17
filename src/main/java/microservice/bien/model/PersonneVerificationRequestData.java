package microservice.bien.model;

public class PersonneVerificationRequestData {

	private String telephone;
	private String code;
	
	
	public PersonneVerificationRequestData(String telephone, String code) {
		this.telephone = telephone;
		this.code = code;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	
	

}
