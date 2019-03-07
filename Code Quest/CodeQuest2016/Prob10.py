INPUT_FILE_NAME = "Prob10.txt"
import re
try:
    f = open(INPUT_FILE_NAME, "r")
    t = int(f.readline())
    while t > 0:
        t-= 1
        time = int(f.readline().strip("\n"))
        last = 0;
        cElev = 0;
        for i in range(time):
            inline = re.split(",", f.readline().strip("\n"))
            a = int(inline[0])
            b = int(inline[1])
            fAlt = (a-last) + a
            if fAlt <= b:
                print("PULL UP!")
            elif a - cElev <= 500:
               print("LOW ALTITUDE")
            else:
                print("ok")
            last = a
            cElev = b
finally:
    f.close()