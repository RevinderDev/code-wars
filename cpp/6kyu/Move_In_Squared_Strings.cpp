class Opstrings1
{
public:
    static std::string rot(const std::string &strng);
    static std::string selfieAndRot(const std::string &strng);
    // ... complete oper
    template <typename Func>
    static std::string oper(Func func, const std::string &s)
    {
        return func(s);
    }
};

std::string Opstrings1::rot(const std::string &strng)
{
  std::string result;
	for(int i=strng.length()-1;i>=0;--i)
	{
		result+=strng[i];
	}
	return result;
}

std::string Opstrings1::selfieAndRot(const std::string &strng)
{

std::string dotString;
	std::string result;
	int counter = 0;
	bool dotStringCreated = false;
	for(int i = 0; i < strng.length();++i)
	{
		++counter;
		if(strng[i]=='\n')
		{
			if(!dotStringCreated){
			for(int j =0;j<counter-1;++j)
				dotString.append(".");
			dotStringCreated = true;
			}
			result+=dotString;
		}
		result+=strng[i];
	}
	result.append(dotString);
	dotString =result; // for reused
	dotString.append("\n");
	for(int i=result.length()-1;i>=0;--i)
	{
		dotString+=result[i];
	}
	
	return dotString;
}