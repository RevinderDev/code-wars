fn generate_shape(n: i32) -> String {
    //
    vec!["+".repeat(n as usize); n as usize].join("\n")
}

// OR

fn generate_shape(n: i32) -> String {
    //
    let mut list = vec![];
    for i in 0..n {
        let mut string = std::iter::repeat("+").take(n as usize).collect::<String>();
        list.push(string);
    }

    list.join("\n")
}
