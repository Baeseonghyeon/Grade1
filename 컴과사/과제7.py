import turtle
t = turtle.Turtle()
t.shape("turtle") #터틀 을 실행하고 모양은 터틀

t.penup()#펜을 up함으로써 그려지지 않음
t.goto(100,100)#좌표(100,100)로 이동
t.write("A학점 입니다.")# 터틀이 입력
t.goto(100,50)
t.write("B학점 입니다.")
t.goto(100,0)
t.write("C학점 입니다.")
t.goto(100,-50)
t.write("D학점 입니다.")
t.goto(100,-100)
t.write("F학점 입니다.")
t.goto(0,0)#다시 원위치

grade = int(turtle.textinput("","성적을 입력하시오."))
t.pendown()

if grade>=90:#조건문을 이용
    t.goto(100,100)
elif grade>=80:
    t.goto(100,50)
elif grade>=70:
    t.goto(100,0)
elif grade >=60:
    t.goto(100,-50)
else:#위의 조건이 아니면 밑의것을 실행
    t.goto(100 ,-100)
    
