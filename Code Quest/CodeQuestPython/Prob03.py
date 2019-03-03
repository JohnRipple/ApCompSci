INPUT_FILE_NAME = "prob03.txt"
import re
try:
    f = open(INPUT_FILE_NAME, "r")
    t = int(f.readline())
    while t > 0:
        t-= 1
        o = f.readline().rstrip('\n')
        inline = re.split("[th]",o)
        if int(inline[0]) == 1:
            print("1st")
        elif int(inline[0]) == 2:
            print("2nd")
        elif int(inline[0]) == 3:
            print("3rd")
        else:
            print(o)
finally:
    f.close()

