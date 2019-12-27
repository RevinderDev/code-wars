def in_array(array1, array2):
    # your code
    substrings_shared = []
    for word1 in array1:
        for word2 in array2:
            if word1 in word2 and word1 not in substrings_shared:
                substrings_shared.append(word1)
    substrings_shared.sort()
    return substrings_shared