INPUT_FILE_NAME = "PartialTransmission.txt"
import re
try:
    f = open(INPUT_FILE_NAME, "r")
    n = int(f.readline())
    p = int(f.readline())
    s = list(map(int, list(filter(None, re.split(" ", f.readline().strip("\n"))))))
    s.sort()
    lastInt = 0;
    for i in range(len(s)):
        if p + i != s[i] and p + i < p + n:
            print(p + i)
            break
        if i == len(s) - 1:
            print(s[len(s)-1] + 1)
finally:
    f.close()