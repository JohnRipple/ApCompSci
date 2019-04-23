INPUT_FILE_NAME = "Prob14.txt"
def moveTower(height,fromPole, toPole, withPole):
    if height >= 1:
        moveTower(height-1,fromPole,withPole,toPole)
        moveDisk(fromPole,toPole)
        moveTower(height-1,withPole,toPole,fromPole)

def moveDisk(fp,tp):
    print("moving disk from",fp,"to",tp)


try:
    f = open(INPUT_FILE_NAME, "r")
    t = int(f.readline())

    while t > 0:
        t-= 1
        inline = int(f.readline())
        print(inline)
        moveTower(inline, "A", "B", "C")
finally:
    f.close()