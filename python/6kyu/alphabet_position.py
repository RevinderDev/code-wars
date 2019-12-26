import string

def alphabet_position(text):
    letter_list = list(string.ascii_lowercase)
    calculated_positions_list = []
    for letter in text.lower():
        if letter in letter_list:
            calculated_positions_list.append(str(letter_list.index(letter) + 1))
    return " ".join(calculated_positions_list)