SELECT p.name AS product_name,
  EXTRACT(YEAR FROM (s.date))::int as year,
  EXTRACT(MONTH FROM (s.date))::int as month,
  EXTRACT(DAY FROM (s.date))::int as day,
  SUM(sd.count * p.price) as total
FROM sales_details AS sd
JOIN sales AS s ON s.id = sd.sale_id
JOIN products AS p ON p.id = sd.product_id
GROUP BY product_name, rollup(year, month, day)
