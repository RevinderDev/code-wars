def sum_of_intervals(intervals):
    s = []
    for interval in intervals:
        for i in range(interval[0], interval[1]):
            if i not in s:
                s.append(i)

    return len(s)
