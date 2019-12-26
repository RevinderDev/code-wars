def zero(args = None): #your code here
    if not args:
        return 0
    else:
        return calculate(args[0], args[1], 0)
    
def one(args = None): #your code here
    if not args:
        return 1
    else:
        return calculate(args[0], args[1], 1)
    
def two(args = None): #your code here
    if not args:
        return 2
    else:
        return calculate(args[0], args[1], 2)
    
def three(args = None): #your code here
    if not args:
        return 3
    else:
        return calculate(args[0], args[1], 3)
    
def four(args = None): #your code here
    if not args:
        return 4
    else:
        return calculate(args[0], args[1], 4)
    
def five(args = None): #your code here
    if not args:
        return 5
    else:
        return calculate(args[0], args[1], 5)
    
def six(args = None): #your code here
    if not args:
        return 6
    else:
        return calculate(args[0], args[1], 6)
    
def seven(args = None): #your code here
    if not args:
        return 7
    else:
        return calculate(args[0], args[1], 7)
    
def eight(args = None): #your code here
    if not args:
        return 8
    else:
        return calculate(args[0], args[1], 8)
    
def nine(args = None): #your code here
    if not args:
        return 9
    else:
        return calculate(args[0], args[1], 9)
    
    
def calculate(operand, left_arg, right_arg):
    if operand is '+':
        return right_arg + left_arg
    elif operand is '-':
        return right_arg - left_arg
    elif operand is '/':
        return int(right_arg / left_arg)
    elif operand is '*':
        return right_arg * left_arg
        
    

def plus(input): #your code here
    return ['+', input]

def minus(input): #your code here
    return ['-', input]

def times(input): #your code here
    return ['*', input]

def divided_by(input): #your code here
    return ['/', input]