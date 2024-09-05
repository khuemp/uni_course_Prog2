	.text
	.globl fic_rec
	
fib_rec:
	li	$v0 1
	ble	$a0 2 end #if n<=2 we end the recursion and return 1
	
recurse:
	addiu	$sp $sp -8 #we need some space in the stack
	sw	$ra 4($sp) #we store the address where we need to jump back
	sw 	$a0 ($sp) #we store n because for the second call we need to caculate n=2
	subiu	$a0 $a0 1 #we call fib(n-1)
	
	jal	fib_rec
	
	lw	$a0 ($sp) #we load n which we stored before
	sw	$v0 ($sp) #and store fib(n-1)+fib(n-2) in $v0
	subiu	$a0 $a0 2 #we load the address so we can jump back
	
	jal	fib_rec
	
	lw	$t0 ($sp) #we load fib(n-1)
	addu	$v0 $v0 $t0 #and store fib(n-1)+fib(n-2) in $v0
	lw	$ra 4($s0) #we load the address so we can jump back
	addiu	$sp $sp 8 #we reset $sp to default
	
	b	end
	
end:
	jr	$ra