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

package it.ariadne.prova.registration.service.base;

import it.ariadne.prova.registration.service.PRProductLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Politi
 * @generated
 */
public class PRProductLocalServiceClpInvoker {
	public PRProductLocalServiceClpInvoker() {
		_methodName0 = "addPRProduct";

		_methodParameterTypes0 = new String[] {
				"it.ariadne.prova.registration.model.PRProduct"
			};

		_methodName1 = "createPRProduct";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deletePRProduct";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deletePRProduct";

		_methodParameterTypes3 = new String[] {
				"it.ariadne.prova.registration.model.PRProduct"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "dynamicQueryCount";

		_methodParameterTypes9 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery",
				"com.liferay.portal.kernel.dao.orm.Projection"
			};

		_methodName10 = "fetchPRProduct";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getPRProduct";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getPRProducts";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getPRProductsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updatePRProduct";

		_methodParameterTypes15 = new String[] {
				"it.ariadne.prova.registration.model.PRProduct"
			};

		_methodName40 = "getBeanIdentifier";

		_methodParameterTypes40 = new String[] {  };

		_methodName41 = "setBeanIdentifier";

		_methodParameterTypes41 = new String[] { "java.lang.String" };

		_methodName46 = "addProduct";

		_methodParameterTypes46 = new String[] {
				"it.ariadne.prova.registration.model.PRProduct", "long"
			};

		_methodName47 = "deleteProduct";

		_methodParameterTypes47 = new String[] { "long" };

		_methodName48 = "deleteProduct";

		_methodParameterTypes48 = new String[] {
				"it.ariadne.prova.registration.model.PRProduct"
			};

		_methodName49 = "getAllProducts";

		_methodParameterTypes49 = new String[] { "long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return PRProductLocalServiceUtil.addPRProduct((it.ariadne.prova.registration.model.PRProduct)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return PRProductLocalServiceUtil.createPRProduct(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return PRProductLocalServiceUtil.deletePRProduct(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return PRProductLocalServiceUtil.deletePRProduct((it.ariadne.prova.registration.model.PRProduct)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return PRProductLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return PRProductLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return PRProductLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return PRProductLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return PRProductLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return PRProductLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return PRProductLocalServiceUtil.fetchPRProduct(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return PRProductLocalServiceUtil.getPRProduct(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return PRProductLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return PRProductLocalServiceUtil.getPRProducts(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return PRProductLocalServiceUtil.getPRProductsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return PRProductLocalServiceUtil.updatePRProduct((it.ariadne.prova.registration.model.PRProduct)arguments[0]);
		}

		if (_methodName40.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes40, parameterTypes)) {
			return PRProductLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName41.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes41, parameterTypes)) {
			PRProductLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName46.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes46, parameterTypes)) {
			return PRProductLocalServiceUtil.addProduct((it.ariadne.prova.registration.model.PRProduct)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName47.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes47, parameterTypes)) {
			PRProductLocalServiceUtil.deleteProduct(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName48.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes48, parameterTypes)) {
			PRProductLocalServiceUtil.deleteProduct((it.ariadne.prova.registration.model.PRProduct)arguments[0]);

			return null;
		}

		if (_methodName49.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes49, parameterTypes)) {
			return PRProductLocalServiceUtil.getAllProducts(((Long)arguments[0]).longValue());
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName40;
	private String[] _methodParameterTypes40;
	private String _methodName41;
	private String[] _methodParameterTypes41;
	private String _methodName46;
	private String[] _methodParameterTypes46;
	private String _methodName47;
	private String[] _methodParameterTypes47;
	private String _methodName48;
	private String[] _methodParameterTypes48;
	private String _methodName49;
	private String[] _methodParameterTypes49;
}