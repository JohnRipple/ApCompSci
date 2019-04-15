import re
import sys

sys.stdin = open('PartialTransmission.txt', 'r')

li=[]
for i in sys.stdin:
    li.append(i)

n = int(li[0])
p = int(li[1])
s = list(map(int, list(filter(None, re.split(" ", li[2].strip("\n"))))))
s.sort()
lastInt = 0;
for i in range(len(s)):
    if p + i != s[i] and p + i < p + n:
        print(p + i)
        break
    if i == len(s) - 1:
        print(s[len(s)-1] + 1)
