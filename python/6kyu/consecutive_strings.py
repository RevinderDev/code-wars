def longest_consec(strarr, k):
    # your code
    if k <= 0 or len(strarr) <= 0 or len(strarr) < k:
        return ""
    longest_string = ""
    current_max_length = 0
    for i in range(0, len(strarr)):
        entry = ''.join(strarr[i:i+k])
        possible_max = len(entry)
        if current_max_length < possible_max:
            current_max_length = possible_max
            longest_string = entry
    
    return longest_string
            
