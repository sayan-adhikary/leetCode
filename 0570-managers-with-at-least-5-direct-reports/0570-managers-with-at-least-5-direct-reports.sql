select e.name
from Employee e
inner join Employee m
on m.managerId = e.id 
group by m.managerId
having count(m.managerId) >= 5;