# Write your MySQL query statement below
SELECT * FROM Users WHERE mail REGEXP '^[A-Za-z][A-Za-z0-9_.-]*@leetcode\\.com$' AND MAIL LIKE BINARY '%@leetcode.com'