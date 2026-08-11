-- Last updated: 11/08/2026, 16:04:52
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    set N = N-1;
  RETURN (
      # Write your MySQL query statement below.
      select distinct salary
      from Employee order by salary DESC limit 1 offset N
  );
END