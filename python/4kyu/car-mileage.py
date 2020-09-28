import re

# Love me some regex
t = r'\d0+|(\d)\1+|(1|^)((2|^)((3|^)((4|^)((5|^)((6|^)((7|^)((8|^)((9|^)((0|^))?)?)?)?)?)?)?)?)?|(9|^)((8|^)((7|^)((6|^)((5|^)((4|^)((3|^)((2|^)((1|^)((0|^))?)?)?)?)?)?)?)?)?'


def is_interesting(number, awesome_phrases):
    two_off = {number: 2,
               number + 1: 1,
               number + 2: 1}
    for val, reward in two_off.items():
        if val < 100:
            continue
        res = re.fullmatch(t, str(val))
        if res or is_palindrome(val) or val in awesome_phrases:
            return reward
    return 0


def is_palindrome(i):
    s = str(i)
    return s[::-1] == s
