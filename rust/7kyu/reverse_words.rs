fn reverse_words(str: &str) -> String {
    // your code here
    str.split(" ").into_iter().map(|x| x.chars().rev().collect::<String>()).collect::<Vec<String>>().join(" ")
}
