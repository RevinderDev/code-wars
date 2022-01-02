fn odd_or_even(numbers: Vec<i32>) -> String {
    match numbers.iter().sum::<i32>() % 2 == 0 {
        true => "even",
        false => "odd"
    }.to_string()
}
