INPUT_FILE_NAME = "practice.txt"
try:
    f = open(INPUT_FILE_NAME, "r")
    s = f.readline()
    l = s.rstrip('\n').split(",")
    print(l)

    #print(t, end=" ") print on one line

finally:
    f.close()

