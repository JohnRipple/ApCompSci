INPUT_FILE_NAME = "Prob02.txt"
import re
try:
    f = open(INPUT_FILE_NAME, "r")
    t = int(f.readline())
    while t > 0:
        t-= 1
        inLine = re.findall("[aeiou]", f.readline())
        print(inLine.__len__())
finally:
    f.close()