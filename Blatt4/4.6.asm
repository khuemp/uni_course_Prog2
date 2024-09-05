	.text
	.globl fill
	
fill:
	li	$t0 0	
loop:
	beq	$t0 $a1 end
	lw	$t0 ($a0)
	addiu	$t0 $t0 1
	addiu	$a0 $a0 4
	j	loop
end:
	jr	$ra