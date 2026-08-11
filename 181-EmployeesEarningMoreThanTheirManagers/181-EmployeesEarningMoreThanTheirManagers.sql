-- Last updated: 11/08/2026, 16:04:40
# Write your MySQL query statement below
select e1.name as Employee
from Employee e1
join Employee e2 on e1.managerId = e2.id
where e1.salary > e2.salary