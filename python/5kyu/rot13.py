import string 

def rot13(message):
    #your code here
    lower_case = string.ascii_lowercase
    upper_case = string.ascii_uppercase
    scrambled_str = ''
    for character in message:
        new_char = character
        if character in lower_case:
            new_char = scramble(character, lower_case)
        elif character in upper_case:
            new_char = scramble(character, upper_case)
        scrambled_str += new_char
    return scrambled_str

def scramble(character, arr):
    try:
        return arr[arr.index(character) + 13]
    except IndexError:
        return arr[arr.index(character) + 13 - len(arr)]