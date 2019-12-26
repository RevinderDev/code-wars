--- 3, 2, 1, fight! ---
SELECT name, sum(won) as won, sum(lost) as lost 
FROM fighters
  INNER JOIN winning_moves ON winning_moves.id = fighters.move_id
  WHERE winning_moves.move NOT IN ('Hadoken', 'Shouoken', 'Kikoken')
GROUP BY name
ORDER BY won DESC
LIMIT 6