using std::vector;
template<class TYPE>
int getLengthOfMissingArray(std::vector<std::vector<TYPE>> arrayOfArrays)
{
  if(arrayOfArrays.empty())
    return 0;

  vector<int> sizeOfVectors(arrayOfArrays.size());
  
	for (int i = 0 ; i<arrayOfArrays.size();i++)
	{
   if (arrayOfArrays[i].empty())
				return 0;
		for ( int j=0;j<arrayOfArrays[i].size();j++)
		{
			sizeOfVectors[i] += 1;
		}

	}

	sort(sizeOfVectors.begin(), sizeOfVectors.end());
  
	for (int i=0;i<sizeOfVectors.size()-1;i++)
	{
		if (sizeOfVectors[i + 1] - sizeOfVectors[i] != 1)
			return sizeOfVectors[i]+1;
	}
}