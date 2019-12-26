import collections

def duplicate_count(text):
    # Your code goes here

    char_dict = collections.defaultdict(int)
    for char in text.lower():
        char_dict[char] += 1
    
    counter = 0
    for value in char_dict.values():
        if value > 1:
            counter += 1
            
    return counter