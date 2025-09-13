SELECT w1.id
FROM Weather AS w1
JOIN Weather AS w2
  ON w2.recordDate = DATE_SUB(w1.recordDate, INTERVAL 1 DAY)
WHERE w1.temperature > w2.temperature;