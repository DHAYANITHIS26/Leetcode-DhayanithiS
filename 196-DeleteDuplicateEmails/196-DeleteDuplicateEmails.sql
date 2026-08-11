-- Last updated: 11/08/2026, 16:04:24
# Write your MySQL query statement below
delete p from person p
join person p2
on p.Email = p2.Email and p.Id > p2.Id;