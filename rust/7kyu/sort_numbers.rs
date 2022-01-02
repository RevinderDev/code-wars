fn sort_numbers(arr: &Vec<i32>) -> Vec<i32> {
    if arr.is_empty() {
        return vec![];
    }
    let mut vec = arr.to_vec();
    vec.sort();
    vec
}
