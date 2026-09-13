# Write your MySQL query statement below
SELECT class
From Courses
Group by class
HAVING COUNT(student) >= 5;