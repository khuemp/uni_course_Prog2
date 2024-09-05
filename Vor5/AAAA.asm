	.data
msg:
	.asciiz "AAAA"
	#.byte 65,65,65,65
	.text
main:
	la 	$a0 msg
	jal	strlen
	move 	$a0 $v0
	li 	$v0 1
	syscall
	li 	$v0 10
	syscall
