-- Last updated: 11/08/2026, 16:04:37
# Write your MySQL query statement below
select email from person
group by email having count(email)>1;