import string

def find_missing_letter(chars):
    
    ascii_letters = string.ascii_letters
    start_index = ascii_letters.index(chars[0])
    char_index = 0
    for i in range(start_index,len(ascii_letters)):
        if chars[char_index] not in ascii_letters[i]:
            return ascii_letters[i]
        char_index += 1
  