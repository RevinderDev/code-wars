using namespace std;
class Evaporator
{

  public:
  static int evaporator(double content, double evap_per_day, double threshold)
  {
    // content - ml
    // evap_per_day - % of ml lost daily
    // threshold - % after which is no longer usable
    double threshold_value = content*(threshold/100);
    double content_lost;
    int days = 0;
    while(content >= threshold_value)
    {
      content_lost = content*(evap_per_day/100);
      content = content - content_lost;
      days++;
    }
	return days;
  }
  
};