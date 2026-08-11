-- Last updated: 11/08/2026, 16:04:32
SELECT c.name AS Customers FROM Customers c
LEFT JOIN Orders o
ON c.id = o.customerId
WHERE o.customerId IS NULL;