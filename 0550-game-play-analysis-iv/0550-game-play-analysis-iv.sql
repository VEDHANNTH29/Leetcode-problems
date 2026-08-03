# Write your MySQL query statement below
WITH FirstDay AS(SELECT player_id,MIN(event_date) AS first_date FROM Activity GROUP BY player_id)
SELECT ROUND(COUNT(a.player_id)/(SELECT COUNT(DISTINCT b.player_id) FROM Activity b),2) AS fraction FROM Activity a JOIN FirstDay b ON a.player_id=b.player_id 
WHERE DATEDIFF(a.event_date,b.first_date)=1;
