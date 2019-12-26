def two_oldest_ages(ages):
    #your code here
    ages = sorted(ages)
    return [ages[-2], ages[-1]]