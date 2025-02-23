# Write your MySQL query statement below
select unique_id, name
from Employees as A
Left Join 
EmployeeUNI as B
on  A.id = B.id;