-- Last updated: 11/08/2026, 16:01:43
# Write your MySQL query statement below
SELECT 
    *, 
    CASE 
        WHEN (x + y > z AND y + z > x AND z + x > y) 
        THEN 'Yes' 
        ELSE 'No' 
    END AS triangle
FROM Triangle;