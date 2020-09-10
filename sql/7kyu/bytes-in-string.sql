/*  SQl  */
SELECT
  LENGTH(number1::varchar(255)) as octnum1,
  LENGTH(number2::varchar(255)) as octnum2,
  LENGTH(number3::varchar(255)) as octnum3,
  LENGTH(number4::varchar(255)) as octnum4,
  LENGTH(number5::varchar(255)) as octnum5
FROM numbers;
