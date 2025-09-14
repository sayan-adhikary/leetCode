# Write your MySQL query statement below
select 
    employee.name, bonus.bonus
from 
    employee
left join 
    bonus
on
    employee.empId = bonus.empId
    having bonus < 1000 or bonus is null ;
