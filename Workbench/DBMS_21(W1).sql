CREATE DATABASE IF NOT EXISTS student_cms_plusplus CHARACTER SET = "utf8mb4"; 
CREATE TABLE IF NOT EXISTS student (
id					INT			PRIMARY KEY		AUTO_INCREMENT		NOT NULL	UNIQUE,
name				TEXT		CHARACTER SET utf8mb4,
mssv				INT,
password			VARCHAR(32),
phone				VARCHAR(12),
address				VARCHAR(30),
age					NUMERIC(3),
email				VARCHAR(30),
created_time		TIMESTAMP,
last_updated_time	TIMESTAMP);
COMMIT;
CREATE TABLE IF NOT EXISTS class (
id					INT			PRIMARY KEY		AUTO_INCREMENT		NOT NULL	UNIQUE,
name				TEXT		CHARACTER SET utf8mb4,
major				TEXT		CHARACTER SET utf8mb4,
total_student		INT,
teacher_name		TEXT		CHARACTER SET utf8mb4,
teacher_phone		VARCHAR(12),
created_time		TIMESTAMP,
last_updated_time	TIMESTAMP);
COMMIT;
CREATE TABLE IF NOT EXISTS student_class (
student_id			INT,
class_id			INT);
COMMIT;

