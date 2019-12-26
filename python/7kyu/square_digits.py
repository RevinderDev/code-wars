def square_digits(num):
    digits = []
    while num:
        digit = num % 10
        digits.append(digit * digit)
        num //= 10  
    digits.reverse()
    squared_digits = int("".join(map(str,digits)))
    return squared_digits