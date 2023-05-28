
DROP DATABASE IF EXISTS tl_database;
create database tl_database;
USE tl_database;

CREATE TABLE user
(
  firstname VARCHAR(45) DEFAULT 'no name'NOT NULL,
  lastname VARCHAR(45) DEFAULT 'no name' NOT NULL,
  username VARCHAR(45) NOT NULL
  password VARCHAR(20) NOT NULL,
  email VARCHAR(45) NOT NULL,
  PRIMARY KEY (username)
);

CREATE TABLE bankInfo
(
  bank_item_id INT AUTO_INCREMENT,
  card_num INT NOT NULL,
  date DATE NOT NULL,
  cvv INT NOT NULL,
  name VARCHAR(45) NOT NULL,
  username VARCHAR(45) NOT NULL,
  PRIMARY KEY(bank_item),
  CONSTRAINT USRNME FOREIGN KEY (username) REFERENCES user(username)
  ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE bills
(
  bill_item_id INT AUTO_INCREMENT,
  electric INT NOT NULL,
  water INT NOT NULL,
  phone INT NOT NULL,
  installment INT NOT NULL,
  email VARCHAR(45) NOT NULL,
  PRIMARY KEY(bill_item_id),
  CONSTRAINT UNAME FOREIGN KEY (username) REFERENCES user(username),
  CONSTRAINT LNAME FOREIGN KEY(email) REFERENCES user(email)
  ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE provider
(
  provider_item_id INT AUTO_INCREMENT,
  name VARCHAR(45) NOT NULL,
  surname VARCHAR(45) NOT NULL,
  provider_num INT NOT NULL
  PRIMARY KEY(provider_item_id),
  CONSTRAINT SNAME FOREIGN KEY(surname) REFERENCES user(lastname),
  CONSTRAINT NME FOREIGN KEY(name) REFERENCES user(firstname)
  ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE payment
(
  payment_number INT,
  provider_number INT,
  payment_date DATE,
  bill_id INT,
  bank_id INT,
  PRIMARY KEY(payment_number),
  CONSTRAINT BILLSID FOREIGN KEY(bill_id) REFERENCES bills(bill_item_id),
  CONSTRAINT BANKSID FOREIGN KEY(bank_id) REFERENCES provider(provider_item_id)
  ON DELETE CASCADE ON UPDATE CASCADE
);



