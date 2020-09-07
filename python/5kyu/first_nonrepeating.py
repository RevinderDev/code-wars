from collections import Counter

def first_non_repeating_letter(string):
    #your code here
    cnt = Counter()
    for c in string.upper():
        cnt[c] += 1

    for c in string:
        if cnt[c.upper()] == 1:
            return c
    return ''
