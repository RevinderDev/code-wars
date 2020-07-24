from collections import Counter
import re

def top_3_words(text):
    cnt = Counter()
    words = re.findall("'*[A-Za-z][A-Za-z']*", text)
    print(words)
    for word in words:
        cnt[word.lower()] += 1
    return [k for k, v in cnt.most_common(3)]
