sq :: Int -> Int
sq x = x *x

cube x = x*(sq x)

add::  Int -> Int -> Int -> Int
add x y  z = x+y+z

sqsum x y = sq x + sq y

--factorial:: Int -> Int
factorial x 
		|x==0 =1
		|x<0 =error "negative vlaues"
		|otherwise =x*(factorial (x-1))