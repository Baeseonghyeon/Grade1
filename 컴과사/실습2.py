import turtle
t= turtle.Turtle()
t.shape("turtle")


num = int(turtle.textinput("","정수를 입력하세요."))
t.penup()
t.goto(100,100)
t.write("거북이가 여기로 오면 양수입니다")
t.goto(100,0)
t.write("거북이가 여기로 오면 0 입니다")
t.goto(100,-100)
t.write("거북이가 여기로 오면 음수입니다.")
t.goto(0,0)
t.pendown()

if num > 0:
    t.goto(100,100)
    
elif num == 0:
    t.goto(100,0)

else :
    t.goto(100,-100)
    
    
   
    
