fn find_digit(mut num: i32, nth: i32) -> i32 {
  if nth <= 0 {
    return -1;
  }
  num = i32::abs(num);
  let val = num.to_string().chars().rev().nth((nth - 1) as usize);
  if val.is_none() {
    return 0;
  }
  val.unwrap().to_digit(10).unwrap() as i32
}
