package microservice.bien.model;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public class BaseEntity {
	@Column(name = "createdBy", nullable = false)
	protected Long createdBy = 1L;

	@Column(name = "createdDate", nullable = false)
	protected Date createdDate = new Date();

	@Column(name = "lastModifiedBy", nullable = true)
	protected Long lastModifiedBy;

	@Column(name = "lastModifiedDate", nullable = true)
	protected Date lastModifiedDate;
	
	public BaseEntity(){

	}
	
	public BaseEntity(Long createdBy, Date createdDate, Long lastModifiedBy, Date lastModifiedDate) {
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.lastModifiedBy = lastModifiedBy;
		this.lastModifiedDate = lastModifiedDate;
		
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Long getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(Long lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	@Override
	public String toString() {
		return "BaseEntity{" +
				"createdBy=" + createdBy +
				", createdDate=" + createdDate +
				", lastModifiedBy=" + lastModifiedBy +
				", lastModifiedDate=" + lastModifiedDate +
				'}';
	}
}
