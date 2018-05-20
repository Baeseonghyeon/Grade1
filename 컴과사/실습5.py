import turtle
t = turtle.Turtle()
t.shape("turtle")

도형 = turtle.textinput("","도형을 입력하세요.:")

if 도형 == '사각형':
    가로 = int(turtle.textinput("","가로:"))
    세로 = int(turtle.textinput("","세로:"))
    t.fd(가로)
    t.right(90)
    t.fd(세로)
    t.right(90)
    t.fd(가로)
    t.right(90)
    t.fd(세로)
    t.right(90)
elif 도형 == '삼각형':
    길이 = int(turtle.textinput("","길이:"))
    t.fd(길이)
    t.left(120)
    t.fd(길이)
    t.left(120)
    t.fd(길이)
    t.left(120)
elif 도형 == '원':
    반지름 = int(turtle.textinput("","반지름:"))
    t.circle(반지름)
