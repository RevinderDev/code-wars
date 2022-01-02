use std::collections::HashSet;

fn men_from_boys(xs: &[i16]) -> Vec<i16> {
        let mut odd: HashSet<i16> = HashSet::new();
    let mut even: HashSet<i16> = HashSet::new();
    for number in xs.iter(){
        if number % 2 == 0 {
            even.insert(number.to_owned());
        }
        else {
            odd.insert(number.to_owned());
        }
    }
    let mut even = even.into_iter().collect::<Vec<_>>();
    even.sort();
    let mut odd = odd.into_iter().collect::<Vec<_>>();
    odd.sort_by(|a, b| b.cmp(a));
    even.append(&mut odd);
    even
}
