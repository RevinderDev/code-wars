def rgb(r, g, b):
    #your code here :)
    return ''.join([hexify(r), hexify(g), hexify(b)])

def hexify(value):
    fixed_value = fix_bounds(value)
    v = hex(fixed_value).upper()
    ONE_DIGIT_LENGTH = 1
    if len(v) - 2 == ONE_DIGIT_LENGTH:
        return v.replace("X", "")
    return v[2:]
  
def fix_bounds(value):
    if value < 0:
        return 0
    if value > 255:
        return 255
    return value