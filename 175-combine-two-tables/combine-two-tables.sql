# Write your MySQL query statement below
select firstName,lastName,city,state from person p LEFT JOIN address a ON p.personId=a.personId;