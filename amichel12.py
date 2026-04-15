#Andrew Michel
#Lab 8
#CSC 321

import math

def areaRectangle(base, height):
    return(base*height)

def circleArea(radius):
    return math.pi*radius*radius

base = float(input("Enter the base of the rectangle:\n"))
height = float(input("Enter the height of the rectangle:\n"))

area1 = areaRectangle(base, height)

print(f"The area of the rectangle is: {area1}\n")

radius = float(input("Enter the radius of the circle:\n"))

area2 = circleArea(radius)

print(f"The area of the circle is: {area2}")
