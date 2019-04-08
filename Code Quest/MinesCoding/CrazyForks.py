INPUT_FILE_NAME = "CrazyForks.txt"
import re
try:
    f = open(INPUT_FILE_NAME, "r")
    t = 1
    p = 0
    l = [0] * 50
    while t > 0:
        if p != -2:
            str_list = list(filter(None, re.split(" ", f.readline().strip("\n"))))
        else:
            str_list = f.readline().strip("\n")
        t = len(str_list)
        if t == 0:
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
finally:
    f.close()