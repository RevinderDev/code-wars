fn multiplication_table(len: usize) -> Vec<Vec<usize>> {
  let mut table: Vec<Vec<usize>> = vec![];
  for i in 1..(len+1) {
      let row: Vec<usize> = (1..len+1).into_iter().map(|x| x * i).collect();
      table.push(row);
  }
  table
}
