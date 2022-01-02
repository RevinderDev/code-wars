fn dna_strand(dna: &str) -> String {
  // Translate the DNA strand
  dna.chars().map(|c|
      match c {
        'A' => 'T',
        'T' => 'A',
        'G' => 'C',
        'C' => 'G',
        _ => c,
    }).collect()
}
