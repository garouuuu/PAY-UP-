----------------------------------------------------------------------
DELIMITER $
CREATE PROCEDURE addUser(IN fname, lname, uname, pwd, mail)
BEGIN
INSERT INTO user VALUES(fname, lname, uname, pwd, mail) WHERE firstname= fname, lastname=lname, username=uname, password=pwd, email=mail;
END
DELIMITER ;
-----------------------------------------------------------------------
DELIMITER $
CREATE PROCEDURE deleteUser(IN fname, lname, uname, pwd, mail)
BEGIN
INSERT INTO user VALUES(fname, lname, uname, pwd, mail) WHERE firstname= fname, lastname=lname, username=uname, password=pwd, email=mail;
END
DELIMITER ;
----------------------------------------------------------------------
/*procedure pou elegxei an apo to user pairnontass name, lastname ta name, lastname antistoixoun ston ar paroxhs*/
DELIMITER $
CREATE PROCEDURE check_prov(IN uname, IN provn)
BEGIN
SELECT firstname, lastname FROM user WHERE username=uname;
IF(provider.name=user.username AND provider.surname= user.username)
SELECT 'true'
END
DELIMITER ;
-------------------------------------------------------------------------
/*procedure pou pairnei apo payment to pio prosfato se hmeromhnia payment number kai elegxei an antistoixei sto provider number*/
DELIMITER $
CREATE PROCEDURE latest_date(IN pay_num)
BEGIN
SELECT payment_date FROM payment WHERE payment_number=pay_num;
IF(payment.provider_number=provider.provider_num) SELECT 'true';
END
DELIMITER ;
--------------------------------------------------------------------------