def disemvowel(string):
    vowels = ['a','e','i','o','u','A','E','I','O','U']
    temp_string = string
    for letter in string:
        if letter in vowels:
            string = string.replace(letter,"")
    return string