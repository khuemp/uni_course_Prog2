	.text
	
	move	$t0 $a0
	
loop_scan:
	lbu	$t1 ($t0)
	addiu	$t0 $t0 1
	bnez	$t1 loop_scan #tim so 0
	
found_end:
	addiu	$t0 $t0 -2 #vi t0 da +1 ben tren nen o day se la t0+1-2=t0=1, kui lai mot bit de lay Endadresse

loop_write:
	bltu	$t0 $a0 finish
	
	lbu	$t1 ($t0)
	sb	$t1 ($a1) #a1 la noi luu reverese a0
	addiu	$t0 $t0 -1 #t0 nguoc
	addiu 	$a1 $a1 1 #a1 xuoi
	
	j	loop_write
	
finish:
	sb	$zero ($a1) #String mit 0 abschliessen
	
	li	$v0 10
	syscall