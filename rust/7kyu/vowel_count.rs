fn get_count(string: &str) -> usize {
  let mut vowels_count: usize = 0;
  let chars = vec!['a', 'e', 'i', 'o', 'u'];
  // Do your magic here
  for c in string.chars() {
    if chars.contains(&c){
        vowels_count += 1;
      }
    }
  vowels_count
}


// OR

fn get_count(string: &str) -> usize {
    string.chars().filter(|&x| "aeiou".contains(x)).count()
}
