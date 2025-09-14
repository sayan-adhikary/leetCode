# Write your MySQL query statement below
select Students.student_id, Students.student_name, Subjects.subject_name , count(examinations.subject_name)as attended_exams 

from
    Students
cross join   
    Subjects
left join 
    Examinations on students.student_id = examinations.student_id AND subjects.subject_name = examinations.subject_name
group by
        Students.student_id, Subjects.subject_name
order by
        Students.student_id, Subjects.subject_name;
