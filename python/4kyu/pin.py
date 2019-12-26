import itertools

pinpad = {
    '1': ['1','2','4'],
    '2': ['1','2','3','5'],
    '3': ['2','3','6'],
    '4': ['1','4','5','7'],
    '5': ['2', '4','5','6', '8'],
    '6': ['6','3','5','9'],
    '7': ['4','7','8'],
    '8': ['5','7','8','9','0'],
    '9': ['6','8','9'],
    '0': ['0','8'],
}


def get_pins(observed):
    l = [pinpad[char] for char in observed]
    seen_pins = []
    for i in itertools.product(*l):
        seen_pins.append(''.join(i))
    return seen_pins