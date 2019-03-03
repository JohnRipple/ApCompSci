INPUT_FILE_NAME = "prob01.txt"
try:
    f = open(INPUT_FILE_NAME, "r")
    t = int(f.readline())
    l = []
    while t > 0:
        t-= 1
        l += [f.readline()]
        #print(t, end=" ") print on one line
    print(l)
finally:
    f.close()

