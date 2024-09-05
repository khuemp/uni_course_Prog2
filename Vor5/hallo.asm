	.data
msg:
	.ascii "Hallo Welt"
	.asciiz "Ciao"
	.text
	li 	$v0 4
	la	$a0 msg
	syscall
	li 	$v0 10
	syscall