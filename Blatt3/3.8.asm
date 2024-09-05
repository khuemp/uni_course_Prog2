#Overflow khi 2 so co cung dau nhung tong khac dau (chi quan tam den bit dau tien)
	.data
input: 0x80000000, 0xffffffff

	.text
#Lade Testwerte
	la	$a1 input
	lw	$a0 0($a1)
	lw	$a1 4($a1)
#cong 2 so
	addu 	$t1 $a0 $a1
#Kiem tra 1: 2 so cung dau
	xor	$t0 $a0 $a1 #unterschiedliche Bits finden
	nor	$t0 $zero $t0 #gleiche Bits zwischen $a0 und $a1 finden
#Kiem tra 2: tong khac dau voi 2 so
	xor	$t1 $t1 $a0 #unterschiedliche Bits zwischen $a0 und $t1 finden
#Ket hop 2 dieu kien tren
	and	$t0 $t0 $t1 #tim bit vua giong giua $a0 va $a1, vua khac giua $a0, $a1 va $t1
#Neu giong nhau o bit dau tien (<0) thi overflow	
	bltz	$t0 overflow
	
	li	$a0 'n'
	b	end
	
overflow:
	li	$a0 'o'
	
end:
	li 	$v0 11
	syscall
	li	$v0 10
	syscall
