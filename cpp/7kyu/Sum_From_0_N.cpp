using namespace std;

class SequenceSum{
  int count;
  public:
  SequenceSum (int);
  string showSequence();
  
};

string SequenceSum::showSequence(){

    string output = "";
    int output_value = count;
    if( count == 0 )
      return to_string(count)+"="+to_string(0);
    else if(count <0)
      return to_string(count)+"<"+to_string(0);

      for(int i=0;i<count;i++)
      {
       output+=to_string(i)+"+";
       output_value += i;
      }
      return output +=to_string(count)+" = "+to_string(output_value);
}

SequenceSum::SequenceSum (int c) {
  count = c;
}