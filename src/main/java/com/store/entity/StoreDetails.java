/**
 * 
 */
package com.store.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.store.enums.MerchantTierEnum;

/**
 * @author Prasad Khode
 *
 */
@Entity
public class StoreDetails implements Serializable {

	private static final long serialVersionUID = 3217760988884612148L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "store_id", nullable = false)
	private Long storeId;

	@Column(name = "store_name", nullable = false)
	private String storeName;

	@Column(name = "store_lattitude", nullable = false)
	private double storeLattitude;

	@Column(name = "store_longitude", nullable = false)
	private double storeLongitude;

	@Column(name = "store_image_url")
	private String storeImageUrl;

	@Column(name = "store_address_image_url")
	private String storeAddressImageUrl;

	@Column(name = "store_additional_description")
	private String storeDescription;

	@Column(name = "store_welcome_message")
	private String storeWelcomeMessage;

	@Column(name = "merchant_tier")
	@Enumerated(EnumType.STRING)
	private MerchantTierEnum merchantTier;

	@Column(name = "store_address_line1")
	private String addressLine1;

	@Column(name = "store_address_line2")
	private String addressLine2;

	@Column(name = "store_address_line3")
	private String addressLine3;

	@Column(name = "store_city")
	private String storeCity;

	@Column(name = "store_state")
	private String storeState;

	@Column(name = "store_country")
	private String storeCountry;

	@Column(name = "store_postal_code")
	private String storePostalCode;

	@Column(name = "google_place_id")
	private String googlePlaceId;

	@Column(name = "google_icon_image")
	private String googleIconImage;

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "storeDetails", cascade = CascadeType.ALL)
	@JsonIgnore
	private StoreAssociate storeAssociate;

	/**
	 * @return the storeId
	 */
	public Long getStoreId() {
		return storeId;
	}

	/**
	 * @param storeId the storeId to set
	 */
	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	/**
	 * @return the storeName
	 */
	public String getStoreName() {
		return storeName;
	}

	/**
	 * @param storeName the storeName to set
	 */
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	/**
	 * @return the storeLattitude
	 */
	public double getStoreLattitude() {
		return storeLattitude;
	}

	/**
	 * @param storeLattitude the storeLattitude to set
	 */
	public void setStoreLattitude(double storeLattitude) {
		this.storeLattitude = storeLattitude;
	}

	/**
	 * @return the storeLongitude
	 */
	public double getStoreLongitude() {
		return storeLongitude;
	}

	/**
	 * @param storeLongitude the storeLongitude to set
	 */
	public void setStoreLongitude(double storeLongitude) {
		this.storeLongitude = storeLongitude;
	}

	/**
	 * @return the storeImageUrl
	 */
	public String getStoreImageUrl() {
		return storeImageUrl;
	}

	/**
	 * @param storeImageUrl the storeImageUrl to set
	 */
	public void setStoreImageUrl(String storeImageUrl) {
		this.storeImageUrl = storeImageUrl;
	}

	/**
	 * @return the storeAddressImageUrl
	 */
	public String getStoreAddressImageUrl() {
		return storeAddressImageUrl;
	}

	/**
	 * @param storeAddressImageUrl the storeAddressImageUrl to set
	 */
	public void setStoreAddressImageUrl(String storeAddressImageUrl) {
		this.storeAddressImageUrl = storeAddressImageUrl;
	}

	/**
	 * @return the storeDescription
	 */
	public String getStoreDescription() {
		return storeDescription;
	}

	/**
	 * @param storeDescription the storeDescription to set
	 */
	public void setStoreDescription(String storeDescription) {
		this.storeDescription = storeDescription;
	}

	/**
	 * @return the storeWelcomeMessage
	 */
	public String getStoreWelcomeMessage() {
		return storeWelcomeMessage;
	}

	/**
	 * @param storeWelcomeMessage the storeWelcomeMessage to set
	 */
	public void setStoreWelcomeMessage(String storeWelcomeMessage) {
		this.storeWelcomeMessage = storeWelcomeMessage;
	}

	/**
	 * @return the merchantTier
	 */
	public MerchantTierEnum getMerchantTier() {
		return merchantTier;
	}

	/**
	 * @param merchantTier the merchantTier to set
	 */
	public void setMerchantTier(MerchantTierEnum merchantTier) {
		this.merchantTier = merchantTier;
	}

	/**
	 * @return the addressLine1
	 */
	public String getAddressLine1() {
		return addressLine1;
	}

	/**
	 * @param addressLine1 the addressLine1 to set
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	/**
	 * @return the addressLine2
	 */
	public String getAddressLine2() {
		return addressLine2;
	}

	/**
	 * @param addressLine2 the addressLine2 to set
	 */
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	/**
	 * @return the addressLine3
	 */
	public String getAddressLine3() {
		return addressLine3;
	}

	/**
	 * @param addressLine3 the addressLine3 to set
	 */
	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	/**
	 * @return the storeCity
	 */
	public String getStoreCity() {
		return storeCity;
	}

	/**
	 * @param storeCity the storeCity to set
	 */
	public void setStoreCity(String storeCity) {
		this.storeCity = storeCity;
	}

	/**
	 * @return the storeState
	 */
	public String getStoreState() {
		return storeState;
	}

	/**
	 * @param storeState the storeState to set
	 */
	public void setStoreState(String storeState) {
		this.storeState = storeState;
	}

	/**
	 * @return the storeCountry
	 */
	public String getStoreCountry() {
		return storeCountry;
	}

	/**
	 * @param storeCountry the storeCountry to set
	 */
	public void setStoreCountry(String storeCountry) {
		this.storeCountry = storeCountry;
	}

	/**
	 * @return the storePostalCode
	 */
	public String getStorePostalCode() {
		return storePostalCode;
	}

	/**
	 * @param storePostalCode the storePostalCode to set
	 */
	public void setStorePostalCode(String storePostalCode) {
		this.storePostalCode = storePostalCode;
	}

	/**
	 * @return the googlePlaceId
	 */
	public String getGooglePlaceId() {
		return googlePlaceId;
	}

	/**
	 * @param googlePlaceId the googlePlaceId to set
	 */
	public void setGooglePlaceId(String googlePlaceId) {
		this.googlePlaceId = googlePlaceId;
	}

	/**
	 * @return the googleIconImage
	 */
	public String getGoogleIconImage() {
		return googleIconImage;
	}

	/**
	 * @param googleIconImage the googleIconImage to set
	 */
	public void setGoogleIconImage(String googleIconImage) {
		this.googleIconImage = googleIconImage;
	}

	/**
	 * @return the storeAssociate
	 */
	public StoreAssociate getStoreAssociate() {
		return storeAssociate;
	}

	/**
	 * @param storeAssociate the storeAssociate to set
	 */
	public void setStoreAssociate(StoreAssociate storeAssociate) {
		this.storeAssociate = storeAssociate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StoreDetails [storeId=").append(storeId)
				.append(", storeName=").append(storeName)
				.append(", storeLattitude=").append(storeLattitude)
				.append(", storeLongitude=").append(storeLongitude)
				.append(", storeImageUrl=").append(storeImageUrl)
				.append(", storeAddressImageUrl=").append(storeAddressImageUrl)
				.append(", storeDescription=").append(storeDescription)
				.append(", storeWelcomeMessage=").append(storeWelcomeMessage)
				.append(", merchantTier=").append(merchantTier)
				.append(", addressLine1=").append(addressLine1)
				.append(", addressLine2=").append(addressLine2)
				.append(", addressLine3=").append(addressLine3)
				.append(", storeCity=").append(storeCity)
				.append(", storeState=").append(storeState)
				.append(", storeCountry=").append(storeCountry)
				.append(", storePostalCode=").append(storePostalCode)
				.append(", googlePlaceId=").append(googlePlaceId)
				.append(", googleIconImage=").append(googleIconImage)
				.append(", storeAssociate=").append(storeAssociate).append("]");
		return builder.toString();
	}
}
