-- Last updated: 11/08/2026, 16:01:51
# Write your MySQL query statement below
SELECT name FROM salesperson
WHERE sales_id not in (SELECT sales_id FROM orders WHERE com_id = (SELECT com_id FROM company WHERE name = "Red"))