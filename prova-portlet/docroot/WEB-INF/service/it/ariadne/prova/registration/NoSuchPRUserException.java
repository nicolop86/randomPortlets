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

package it.ariadne.prova.registration;

import com.liferay.portal.NoSuchModelException;

/**
 * @author Politi
 */
public class NoSuchPRUserException extends NoSuchModelException {

	public NoSuchPRUserException() {
		super();
	}

	public NoSuchPRUserException(String msg) {
		super(msg);
	}

	public NoSuchPRUserException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NoSuchPRUserException(Throwable cause) {
		super(cause);
	}

}