using std::vector;
class Kata {
  public:
  static bool validate(long long int n) {
    	vector < int > cardNumber;
	while(n>0)
	{
		cardNumber.insert(cardNumber.begin(),n%10);
		n=n/10;
	}
	
	int startingPoint{0}; 
	if(cardNumber.size()%2!=0) // if not even start from 2nd
	{
		startingPoint = 1;
	}
	
	for( int i=startingPoint;i<cardNumber.size()-1;i += 2)
	{
		cardNumber[i]=cardNumber[i]*2;
		if(cardNumber[i]>9)
		{
			int temp = cardNumber[i];
			cardNumber[i]=0;
			while(temp>0)
			{
				cardNumber[i]+= temp%10;
				temp/=10;
			}
		}
	}
	
	int sum_of_elements{0};
	for(auto& element:cardNumber)
		sum_of_elements+=element;
	
	if(sum_of_elements%10==0)
		return true;
	else
		return false;
	
  }
};