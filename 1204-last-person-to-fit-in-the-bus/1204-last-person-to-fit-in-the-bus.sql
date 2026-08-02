# Write your MySQL query statement below
SELECT person_name FROM(SELECT person_name,turn,SUM(Weight) OVER(ORDER BY turn ASC) AS total_weight FROM Queue) AS q
WHERE total_weight<=1000 ORDER BY turn DESC 
LIMIT 1;