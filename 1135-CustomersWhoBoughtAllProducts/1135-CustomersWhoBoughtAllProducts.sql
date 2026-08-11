-- Last updated: 11/08/2026, 15:59:52
# Write your MySQL query statement below
SELECT  customer_id FROM Customer GROUP BY customer_id
HAVING COUNT(distinct product_key) = (SELECT COUNT(product_key) FROM Product)