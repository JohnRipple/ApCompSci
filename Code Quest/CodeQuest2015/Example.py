INPUT_FILE_NAME = "prob01.txt"
try:
    f = open(INPUT_FILE_NAME, "r")
    t = int(f.readline())
    while t > 0:
        t-= 1
finally:
    f.close()

