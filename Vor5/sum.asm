	.text
	.globl sum
	# Summiere Elemente einer Reihung von Wörter
	# $a0 Anfangsadresse
	# $a1 Endadresse (eins hinter dem letzten Element)
sum:
	li	$v0 0
	b 	check
L:
	lw 	$t0 ($a0) #lb
	addu 	$v0 $v0 $t0
	addiu 	$a0 $a0 4 #1
check:
	bne 	$a0 $a1 L
	jr	$ra
