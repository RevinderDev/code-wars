import string
import math

def str_to_numb(str):
    if not str:
        return 1
    is_negative = False
    if '-' in str:
        is_negative = True
        str = str.strip('-')
        if not str:
            return -1
    return int(str) * (-1) if is_negative else int(str)

def expand(expr):
    paranthesis, power = expr.split('^')
    n = int(power)
    if n == 0:
        return "1"
    equation = paranthesis.strip('(').strip(')')
    if n == 1:
        return equation
    for indx, char in enumerate(equation):
        if char in string.ascii_lowercase:
            equation = equation.split(char)
            equation.append(char)
            break

    a = str_to_numb(equation[0])
    b = str_to_numb(equation[1])
    return_eq = []
    for k in reversed(range(n + 1)):
        fact = math.factorial(n) / (math.factorial(k) * math.factorial(n - k))
        variable = (equation[2] if k > 0 else '') + ('^' + str(k) if k > 1 else '')
        adj = int(fact * a**k * b**(n-k))
        str_adj = ''
        if adj != 1:
            str_adj = str(adj) if adj != -1 else str(adj).strip('1')
        elif k == 0:
            str_adj = str(adj)

        return_eq.append(str_adj + variable)
    return '+'.join(return_eq).replace("+-", "-")
