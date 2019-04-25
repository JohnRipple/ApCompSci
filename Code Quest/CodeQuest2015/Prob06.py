import re
INPUT_FILE_NAME = "prob06.txt"
def iter(li, l, size):
    for b in range(len(li)):
        for i in range(size[1]):
            for j in range(size[0]):
                if l[j][i] == li[0]:
                    if check(j, i, li, l, 0, size):
                        return True
    return False

def check(c, e, li, l, b, size):
    if b == len(li)-1:
        return True
    if c+1 < size[0]:
        if l[c+1][e] == li[b+1]:
            if check(c+1, e, li, l, b+1, size):
                return True
        if e+1 < size[1]:
            if l[c + 1][e + 1] == li[b + 1]:
                if check(c + 1, e + 1, li, l, b + 1, size):
                    return True
        if e-1 >= 0:
            if l[c + 1][e - 1] == li[b + 1]:
                if check(c + 1, e - 1, li, l, b + 1, size):
                    return True
    if c-1 > 0:
        if l[c - 1][e] == li[b + 1]:
            if check(c - 1, e, li, l, b + 1, size):
                return True
        if e+1 < size[1]:
            if l[c - 1][e + 1] == li[b + 1]:
                if check(c - 1, e + 1, li, l, b + 1, size):
                    return True
        if e-1 >= 0:
            if l[c - 1][e - 1] == li[b + 1]:
                if check(c - 1, e - 1, li, l, b + 1, size):
                    return True
    if e+1 < size[1]:
        if l[c][e + 1] == li[b + 1]:
            if check(c, e + 1, li, l, b + 1, size):
                return True
    if e-1 >= 0:
        if l[c][e - 1] == li[b + 1]:
            if check(c, e - 1, li, l, b+1, size):
                return True
    return False
try:
    f = open(INPUT_FILE_NAME, "r")
    t = int(f.readline())
    size = list(map(int, f.readline().strip("\n").split(" ")))
    print(size)
    l = [[]]*size[1]
    while t > 0:
        t-= 1
        for i in range(size[1]-1):
            l[i] = f.readline().strip("\n").split(" ")
            print(l[i])
    t = int(f.readline())
    while t > 0:
        t-=1
        li = list(filter(None, re.split("",f.readline().strip("\n"))))
        if iter(li, l, size):
            for i in range(len(li)):
                print(li[i], end="")
            print()
finally:
    f.close()