import sys

def prime(x):
    if x < 2:
        return False
    else:
        for j in range(2, int(x ** (1 / 2.0)) + 1):
            if (x % j) == 0:
                return False
        return True

def sumDigits(digit):
    return sum(int(x) for x in digit if x.isdigit())

sys.stdin = open('AdditivePrimesInput.txt', 'r')
li = []
for i in sys.stdin:
    li.append(i)

t = int(li[0])
thold = str(t)
s: bool = prime(t)
if s:
    total = int(sumDigits(thold))
    if prime(total):
        print("ADDITIVE PRIME")
    else:
        print("PRIME, BUT NOT ADDITIVE")
else:
    print("COMPOSITE")
sys.exit()
