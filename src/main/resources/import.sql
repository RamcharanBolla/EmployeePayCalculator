BEGIN;
CREATE TABLE IF NOT EXISTS employee ( id VARCHAR(255) PRIMARY KEY, name VARCHAR(255), gender VARCHAR(255), salary DOUBLE, state VARCHAR(255), tax DOUBLE);
INSERT INTO employee (id, name,gender, salary,state, tax) VALUES ('1', 'Ram', 'Male', 150000, 'MO',0.25);
INSERT INTO employee (id, name,gender, salary,state, tax) VALUES ('2', 'G1', 'Male', 200000,'CO',0.3);
COMMIT;