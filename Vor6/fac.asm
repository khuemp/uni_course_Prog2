	.text
	# fac(n):=fac(n-1)*n für n>=1, 1 für n<1
f_rec:
	li	$v0 1
	bgtz	$a0 rec
	jr	$ra
rec:
	addiu	$sp $sp -8
	sw	$ra 0($sp)
	sw	$a0 4($sp)
	addiu	$a0 $a0 -1
	jal	f_rec
	lw 	$a0 4($sp)
	mul	$v0 $v0 $a0
	lw	$ra 0($sp)
	addiu	$sp $sp 8
	jr	$ra
	
	#f_trec_intern(n,r):=f_trec_intern(n-1,r*n) falls n>=1, r falls n<1
	#f_trec(n):=f_trec_intern(n,1)
f_trec:
	li 	$a1 1
f_trec_intern:
	bgtz	$a0 L
	move 	$v0 $a1
	jr	$ra
L:
	mul	$a1 $a1 $a0
	addiu	$a0 $a0 -1
	b	f_trec_intern
	
	.globl main
main:
	li	$a0 4
	jal	f_rec #f_trec
	move 	$a0 $v0
	li	$v0 1
	syscall
	li 	$v0 10
	syscall