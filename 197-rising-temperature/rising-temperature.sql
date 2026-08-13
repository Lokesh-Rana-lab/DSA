-- SELECT 
--     w1.id
-- FROM 
--     Weather w1
-- JOIN 
--     Weather w2
-- ON 
--     w1.recordDate - w2.recordDate = 1
-- WHERE 
--     w1.temperature > w2.temperature;

select w1.id from Weather w1
where 
w1.temperature > (
    select w2.temperature from Weather w2
    where 
    DATEDIFF(w1.recordDate, w2.recordDate) = 1
)