# Write your MySQL query statement below
select 
    start.machine_id, 
    ROUND(avg(end.timestamp - start.timestamp), 3) AS processing_time
FROM
    (SELECT * FROM Activity WHERE activity_type = 'start') AS start
JOIN
    (SELECT * FROM Activity WHERE activity_type = 'end') AS end
ON
    start.machine_id = end.machine_id 
AND
    start.process_id = end.process_id
GROUP BY 
    start.machine_id;