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

package it.ariadne.prova.registration.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import it.ariadne.prova.registration.model.PRUser;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PRUser in entity cache.
 *
 * @author Politi
 * @see PRUser
 * @generated
 */
public class PRUserCacheModel implements CacheModel<PRUser>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{prUserId=");
		sb.append(prUserId);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", address1=");
		sb.append(address1);
		sb.append(", address2=");
		sb.append(address2);
		sb.append(", city=");
		sb.append(city);
		sb.append(", state=");
		sb.append(state);
		sb.append(", postalCode=");
		sb.append(postalCode);
		sb.append(", country=");
		sb.append(country);
		sb.append(", phoneNumber=");
		sb.append(phoneNumber);
		sb.append(", email=");
		sb.append(email);
		sb.append(", birthDate=");
		sb.append(birthDate);
		sb.append(", male=");
		sb.append(male);
		sb.append(", gender=");
		sb.append(gender);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PRUser toEntityModel() {
		PRUserImpl prUserImpl = new PRUserImpl();

		prUserImpl.setPrUserId(prUserId);

		if (firstName == null) {
			prUserImpl.setFirstName(StringPool.BLANK);
		}
		else {
			prUserImpl.setFirstName(firstName);
		}

		if (lastName == null) {
			prUserImpl.setLastName(StringPool.BLANK);
		}
		else {
			prUserImpl.setLastName(lastName);
		}

		if (address1 == null) {
			prUserImpl.setAddress1(StringPool.BLANK);
		}
		else {
			prUserImpl.setAddress1(address1);
		}

		if (address2 == null) {
			prUserImpl.setAddress2(StringPool.BLANK);
		}
		else {
			prUserImpl.setAddress2(address2);
		}

		if (city == null) {
			prUserImpl.setCity(StringPool.BLANK);
		}
		else {
			prUserImpl.setCity(city);
		}

		if (state == null) {
			prUserImpl.setState(StringPool.BLANK);
		}
		else {
			prUserImpl.setState(state);
		}

		if (postalCode == null) {
			prUserImpl.setPostalCode(StringPool.BLANK);
		}
		else {
			prUserImpl.setPostalCode(postalCode);
		}

		if (country == null) {
			prUserImpl.setCountry(StringPool.BLANK);
		}
		else {
			prUserImpl.setCountry(country);
		}

		if (phoneNumber == null) {
			prUserImpl.setPhoneNumber(StringPool.BLANK);
		}
		else {
			prUserImpl.setPhoneNumber(phoneNumber);
		}

		if (email == null) {
			prUserImpl.setEmail(StringPool.BLANK);
		}
		else {
			prUserImpl.setEmail(email);
		}

		if (birthDate == Long.MIN_VALUE) {
			prUserImpl.setBirthDate(null);
		}
		else {
			prUserImpl.setBirthDate(new Date(birthDate));
		}

		prUserImpl.setMale(male);

		if (gender == null) {
			prUserImpl.setGender(StringPool.BLANK);
		}
		else {
			prUserImpl.setGender(gender);
		}

		prUserImpl.setUserId(userId);
		prUserImpl.setCompanyId(companyId);
		prUserImpl.setGroupId(groupId);

		prUserImpl.resetOriginalValues();

		return prUserImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		prUserId = objectInput.readLong();
		firstName = objectInput.readUTF();
		lastName = objectInput.readUTF();
		address1 = objectInput.readUTF();
		address2 = objectInput.readUTF();
		city = objectInput.readUTF();
		state = objectInput.readUTF();
		postalCode = objectInput.readUTF();
		country = objectInput.readUTF();
		phoneNumber = objectInput.readUTF();
		email = objectInput.readUTF();
		birthDate = objectInput.readLong();
		male = objectInput.readBoolean();
		gender = objectInput.readUTF();
		userId = objectInput.readLong();
		companyId = objectInput.readLong();
		groupId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(prUserId);

		if (firstName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(firstName);
		}

		if (lastName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lastName);
		}

		if (address1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(address1);
		}

		if (address2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(address2);
		}

		if (city == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(city);
		}

		if (state == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(state);
		}

		if (postalCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(postalCode);
		}

		if (country == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(country);
		}

		if (phoneNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(phoneNumber);
		}

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		objectOutput.writeLong(birthDate);
		objectOutput.writeBoolean(male);

		if (gender == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(gender);
		}

		objectOutput.writeLong(userId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(groupId);
	}

	public long prUserId;
	public String firstName;
	public String lastName;
	public String address1;
	public String address2;
	public String city;
	public String state;
	public String postalCode;
	public String country;
	public String phoneNumber;
	public String email;
	public long birthDate;
	public boolean male;
	public String gender;
	public long userId;
	public long companyId;
	public long groupId;
}