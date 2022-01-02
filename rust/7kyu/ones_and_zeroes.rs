fn binary_slice_to_number(slice: &[u32]) -> u32 {
    // your code here
    let bytes_num: Vec<String> = slice.into_iter().map(|f| f.to_string()).collect();
    let binary = bytes_num.join("");
    u32::from_str_radix(&binary, 2).unwrap()
}
