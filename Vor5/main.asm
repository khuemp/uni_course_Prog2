	.data
x_begin:
	.word	1,1,2,3,4,1,7 #byte
x_end:
y_begin:
	.word	23,17,19
y_end:
#delete all to y related code
	.text 
	.globl main
main:
	la 	$a0 x_begin
	la 	$a1 x_end
	jal 	sum
	move 	$a0 $v0
	li 	$v0 1
	syscall
	la 	$a0 y_begin
	la 	$a1 y_end
	jal 	sum
	move 	$a0 $v0
	li 	$v0 1
	syscall
	li 	$v0 10
	syscall
#delete all to y related code