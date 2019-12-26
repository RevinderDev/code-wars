std::string my_first_interpreter(const std::string& code)
{
  // Your code here.
	unsigned char memoryCell = 0;
	std::string decodedMessage;
	for(int i=0;i<code.length();++i)
	{
		if(code[i]=='+')
		{
			++memoryCell;
		}
		else if(code[i]=='.')
		{
			decodedMessage+=memoryCell;
		}
	}
	return decodedMessage;
}