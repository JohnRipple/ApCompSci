INPUT_FILE_NAME = "Prob13.txt"
from itertools import permutations
import re
try:
    f = open(INPUT_FILE_NAME, "r")
    t = int(f.readline())
    while t > 0:
        t-= 1
        inline = int(f.readline().replace("FIND SUM=",""))
        perm = permutations(list(map(int, re.split(",", f.readline()))))
        val = 0
        for i in list(perm):
            sum = 0
            previous = i[:val + 1]
            for j in range(i.__len__()):
                sum += i[j]
                if sum == inline and i[:j+1] != previous:
                    for k in range(j):
                        print(str(i[k]) + "+",end="")
                    print(str(i[j]))
                    val = j
finally:
    f.close()