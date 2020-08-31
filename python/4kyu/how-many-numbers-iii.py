def find_all(sum_dig, digs):
    # your code here
    min_number = int('1' * digs)
    max_number = int('9' * digs) + 1
    possible_numbers = []

    i = min_number
    while i < max_number:
        sum, ascending, digit_idx, digit = sum_digits(i)
        if not ascending:
            i = int(str(i)[:digit_idx] + str(digit) * (digs - digit_idx))
            continue
        if ascending and sum == sum_dig:
            possible_numbers.append(i)
        i += 1

    if not possible_numbers:
        return []
    return [len(possible_numbers), min(possible_numbers), max(possible_numbers)]

def is_ascending(data):
    index = 0
    for a, b in zip(data[1:], data):
        if a < b:
            return (False, index, b)
        index += 1
    return (True, index, b)

def sum_digits(n):
    r = 0
    digits = []
    while n:
        r = r + n % 10
        digits.append(n % 10)
        n = n // 10
    result, digit_idx, digit = is_ascending(digits[::-1])
    return (r, result, digit_idx, digit)
