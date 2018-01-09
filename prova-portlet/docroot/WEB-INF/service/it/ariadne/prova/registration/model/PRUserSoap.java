/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package it.ariadne.prova.registration.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Politi
 * @generated
 */
public class PRUserSoap implements Serializable {
	public static PRUserSoap toSoapModel(PRUser model) {
		PRUserSoap soapModel = new PRUserSoap();

		soapModel.setPrUserId(model.getPrUserId());
		soapModel.setFirstName(model.getFirstName());
		soapModel.setLastName(model.getLastName());
		soapModel.setAddress1(model.getAddress1());
		soapModel.setAddress2(model.getAddress2());
		soapModel.setCity(model.getCity());
		soapModel.setState(model.getState());
		soapModel.setPostalCode(model.getPostalCode());
		soapModel.setCountry(model.getCountry());
		soapModel.setPhoneNumber(model.getPhoneNumber());
		soapModel.setEmail(model.getEmail());
		soapModel.setBirthDate(model.getBirthDate());
		soapModel.setMale(model.getMale());
		soapModel.setGender(model.getGender());
		soapModel.setUserId(model.getUserId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());

		return soapModel;
	}

	public static PRUserSoap[] toSoapModels(PRUser[] models) {
		PRUserSoap[] soapModels = new PRUserSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PRUserSoap[][] toSoapModels(PRUser[][] models) {
		PRUserSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PRUserSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PRUserSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PRUserSoap[] toSoapModels(List<PRUser> models) {
		List<PRUserSoap> soapModels = new ArrayList<PRUserSoap>(models.size());

		for (PRUser model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PRUserSoap[soapModels.size()]);
	}

	public PRUserSoap() {
	}

	public long getPrimaryKey() {
		return _prUserId;
	}

	public void setPrimaryKey(long pk) {
		setPrUserId(pk);
	}

	public long getPrUserId() {
		return _prUserId;
	}

	public void setPrUserId(long prUserId) {
		_prUserId = prUserId;
	}

	public String getFirstName() {
		return _firstName;
	}

	public void setFirstName(String firstName) {
		_firstName = firstName;
	}

	public String getLastName() {
		return _lastName;
	}

	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	public String getAddress1() {
		return _address1;
	}

	public void setAddress1(String address1) {
		_address1 = address1;
	}

	public String getAddress2() {
		return _address2;
	}

	public void setAddress2(String address2) {
		_address2 = address2;
	}

	public String getCity() {
		return _city;
	}

	public void setCity(String city) {
		_city = city;
	}

	public String getState() {
		return _state;
	}

	public void setState(String state) {
		_state = state;
	}

	public String getPostalCode() {
		return _postalCode;
	}

	public void setPostalCode(String postalCode) {
		_postalCode = postalCode;
	}

	public String getCountry() {
		return _country;
	}

	public void setCountry(String country) {
		_country = country;
	}

	public String getPhoneNumber() {
		return _phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		_phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public Date getBirthDate() {
		return _birthDate;
	}

	public void setBirthDate(Date birthDate) {
		_birthDate = birthDate;
	}

	public boolean getMale() {
		return _male;
	}

	public boolean isMale() {
		return _male;
	}

	public void setMale(boolean male) {
		_male = male;
	}

	public String getGender() {
		return _gender;
	}

	public void setGender(String gender) {
		_gender = gender;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	private long _prUserId;
	private String _firstName;
	private String _lastName;
	private String _address1;
	private String _address2;
	private String _city;
	private String _state;
	private String _postalCode;
	private String _country;
	private String _phoneNumber;
	private String _email;
	private Date _birthDate;
	private boolean _male;
	private String _gender;
	private long _userId;
	private long _companyId;
	private long _groupId;
}