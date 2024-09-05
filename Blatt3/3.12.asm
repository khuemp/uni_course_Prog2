	move	$t0 $a0
	li	$t4 0
counting:
	lb	$t3 ($t0) #xet byte dau tien
	beqz	$t3 counted #t3 la so 0 sau so cuoi cung thi dem xong
	addiu	$t4 $t4 1 #t4=so ascii byte trong a0
	addiu	$t0 $t0 1 #chuyen sang byte tiep theo
	b	counting
counted:
	move	$t5 $a0 #xet xuoi a0
	addiu	$t4 $t4 -1 #setze Offset und Counter um 1 zuruck, lay Endadresse
	addiu	$t0 $t0 -1 #xet nguoc a0
loop:
	lb	$t1 ($t5)
	lb	$t2 ($t0) #so sanh dau voi cuoi a0
	
	bne	$t1 $t2 nopal
	addiu	$t5 $t5 1
	addiu	$t0 $t0 -1
	
	bge	$t5 $t0 end
	
	b 	loop
end:
	li	$v0 42
	jr	$ra
nopal:
	li	$v0 0
	jr	$ra