	.text
	
	# Ziffer ist in $a0
	# 0 -> 48
	# ...
	# 9 -> 57
	# 10(a) -> 97
	# ...
	# 15(f) -> 102
	# tim vi tri cua so trong ASCII, dap an duoc bieu dien bang hexadezimal
	# voi t2 la mot day 32 bits
	
	li 	$t1 28
	move 	$t2 $a0
hex_digit:
	srlv	$a0 $t2 $t1
	andi 	$a0 $a0 15
	sltiu 	$t0 $a0 10
	bnez 	$t0 less_than_10
	addiu	$a0 $a0 39
less_than_10:
	addiu 	$a0 $a0 48
	li 	$v0 1
	syscall
	
	addiu 	$t1 $t1 -4
	bgez	$t1 hex_digit
	
	li	$v0 10
	syscall