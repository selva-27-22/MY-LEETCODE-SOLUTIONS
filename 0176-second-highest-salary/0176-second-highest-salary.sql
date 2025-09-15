-- SELECT DISTINCT salary  as SecondHighestSalary
-- FROM Employee
-- ORDER BY  salary DESC
-- LIMIT 1 OFFSET 1
-- limit set limit,offset for skip top 1 ,distinct to remove duplicates,
-- automatically fill null if notexists
SELECT IFNULL( 
(SELECT DISTINCT salary  
FROM Employee
ORDER BY  salary DESC
LIMIT 1 OFFSET 1),NULL)   
AS SecondHighestSalary;


