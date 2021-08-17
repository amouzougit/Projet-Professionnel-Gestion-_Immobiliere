package microservice.bien.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SmsVerification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="id")
	private Integer id;
	
	@Column(name = "code", nullable = false)
	private String code;
	
	@Column(name = "telephone", nullable = false)
	private String telephone;
	
	@Column(name = "create_date", nullable = false)
	private LocalDateTime create_date;
	
	@Column(name = "modified_date", nullable = false)
	private LocalDateTime modified_date;
	
	@Column(name = "isverified", nullable = false)
	private Boolean isverified;
	
	public SmsVerification() {
		
	}
	
	public SmsVerification(String code, String telephone)
			 {
		this.code = code;
		this.telephone = telephone;
		this.create_date = LocalDateTime.now();
		this.modified_date = LocalDateTime.now();
		this.isverified = false;
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public LocalDateTime getCreate_date() {
		return create_date;
	}
	public void setCreate_date(LocalDateTime create_date) {
		this.create_date = create_date;
	}
	public LocalDateTime getModified_date() {
		return modified_date;
	}
	public void setModified_date(LocalDateTime modified_date) {
		this.modified_date = modified_date;
	}
	public Boolean getIsverified() {
		return isverified;
	}
	public void setIsverified(Boolean isverified) {
		this.isverified = isverified;
	}
	
	





	

}
