INPUT_FILE_NAME = "BadDirections.txt"
import re
try:
    f = open(INPUT_FILE_NAME, "r")
    t = int(f.readline())
    while t > 0:
        t-= 1
        inline = re.split(" ", f.readline().strip("\n"))
        c = re.split("", inline[1])
        total = ""
        for i in range(1, len(c) - 1):
            if(int(c[i]) + int(inline[0]) >= 10):
                e = str(int(c[i]) + int(inline[0]))
                total += str(e[1])
            else:
                total += str(int(c[i]) + int(inline[0]))
        print(total)
finally:
    f.close()