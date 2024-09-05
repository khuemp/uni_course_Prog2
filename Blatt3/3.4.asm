	.data
msg: 	.byte 'P','r','o','g',0
	.align 2 #chia 4 bytes 2,0,0,0 vao 2^2 phan
num:	.byte 2,0,0,0

	.text
	la	$a0 msg
	li	$v0 4 #Gebe Zeichenkette aus (Syscall4)
	syscall
	lw	$a0 num #use lb (load byte) to cointain number 2
	li	$v0 1 #Gebe Integer aus (Syscall1)
	syscall
#or
	.data
msg: 	.byte 'P','r','o','g'
num:	.byte 2,0,0,0 #already du 4 phan

	.text
	la	$a0 msg
	li	$v0 4 #Gebe Zeichenkette aus (Syscall4)
	syscall
	lw	$a0 num
	li	$v0 1 #Gebe Integer aus (Syscall1)
	syscall
#or
	.data
msg: 	.byte 'P','r','o','g',0
	.space 3 # adress prog0 = 5 + 3 = space 3 la 8 du 2 phan va phan sau se du 4 byte cho 2,0,0,0
num:	.byte 2,0,0,0

	.text
	la	$a0 msg
	li	$v0 4 #Gebe Zeichenkette aus (Syscall4)
	syscall
	lw	$a0 num
	li	$v0 1 #Gebe Integer aus (Syscall1)
	syscall