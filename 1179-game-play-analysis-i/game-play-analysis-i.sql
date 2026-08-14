# Write your MySQL query statement below
select distinct player_id,Min(event_date) as first_login
from Activity
group by player_id
order by player_id asc;