INPUT_FILE_NAME = "Prob11.txt"
import re
def encrypt():
    c = f.readline().strip("\n") + " "
    a = "abcdefghijklmnopqrstuvwxyz "
    return c, a
def decrypt():
    c = f.readline().strip("\n") + " "
    a = "abcdefghijklmnopqrstuvwxyz "
    return a, c
try:
    f = open(INPUT_FILE_NAME, "r")
    t = int(f.readline())
    while t > 0:
        t-= 1
        ende = f.readline().strip("\n")
        if ende == "ENCRYPT":
           cypher, alpha = encrypt()
        else:
            cypher, alpha = decrypt()
        cases = int(f.readline())
        for i in range(cases):
            words = f.readline().strip("\n")
            upper = []
            ucounter = 0
            for j in range(words.__len__()):
                if words[j].isupper():
                    upper += [j]
            words = words.lower()
            for j in range(words.__len__()):
                if ucounter < upper.__len__():
                    if j == upper[ucounter]:
                        print(cypher[alpha.index(words[j])].upper(), end="")
                    else:
                        print(cypher[alpha.index(words[j])], end="")
                else:
                    print(cypher[alpha.index(words[j])], end="")
            print("")
finally:
    f.close()

