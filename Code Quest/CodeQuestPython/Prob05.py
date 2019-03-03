INPUT_FILE_NAME = "Prob05.txt"
try:
    f = open(INPUT_FILE_NAME, "r")
    t = int(f.readline())
    while t > 0:
        t-= 1
        inline = int(f.readline())
        o = inline
        counter = 0
        while inline > 1:
            if inline % 2 == 0:
                inline = inline / 2
            else:
                inline = inline * 3 + 1
            counter += 1
        print(str(o) + ":" + str(counter + 1))
finally:
    f.close()
