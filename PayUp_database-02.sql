/*για είσοδο στο mariaDb: mysql -h localhost -u root ή*/
/*mysql -u root*/
/*ctrl + c για έξοδο*/

DROP DATABASE IF EXISTS tl_database;
CREATE DATABASE tl_database;
USE tl_database;

CREATE TABLE b_user
(
  firstname VARCHAR(45) DEFAULT 'no name' NOT NULL,
  lastname VARCHAR(45) DEFAULT 'no name' NOT NULL,
  username VARCHAR(45) NOT NULL,
  password VARCHAR(20) NOT NULL,
  email VARCHAR(45) NOT NULL,
  PRIMARY KEY (username,email)

)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE bankInfo
(
  bank_item INT,
  iban VARCHAR(45),
  card_num BIGINT NOT NULL,
  fandlname VARCHAR(45) NOT NULL,
  exp_date DATE NOT NULL,
  cvv INT NOT NULL,
  username VARCHAR(45) NOT NULL,
  PRIMARY KEY(bank_item),
  CONSTRAINT USRNME FOREIGN KEY (username) REFERENCES b_user(username) ON UPDATE CASCADE ON DELETE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE bills
(
  bill_id INT,
  b_username VARCHAR(45) NOT NULL,
  electric_provider VARCHAR(45),
  phone_provider VARCHAR(45),
  electric INT NOT NULL,
  water INT NOT NULL,
  phone INT NOT NULL,
  installment INT NOT NULL,
  b_email VARCHAR(45) NOT NULL,
  PRIMARY KEY (bill_id),
  CONSTRAINT fk_bills_user FOREIGN KEY (b_username, b_email) REFERENCES b_user (username, email) ON UPDATE CASCADE ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE provider
(
  provider_id INT,
  name VARCHAR(45) NOT NULL,
  buser_username VARCHAR(45),
  buser_email VARCHAR(45),
  PRIMARY KEY(provider_id),
  CONSTRAINT USRSUNME FOREIGN KEY(buser_username, buser_email) REFERENCES b_user(username, email) ON UPDATE CASCADE ON DELETE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE payment
(
  payment_number INT,
  provider_id INT,
  payment_date DATE,
  PRIMARY KEY(payment_number),
  CONSTRAINT PVID FOREIGN KEY (provider_id) REFERENCES provider(provider_id)
  ON UPDATE CASCADE ON DELETE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE bank(

  iban VARCHAR(45),
  card_num BIGINT NOT NULL,
  fandlname VARCHAR(45) NOT NULL,
  exp_date VARCHAR(15) NOT NULL,
  cvv INT NOT NULL,
  PRIMARY KEY(iban)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE pay_by_user(
  uname VARCHAR(45) NOT NULL,
  umail VARCHAR(45) NOT NULL,
  pay_id INT,
  PRIMARY KEY(uname,umail,pay_id),
  CONSTRAINT UNME FOREIGN KEY(uname, umail) REFERENCES b_user(username, email) ON UPDATE CASCADE ON DELETE CASCADE,
  CONSTRAINT PID FOREIGN KEY(pay_id) REFERENCES payment(payment_number) ON UPDATE CASCADE ON DELETE CASCADE

)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;