def find_digit(num, nth):
    #your code here
    if nth <= 0:
        return -1
    stringed = str(abs(num))
    if len(stringed) < nth:
        return 0
    return int(stringed[-nth])
