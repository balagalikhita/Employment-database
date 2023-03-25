CREATE TABLE employee
             (
                          emp_id    INTEGER NOT NULL auto_increment,
                          firstname VARCHAR(255),
                          lastname  VARCHAR(255),
                          address   VARCHAR(255),
                          age       INTEGER,
                          contact   BIGINT,
                          email     VARCHAR(255),
                          gender    VARCHAR(255),
                          password  VARCHAR(255),
                          salary DOUBLE PRECISION,
                          username VARCHAR(255),
                          PRIMARY KEY (emp_id)
             );