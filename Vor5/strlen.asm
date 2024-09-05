	.text
	.globl strlen
	#$a0 Anfangsadresse der Zeichenkette
strlen:
	li 	$v0 0
loop: 
	lbu 	$t0 ($a0)
	beqz	$t0 end
	addiu 	$v0 $v0 1
	addiu	$a0 $a0 1
	b	loop
end:
	jr	$ra