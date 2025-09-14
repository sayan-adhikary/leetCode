SELECT e2.name AS name
FROM Employee e1
JOIN Employee e2 ON e1.managerId = e2.id
GROUP BY e1.managerId
HAVING COUNT(*) >= 5;
