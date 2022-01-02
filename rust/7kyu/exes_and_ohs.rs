fn xo(string: &'static str) -> bool {
  let cased = string.to_uppercase();
  let x = cased.matches("X").count();
  let o = cased.matches("O").count();
  x == o
}
