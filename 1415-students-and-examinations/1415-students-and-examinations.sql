SELECT S1.student_id, S1.student_name, S2.subject_name, COUNT(E.student_id) AS attended_exams
FROM Students S1
CROSS JOIN Subjects S2
LEFT JOIN Examinations E 
ON S1.student_id = E.student_id AND E.subject_name = S2.subject_name
GROUP BY S1.student_id, S1.student_name, S2.subject_name
ORDER BY S1.student_id, S2.subject_name