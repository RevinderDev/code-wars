import string

def high(x):
    x = x.split(" ");
    ascii_lower = string.ascii_lowercase
    scores = [0] * len(x)
    index = 0
    for word in x:
        for letter in word:
            scores[index] += ascii_lower.index(letter) + 1
        index += 1
    
    return x[scores.index(max(scores))]
# Code here