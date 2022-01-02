fn row_weights(array: Vec<u32>) -> (u32, u32) {
    // your code here
    let mut team_one: u32 = 0;
    let mut team_two: u32 = 0;
    for (index, weight) in array.iter().enumerate() {
        match index % 2 {
            0 => team_one += weight,
            1 => team_two += weight,
            _ => (),
        }
    }
    (team_one, team_two)
}
