#include <vector>
typedef unsigned long long ull;
class ProdFib
{
public:
  static std::vector<ull> productFib(ull prod);
};

std::vector<ull> ProdFib::productFib(ull prod)
{
	std::vector<ull> result;
	
	int f1 = 1;
	int f0 = 0;
	ull fn2 = f1 + f0;
	ull fn1 = fn2 + f1;
	ull fn;
	
	for(;;)
	{
		fn = fn1 + fn2;
    if(fn1*fn2>prod)
    {
      result.push_back(fn2);
      result.push_back(fn1);
      result.push_back(0);
      break;
    }
    else if(fn1*fn2==prod)
    {
      result.push_back(fn2);
      result.push_back(fn1);
      result.push_back(1);
      break;
    }
		fn2 = fn1;
		fn1 = fn;
    
    
	}
	return result;

}