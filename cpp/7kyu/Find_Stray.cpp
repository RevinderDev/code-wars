int stray(std::vector<int> numbers) {
  
    for(int i=0;i<numbers.size();i++)
      {
        if(numbers[i]==numbers[i+1])
        {
          if(numbers[i]==numbers[i+2])
          {
            
          }
          else
          {
            return numbers[i+2];
          }
        }
        else if(numbers[i] != numbers[i+2])
          {
            return numbers[i];
          }
      }
   
};