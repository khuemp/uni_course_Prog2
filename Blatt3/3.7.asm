	.data
zahl:	.word -2147

	.text
	lw	$a0 zahl
	bgtz	$a0 exit
	subu	$a0 $0 $a0
exit:
	li	$v0 1
	syscall
	li 	$v0 10
	syscall