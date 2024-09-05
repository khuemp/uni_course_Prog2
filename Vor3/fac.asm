	.text
	.globl fac
fac:
	li 	$v0 1
	b check
loop:
	mul 	$v0 $v0 $a0
	addiu 	$a0 $a0 -1
check:
	bgtz 	$a0 loop
	jr 	$ra