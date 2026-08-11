-- Last updated: 11/08/2026, 16:01:36
# Write your MySQL query statement below
Select * from Cinema
where description != 'boring' and id % 2 != 0
order by rating desc;