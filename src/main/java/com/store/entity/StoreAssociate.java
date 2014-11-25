/**
 * 
 */
package com.store.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.Email;

/**
 * @author Prasad Khode
 *
 */
@Entity
public class StoreAssociate implements Serializable {

	private static final long serialVersionUID = 7105089696964650494L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "store_associate_id", nullable = false)
	private Long storeAssociateId;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Email
	@Column(name = "email_id", nullable = false, unique = true)
	private String emailId;

	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "associate_phone_number")
	private String associatePhoneNumber;

	@Column(name = "registration_confirmed")
	private Boolean registrationConfirmed = false;

	@Column(name = "is_active")
	private Boolean accountActive = true;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "store_id", referencedColumnName = "store_id")
	private StoreDetails storeDetails;

	/**
	 * @return the storeAssociateId
	 */
	public Long getStoreAssociateId() {
		return storeAssociateId;
	}

	/**
	 * @param storeAssociateId the storeAssociateId to set
	 */
	public void setStoreAssociateId(Long storeAssociateId) {
		this.storeAssociateId = storeAssociateId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the associatePhoneNumber
	 */
	public String getAssociatePhoneNumber() {
		return associatePhoneNumber;
	}

	/**
	 * @param associatePhoneNumber the associatePhoneNumber to set
	 */
	public void setAssociatePhoneNumber(String associatePhoneNumber) {
		this.associatePhoneNumber = associatePhoneNumber;
	}

	/**
	 * @return the registrationConfirmed
	 */
	public Boolean getRegistrationConfirmed() {
		return registrationConfirmed;
	}

	/**
	 * @param registrationConfirmed the registrationConfirmed to set
	 */
	public void setRegistrationConfirmed(Boolean registrationConfirmed) {
		this.registrationConfirmed = registrationConfirmed;
	}

	/**
	 * @return the accountActive
	 */
	public Boolean getAccountActive() {
		return accountActive;
	}

	/**
	 * @param accountActive the accountActive to set
	 */
	public void setAccountActive(Boolean accountActive) {
		this.accountActive = accountActive;
	}

	/**
	 * @return the storeDetails
	 */
	public StoreDetails getStoreDetails() {
		return storeDetails;
	}

	/**
	 * @param storeDetails the storeDetails to set
	 */
	public void setStoreDetails(StoreDetails storeDetails) {
		this.storeDetails = storeDetails;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StoreAssociate [storeAssociateId=")
				.append(storeAssociateId).append(", firstName=")
				.append(firstName).append(", lastName=").append(lastName)
				.append(", emailId=").append(emailId).append(", password=")
				.append(password).append(", associatePhoneNumber=")
				.append(associatePhoneNumber)
				.append(", registrationConfirmed=")
				.append(registrationConfirmed).append(", accountActive=")
				.append(accountActive).append(", storeDetails=")
				.append(storeDetails).append("]");
		return builder.toString();
	}
}
