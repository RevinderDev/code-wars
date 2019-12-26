/*  SQL  */
SELECT id, name, POSITION(',' in characteristics) as comma FROM monsters ORDER BY comma