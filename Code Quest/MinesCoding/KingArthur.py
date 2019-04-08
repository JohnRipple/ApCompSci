INPUT_FILE_NAME = "KingArthur.txt"
try:
    f = open(INPUT_FILE_NAME, "r")
    d = float(f.readline())
    w = float(f.readline())
    n = int(f.readline())
    pi = 3.14159;
    c = d * pi;
    if w * n < c:
        print("YES")
    else:
        print("NO")
finally:
    f.close()