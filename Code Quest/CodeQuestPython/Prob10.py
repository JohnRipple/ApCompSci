import re
INPUT_FILE_NAME = "Prob10.txt"
try:
    f = open(INPUT_FILE_NAME, "r")
    t = int(f.readline())
    while t > 0:
        t-= 1
        r = [int(i) for i in re.split(",", f.readline().strip("\n"))]
        r1 = [int(i) for i in re.split(",", f.readline().strip("\n"))]
        r2 = [int(i) for i in re.split(",", f.readline().strip("\n"))]

finally:
    f.close()