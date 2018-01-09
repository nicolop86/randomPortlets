create index IX_A71590C2 on prreg_PRProduct (companyId);
create index IX_DEEF5FC4 on prreg_PRProduct (groupId);
create index IX_C8D96C86 on prreg_PRProduct (groupId, productName);

create index IX_E8F1DE3C on prreg_PRRegistration (groupId);
create index IX_CF7E2129 on prreg_PRRegistration (groupId, datePurchased);
create index IX_A5D26318 on prreg_PRRegistration (groupId, prUserId);
create index IX_2EAC0A4D on prreg_PRRegistration (groupId, serialNumber);

create index IX_60E1D322 on prreg_PRUser (groupId, email);
create index IX_65FB555F on prreg_PRUser (groupId, lastName);
create index IX_7E13EB24 on prreg_PRUser (groupId, userId);

create index IX_1293C062 on prreg_PRUser_PRRegistration (prUserId);
create index IX_F4C7702E on prreg_PRUser_PRRegistration (registrationId);