INPUT_FILE_NAME = "Prob08.txt"
try:
    f = open(INPUT_FILE_NAME, "r")
    t = int(f.readline())
    while t > 0:
        t-= 1
        inline = f.readline().strip("\n").split()
        floatlist = [float(i) for i in inline]
        for i in range(floatlist.__len__()):
            if floatlist[i] < 180:
                floatlist[i] += 180
            else:
                floatlist[i] -= 180
            print(format(floatlist[i], '.2f'), end=" ")
        print("")

finally:
    f.close()

