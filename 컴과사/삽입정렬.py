data=[5,3,4,2,1]
def insert_sort(x):
    for i in range(1,len(x)):
        for j in range(i,0,-1):
            if(x[j-1]>x[j]):
                x[j-1],x[j] = x[j],x[j-1]
                print(x)

insert_sort(data)
print(data)
