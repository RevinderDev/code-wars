def whoIsNext(names, r):
    # your code
    r = r - 1
    while r >= 5:
        r = r - 5
        r = r / 2
    return names[int(r)]