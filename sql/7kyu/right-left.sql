/*  SQL  */
--SELECT project, address FROM repositories WHERE x = commits AND y = contributors;
SELECT LEFT(project, commits) AS project ,RIGHT(address, contributors) AS address
FROM repositories 