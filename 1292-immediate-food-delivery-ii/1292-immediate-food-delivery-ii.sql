WITH FirstOrders AS (
    -- Step 1: Find the first order of each customer
    SELECT customer_id, 
           MIN(order_date) AS first_order_date
    FROM Delivery
    GROUP BY customer_id
),
ImmediateOrders AS (
    -- Step 2: Check if the first order is immediate
    SELECT f.customer_id,
           CASE 
               WHEN d.order_date = d.customer_pref_delivery_date THEN 1
               ELSE 0
           END AS is_immediate
    FROM FirstOrders f
    JOIN Delivery d ON f.customer_id = d.customer_id AND f.first_order_date = d.order_date
)
-- Step 3: Calculate the percentage of immediate first orders
SELECT ROUND(100.0 * SUM(is_immediate) / COUNT(*), 2) AS immediate_percentage
FROM ImmediateOrders;
