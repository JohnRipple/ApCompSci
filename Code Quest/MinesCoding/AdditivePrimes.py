INPUT_FILE_NAME = "AdditivePrimesInput.txt"
import re

def prime(x):
    if x > 1:
        for i in range(2, x//2):
            if (x % i ) == 0:
               return False
        else:
            return True
    else:
        return False

try:
    f = open(INPUT_FILE_NAME, "r")
    t = int(f.readline())
    thold = str(t)
    s = prime(t)
    if s == True:
        p = re.split("", thold)
        total = 0;
        for i in range(1, len(p) - 1):
            total += int(p[i])
        if(prime(total) == True):
            print("ADDITIVE PRIME")
        else:
            print("PRIME, BUT NOT ADDITIVE")
    else:
        print("COMPOSITE")
finally:
    f.close()

