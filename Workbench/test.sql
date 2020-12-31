UPDATE employees SET employees.password = '190720' WHERE firstName='Long';
SELECT employeeID, firstName, lastName, MD5(password) FROM employees;
UPDATE employees SET password = MD5(password);
SELECT * FROM employees;
SELECT MD5(unhex(MD5('9a66960fb7046d727890d55948ed4aab')));
SELECT COLUMN_NAME, DATA_TYPE FROM INFORMATION_SCHEMA.COLUMNS 
WHERE TABLE_NAME = 'employees';
ALTER TABLE employees ADD date timestamp;
SELECT CURRENT_TIMESTAMP();
ALTER TABLE employees MODIFY firstName TEXT CHARACTER SET utf8mb4;
UPDATE employees SET date=CURRENT_TIMESTAMP() WHERE firstName='Hanh';
UPDATE employees SET firstName='Hanh Oc Cho' WHERE employeeID=2;