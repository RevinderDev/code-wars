fn digits(n: u64) -> usize {
    n.to_string().len()
}


// OR

fn digits(mut n: u64) -> usize {
    if n < 10 {
        return 1;
    }
    let mut digits = 0;
    while n != 0
    {
        n = n / 10;
        digits += 1;
    }
    digits
}
