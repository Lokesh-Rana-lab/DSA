# Write your MySQL query statement below
select u.unique_id,n.name from Employees n
left join EmployeeUNI u
on 
u.id = n.id; 