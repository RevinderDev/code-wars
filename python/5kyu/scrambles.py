def scramble(s1, s2):
    # your code here
    for character in set(s2):
        if s1.count(character) < s2.count(character):
            return False
    return True


######################

def scramble(s1, s2):
    your code here
    result = True
   for character in s2:
       if character not in s1:
           return False
       i = s1.index(character)
       s1 = s1[0:i] + s1[i+1:]
   return result
  