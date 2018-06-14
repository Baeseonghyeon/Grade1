data=[5,4,2,3,1]

def selectionsort(x):
    for i in range(len(x)):
        for j in range(i,len(x),1):
            if(x[i]>x[j]):
                x[i],x[j]=x[j],x[i]
    return x

print(selectionsort(data))
