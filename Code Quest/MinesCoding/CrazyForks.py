INPUT_FILE_NAME = "CrazyForks.txt"
import re
import sys

sys.stdin = open(INPUT_FILE_NAME, 'r')

li = []
for i in sys.stdin:
    li.append(i)
counter = 0
t = 1
p = 0
l = [0] * 50
while t > 0:
    if p != -2:
        str_list = list(filter(None, re.split(" ", li[counter].strip("\n"))))
    elif counter < len(li):
        str_list = li[counter].strip("\n")
    if counter >= len(li):
        for i in range(len(l)):
            if l[i] > 0:
                print(l[i], end=" ")
        break
    if (p > -1) and str_list[0] == "#":
        p+=1
    elif p > -1:
        print(p)
        p = -2
    if p == -2 and len(str_list[0]) == 1:
        for i in range(len(str_list)):
            if(str_list[i] == "#"):
                l[i] += 1
    counter += 1
