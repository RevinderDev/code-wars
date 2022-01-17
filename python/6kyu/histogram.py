def hist(s):
    # your code
    errors = ['u', 'w', 'x', 'z']
    result = ''
    for error in errors:
        count = s.count(error)
        if count == 0:
            continue
        if count >= 10:
            spaces = f" " * 4
        else:
            spaces = f" " * 5
        result += f"{error}  {count}{spaces}{'*' * count}\r"
    return result[:-1]
