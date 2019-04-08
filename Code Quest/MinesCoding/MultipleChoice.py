INPUT_FILE_NAME = "MultipleChoice.txt"
def sorting(s1, s2, b, b1):
    s1, s2 = zip(*sorted(zip(s1, s2), reverse=b))
    s1 = list(s1)
    s2 = list(s2)
    if b1 == False:
        for i in range(len(s1)):
            if i + 1 < len(s1):
                if score[i] == s2[i + 1]:
                    tempStu = [0] * 2
                    tempStu[0] = s1[i]
                    tempStu[1] = s1[i + 1]
                    tempStu.sort()
                    s1[i] = tempStu[0]
                    s1[i + 1] = tempStu[1]
    else:
        for i in range(len(s2)):
            if i + 1 < len(s2):
                if score[i] == s1[i + 1]:
                    tempStu = [0] * 2
                    tempStu[0] = s2[i]
                    tempStu[1] = s2[i + 1]
                    tempStu.sort()
                    s2[i] = tempStu[0]
                    s2[i + 1] = tempStu[1]
    for i in range(len(s1)):
        if b1 == False:
            print(str(s1[i]) + " " + str(s2[i]))
        else:
            print(str(s2[i]) + " " + str(s1[i]))
try:
    f = open(INPUT_FILE_NAME, "r")
    n = int(f.readline())
    answer = [None] * n
    for i in range(n):
        answer[i] = f.readline().strip("\n")
    m = int(f.readline())
    student = [0] * m
    score = [0] * m
    tempAns = [None] * n
    for i in range(m):
        student[i] = int(f.readline())
        for j in range(n):
            tempAns[j] = f.readline().strip("\n")
            if tempAns[j] == answer[j]:
                score[i] += 1
    order = f.readline().strip("\n")
    if order == "SUDENT_ID_ASC":
        sorting(student, score, False, False)
    elif order == "STUDENT_ID_DESC":
        sorting(student, score, True, False)
    elif order == "GRADE_ASC":
        sorting(score, student, False, True)
    else:
        sorting(score, student, True, True)

finally:
    f.close()