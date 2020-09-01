cache = {}

def fibonacci(n):
    if n in cache:
        return cache[n]
    if n <= 2:
        f = 1
    else:
        f = fibonacci(n-1) + fibonacci(n-2)
    cache[n] = f
    return f

    
