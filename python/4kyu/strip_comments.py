def solution(string,markers):
    #your code here
    print(f'orignal string: {repr(string)}')
    if len(string) <= 0 or len(markers) <= 0:
        return string
    for marker in markers:
        string = remove_marker_line(string, marker)
    
    print(f'markers = {markers}')
    print(f'Xxpected: {repr(string)}')
    return string.strip()

def remove_marker_line(string, marker):
    j = 0
    while j<=string.count(marker):
        try:
            j += 1
            comment_idx = string.index(marker)
            for i in range(comment_idx, len(string) - 1):
                #print(f'string test = {repr(string[i:i+1])}')
                if string[i:i+1] == "\n":
                    string = string[0:comment_idx - 1] + string[i:]
                    break
                elif i >= len(string) - 1:
                    string = string[0:comment_idx - 1] + string[i+2:]
                    break
        except ValueError:
            break
    return string

#print(solution("apples, pears # and bananas\ngrapes\nbananas !apples", ["#", "!"]) == "apples, pears\ngrapes\nbananas")
#print(solution('apples\nlemons cherries cherries\noranges strawberries oranges watermelons apples\n^ watermelons strawberries #\navocados cherries watermelons lemons', ["'", ',', '.', '=', '^', '?']) == 'apples\nlemons cherries cherries\noranges strawberries oranges watermelons apples\n\navocados cherries watermelons lemons')
#print(solution('apples, pears # and bananas\ngrapes\navocado @apples', ['@', '!']) == 'apples, pears\ngrapes\nbananas')
print(solution('apples\nbananas cherries watermelons pears apples .\noranges bananas = oranges\n?\noranges strawberries', ['?', "'", '@', '=', '^', ',', '!', '-', '#']) == 'apples\nbananas cherries watermelons pears apples .\noranges bananas\n\noranges strawberries')
str1 = 'apples\nbananas cherries watermelons pears apples .\noranges bananas\n\noranges strawberries'
print(f'Expected: {repr(str1)}\n')
print(solution('cherries\nstrawberries lemons ^ cherries\n- bananas pears lemons cherries strawberries\n#\noranges apples -', ['?', '#', ',', '-'])=='cherries\nstrawberries lemons ^ cherries\n\n\noranges apples')
str2 = 'cherries\nstrawberries lemons ^ cherries\n\n\noranges apples'
print(f'Expected: {repr(str2)}')

#  Log
# orignal string: '#'
# MARKER = #
# MARKER = !
# markers = ['#', '!']
# '#' should equal ''


#  Log
# orignal string: '\n§'
# MARKER = #
# MARKER = §
# markers = ['#', '§']
# '\n§' should equal '\n'