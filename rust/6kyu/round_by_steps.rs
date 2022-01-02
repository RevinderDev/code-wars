fn solution(n: f64) -> f64 {
    let y = n % 1_f64;
    let zero_distance = y;
    let one_distance = 1_f64 - y;
    if zero_distance > one_distance {
        let half_distance = y - 0.5_f64;
        if one_distance < half_distance {
            return n.ceil();
        }
    }
    else {
        let half_distance = 0.5_f64 - y;
        if zero_distance < half_distance {
            return n.floor();
        }
    }
    return n.floor() + 0.5;
}
