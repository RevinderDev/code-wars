fn wave(s: &str) -> Vec<String> {
    let mut mexican_wave = Vec::new();
    for (index, letter) in s.chars().enumerate() {
        match letter {
            ' ' => (),
            letter => {
                let mut mexicaned = s.to_string();
                mexicaned.replace_range(index..index + 1, letter.to_uppercase().to_string().as_str());
                mexican_wave.push(mexicaned);
            },
        }
    }

    mexican_wave
}
