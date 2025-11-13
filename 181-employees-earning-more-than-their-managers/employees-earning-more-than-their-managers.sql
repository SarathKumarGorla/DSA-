# Write your MySQL query statement below
select e.name as Employee  from employee e  JOIN employee d ON e.managerId=d.id and e.salary>d.salary;