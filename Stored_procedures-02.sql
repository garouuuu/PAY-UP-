----------------------------------------------------------------------
/*1*/
/*procedure για εισαγωγη εγγραφης στον πινακα b_user*/
DROP PROCEDURE IF EXISTS addUser;
DELIMITER $
CREATE PROCEDURE addUser(IN fname VARCHAR(45), lname VARCHAR(45), usname VARCHAR(45), pwd VARCHAR(20), mail VARCHAR(45))
	BEGIN
		INSERT INTO b_user VALUES(fname, lname, usname, pwd, mail);
	END$
DELIMITER ;

CALL addUser('username', 'usernam', 'userna', 'usern', 'user@users.com');	/*κληση της procedure*/
SELECT * FROM b_user;														/*εμφανιση του περιεχομενου του πινακα*/
-------------------------------------------------------------------------------------------------------------------------
/*2*/
/*procedure για διαγραφη εγγραφης απο τον πινακα b_user*/
DROP PROCEDURE IF EXISTS deleteUser;
DELIMITER $
CREATE PROCEDURE deleteUser(IN usname VARCHAR(45), IN mail VARCHAR(45))
	BEGIN
		DELETE FROM b_user WHERE username=usname AND email=mail;
	END$
DELIMITER ;

CALL deleteUser('userna', 'user@users.com');

/*Αν εγινε σωστα η διαγραφη πρεπει να μην υπάρχει πια η εγγραφή*/
SELECT * FROM b_user
---------------------------------------------------------------------------------------------------------------------------------------
/*3*/
/*procedure που ελεγχει αν παιρνοντας ονομα,επιθετο απο τον πινακα b_user αυτα αντιστοιχουν σε καποιον αριθμο παροχης στον πινακα provider*/
DROP PROCEDURE IF EXISTS check_prov;
DELIMITER $
CREATE PROCEDURE check_prov(IN fnme VARCHAR(45), IN lnme VARCHAR(45), IN mail VARCHAR(45) )
	BEGIN
		DECLARE u1, u2 VARCHAR(45);
		SELECT username INTO u1 FROM b_user WHERE firstname=fnme AND lastname=lnme;
		SELECT buser_username INTO u2 FROM provider WHERE buser_email=mail;
		IF(u1=u2) THEN
			SELECT 'ok';
		END IF;
	END$
DELIMITER ;
-------------------------------------------------------------------------
/*4*/
/*procedure που παιρνει απο τον πινακα payment το πιο προσφατο σε ημερομηνια payment number και ελεγχει αν αντιστοιχει στο provider number*/
DROP PROCEDURE IF EXISTS latest_date;
DELIMITER $
CREATE PROCEDURE latest_date(IN pay_num INT)
	BEGIN
		DECLARE id1, id2 INT;
		SELECT TOP(1) payment_number INTO id1 FROM payment WHERE payment_number=pay_num ORDER BY payment_date ASC;
		SELECT provider_id INTO id2 FROM provider INNER JOIN payment ON provider.payment_id= payment.payment_id WHERE payment_number=pay_num;
		IF(id1=id2) THEN
			SELECT 'ok';
		END IF;
END$
DELIMITER ;
