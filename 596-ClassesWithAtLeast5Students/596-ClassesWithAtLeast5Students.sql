-- Last updated: 11/08/2026, 16:01:59
# Write your MySQL query statement below
select Class
from Courses group by Class having count(student)>=5;