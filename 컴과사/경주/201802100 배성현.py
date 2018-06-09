import turtle #터틀 받아오기
import random # 난수를 받아오기
from turtle import TurtleScreen, RawTurtle, TK
from tkinter import*
image = turtle.Screen() # 터틀의 이미지를 받아오기 위해 이 코드 사용
Player=[] # 리스트를 만들어 선수가 만들어 질때마다 추가
PlayerRank=[] # 리스트를 만들어 선수가 도착했을때 리스트에 추가됨
PlayerName=['소','토끼','거북이','다람쥐','돼지'] # 선수 이름을 설정함


def Feild():  ## 필드 함수를 정의함
    t=turtle.Turtle()
    t.hideturtle() # 그리는 터틀을 숨김
    t.color("black","#f48341") # 사각형을 그린후 색을 채우기 위해 color값을 두개 설정, hex코드를 사용
    t.pensize(15) # 펜 사이즈 설정
    t.penup()   
    t.goto(-500,-200) #운동장 설정하기 위해 처음 출발지점
    t.pendown()
    t.begin_fill()#여기서 부터 색을 채우기 시작함
    t.fd(width)
    t.left(90)
    t.fd(length)
    t.left(90)
    t.fd(width)
    t.left(90)
    t.fd(length)
    t.end_fill() # 색을 채움 
    
def ready():  ## 선수 입장 함수정의
    if PlayerNumber>=1: # 입력받은 선수가 1명일때
        t1 = makeTurtle("#cc7733","cow.gif",1) # t1은 makeTurtle의 객체를 생성함. (색상코드,이미지파일이름,넘버링)
    if PlayerNumber>=2: # 입력받은 선수가 2명일때
        t2 = makeTurtle("#cc3389","rabbit.gif",2)
    if PlayerNumber>=3: # 입력받은 선수가 3명일때
        t3 = makeTurtle("#33cc7f","turtle.gif",3)
    if PlayerNumber>=4: # 입력받은 선수가 4명일때
        t4 = makeTurtle("#337fcc","squirrel.gif",4)
    if PlayerNumber>=5: # 입력받은 선수가 5명일때
        t4 = makeTurtle("#f7bed3","pig.gif",5)

class makeTurtle: # 터틀을 만드는 클래스를 생성함
    def __init__(self,color,image1,number): ## init를 사용해 생성자를 만듬 
        self=turtle.Turtle() # self는 t들 , 터틀을 생성
        Player.append(self)  # player리스트에 t들을 append
        image.addshape(image1) # 이미지를 불러오기위한 코드
        self.shape(image1)     #이미지의 모양을 터틀로 만듬
        self.color(color)   # 색상을 넣음
        self.pensize(5)     # 선의 굵기
        self.penup()        #이동할때 펜을 들어서 이동
        self.speed(100)     # 이동속도
        self.goto(-500, -50*number-200)  #넘버링마다 출발지점을 다르게 지정
        self.pendown()  

