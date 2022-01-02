fn contain_all_rots(strng: &str, arr: Vec<&str>) -> bool {
    // your code
  if strng == "" {
    return true;
  }
  let mut rotations: Vec<String> = vec![];
  for i in 0..strng.len() {
    let mut rot = strng.chars().collect::<Vec<char>>();
    rot.rotate_left(i);
    rotations.push(rot.into_iter().collect::<String>());
  }
  for rot in rotations {
    if !arr.contains(&&rot[..]) {
      return false;
    }
  }
  true
}
