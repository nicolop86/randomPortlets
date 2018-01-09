create table prreg_PRProduct (
	productId LONG not null primary key,
	productName VARCHAR(75) null,
	serialNumber VARCHAR(75) null,
	companyId LONG,
	groupId LONG
);

create table prreg_PRRegistration (
	registrationId LONG not null primary key,
	prUserId LONG,
	datePurchased DATE null,
	howHear VARCHAR(75) null,
	wherePurchased VARCHAR(75) null,
	serialNumber VARCHAR(75) null,
	productId LONG,
	companyId LONG,
	groupId LONG
);

create table prreg_PRUser (
	prUserId LONG not null primary key,
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	address1 VARCHAR(75) null,
	address2 VARCHAR(75) null,
	city VARCHAR(75) null,
	state_ VARCHAR(75) null,
	postalCode VARCHAR(75) null,
	country VARCHAR(75) null,
	phoneNumber VARCHAR(75) null,
	email VARCHAR(75) null,
	birthDate DATE null,
	male BOOLEAN,
	gender VARCHAR(75) null,
	userId LONG,
	companyId LONG,
	groupId LONG
);

create table prreg_PRUser_PRRegistration (
	registrationId LONG not null,
	prUserId LONG not null,
	primary key (registrationId, prUserId)
);