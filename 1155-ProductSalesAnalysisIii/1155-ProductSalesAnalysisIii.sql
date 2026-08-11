-- Last updated: 11/08/2026, 15:59:44
select product_id, year as first_year, quantity, price 
from sales where (product_id, year) in (
    select product_id, min(year) from sales group by product_id
)