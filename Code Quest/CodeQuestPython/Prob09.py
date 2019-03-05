import re
INPUT_FILE_NAME = "Prob09.txt"
try:
    f = open(INPUT_FILE_NAME, "r")
    t = int(f.readline())
    while t > 0:
        t-= 1
        inline = re.split(",", f.readline().strip("\n"))
        inline.sort(reverse = True)
        min = int(inline[0])
        sub = int(inline[1])
        c = 1
        while (c > 0):
            print(str(min) + "-" + str(sub) + "=" + str(min-sub))
            c = min - sub
            if min == 1 and sub == 1: break
            if c > sub: min = c
            else:
                min = sub
                sub = c
        if min == 1 and sub == 1: print("COPRIME")
        else: print("NOT COPRIME")
finally:
    f.close()