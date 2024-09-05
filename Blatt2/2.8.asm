EUCLID:
	b condition
loop:
	div 	$a0 $a1
	mfhi 	$t0
	move	$a0 $a1
	move 	$a1 $t0
condition:
	beqz	$a1 loop
end:
	move	$v0 $a0
	jr	$ra