CREATE DATABASE coursedb;

USE coursedb;

CREATE TABLE courses (
    course_id INT PRIMARY KEY,
    course_name VARCHAR(100),
    faculty VARCHAR(100),
    credits INT
)

SELECT * FROM courses;