def move(): # 선수들이 움직이기 위한 함수
    num=0 ## num이 playernumber가 될때 종료 하기 위해 선언
    x=[0,0,0,0,0]##한변의 이동거리
    edge=[0,0,0,0,0] # 모서리를 지날때 증가하며 도착지점에 올때  증가
    while 1:  # 반복문 실행
        for i in range(0,PlayerNumber,1): # for문을 실행하되 0부터 PlayerNumber-1까지 1씩증가
            ran=random.randint(60,120) # 난수를 60부터 120까지 설정
            if edge[i]==5: # edge가 5일때는 한바퀴 돌고 출발지점을 도착했으므로 더이상 움직이지 않음
                continue
            elif edge[i]== 0: # edge가 0일때 첫번째 변임
                if x[i]+ran>width+50*(PlayerNumber-i+1): # 선수가 설정된 범위를 넘어설때, 선수간의 거리차는 50
                    run = width+50*(PlayerNumber-i+1)-x[i] #run을 마지막 코너링하는 변까지 거리설정
                    Player[i].fd(run)   # run값으로 달림
                    x[i]=0 # 다시 이동거리를 0으로 설정
                else: #선수가 설정된 범위를 넘어서지 않을때
                    x[i]+=ran #선수의 이동거리 설정
                    Player[i].fd(ran) # 선수는 달림
            elif edge[i] == 1 or edge[i] == 3: # edge가 1이나 3일떄는 세로로 이동함
                if x[i]+ran>length+100*(i+1):  # 선수가 설정된 범위를 넘어설때, 가로에서 넘은 길이를 세로에서 매꿈
                    run = length+100*(i+1)-x[i] #run을 마지막 코너링하는 변까지 거리설정
                    Player[i].fd(run)# run값으로 달림
                    x[i]=0 # 다시 이동거리를 0으로 설정
                    
                else:
                    x[i]+=ran  #선수의 이동거리 설정
                    Player[i].fd(ran) # 선수는 달림
            elif edge[i]==2: #3번째변 일때
                if x[i]+ran>width+100*(PlayerNumber-i+1): # 선수가 설정된 범위를 넘어설때, 첫번째 변보다 조금더 이동한다
                    run = width+100*(PlayerNumber-i+1)-x[i] #run을 마지막 코너링하는 변까지 거리설정
                    Player[i].fd(run)# run값으로 달림
                    x[i]=0 # 다시 이동거리를 0으로 설정
                else:   #선수가 설정된 범위를 넘어서지 않을때
                    x[i]+=ran#선수의 이동거리 설정
                    Player[i].fd(ran) # 선수는 달림
            elif edge[i]==4: ### 마지막 결승점 까지 달리는 경우
                if x[i]+ran>50*(PlayerNumber-i+1): #남아 있는거리 계산
                    run = 50*(PlayerNumber-i+1)-x[i]
                    Player[i].fd(run)
                    x[i]=0
                else:
                    x[i]+=ran
                    Player[i].fd(ran)
                    
                    
            if x[i]==0: ## 코너를 돌아야 할 경우를 말함
                Player[i].left(90) # 90도로 턴
                edge[i]+=1 # 엣지리스트 1추가
            if edge[i]==5: # 결승점에 도달했을 경우
                PlayerRank.append(PlayerName[i]) # 플레이어 등수 리스트에 플레이어 이름을 저장
                num+=1 # 모두 도착했을경우 게임을 종료해야하므로 num 변수 +1
            
        if num==PlayerNumber: # 플레이어가 모두 도착하면
            break

def Rank():
    root = TK.Tk()
    cv1 = TK.Canvas(root, width=400, height=200)
    cv1.pack()
    s1 = TurtleScreen(cv1)
    s1.bgcolor("#42f4ad")
    t = RawTurtle(s1)
    t.hideturtle()
    t.penup()
    t.goto(-50,70)
    t.write("내가 예측한 1등: "+ guess)
    t.goto(-50,50)
    if PlayerNumber>=1:
        t.write("1등 : "+PlayerRank[0])
        t.goto(-50,40)
    if PlayerNumber>=2:
        t.write("2등 : "+PlayerRank[1])
        t.goto(-50,30)
    if PlayerNumber>=3:
        t.write("3등 : "+PlayerRank[2])
        t.goto(-50,20)
    if PlayerNumber>=4:
        t.write("4등 : "+PlayerRank[3])
        t.goto(-50,10)
    if PlayerNumber>=5:
        t.write("5등 : "+PlayerRank[4])
    t.goto(-100,-20)
    if(guess==PlayerRank[0]):
        t.write("축하드립니다. 1등을 맞추셨습니다.")
    else:
        t.write("1등을 맞추지 못했습니다.")

def result():
    window = Tk()
    button = Button(window,text="결과확인",command=Rank)
    button.pack()
    window.mainloop()
    
width = int(turtle.textinput("","경기장의 가로의 길이를 설정하세요."))
length = int(turtle.textinput("","경기장의 세로의 길이를 설정하세요."))
PlayerNumber = int(turtle.textinput("","선수 인원을 입력하세요.(최대 5명)"))
guess = turtle.textinput("","누가 우승할까요???(소,다람쥐,토끼,거북이,돼지)")
Feild()
ready()
move()
result()


