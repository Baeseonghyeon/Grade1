list=[]
i = 0
list_length=-1
while 1:
    i+=1
    list_length+=1
    print(i,"번째")
    data = input("data 입력 \"끝\"입력시 종료:")
    
    if data=='끝':
        print("입력 받은 값",list)
        for j in range(0,list_length-1):
            if list[j]>list[j+1]:
                a = list[j]
                list[j]=list[j+1]
                list[j+1] = a
        print("Sprt결과 =",list)
        break
    list.append(int(data))

    
    
    
