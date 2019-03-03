INPUT_FILE_NAME = "Prob00.txt"
try:
    f = open(INPUT_FILE_NAME, "r")
    t = int(f.readline())
    while t > 0:
        t-= 1
        inline = f.readline()
finally:
    f.close()

