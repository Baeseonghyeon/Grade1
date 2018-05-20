data =[]

def list_input():
    global data
    list_length=0

    while 1 :
        print(list_length+1,"번째")
        temp = input("data 입력\"끝\"입력시 종료:")
        if temp == "끝":
            break
        data.append(int(temp))
        list_length = list_length+1

    print("입력받는값=",data)

    return list_length

def sorting(length):
    global data

    for n in range(length):
        datamin = min(data[n:])

        for i in range(length):
            if datamin==data[i]:
                location =i

        
        temp = data[n]
        data[n] = datamin
        data[location]=temp

def select_sorting(length):

    sorting(length)

Is=list_input()
select_sorting(Is)
print("Sort 결과 =",data)

