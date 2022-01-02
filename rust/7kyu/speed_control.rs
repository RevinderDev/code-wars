fn gps(s: i32, x: Vec<f64>) -> i32 {
  // your code
  let mut max_speed = 0_f64;
  for (index, element) in x.iter().enumerate() {
      if index + 1 >=  x.len(){
        break;
      }
      let distance = x[index + 1] - element;
      let speed = (distance * 3600_f64) / s as f64;
      if speed > max_speed {
        max_speed = speed;
      }
  }
  max_speed as i32
}
