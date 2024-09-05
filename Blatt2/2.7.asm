li $t0 5

li $t1 11

addu $t2 $t0 $t1

subu $t3 $t1 $t0

subu $t4 $t0 $t1

li $v0 1
move $a0 $t4
syscall

move $t2 $0
addu $t2 $zero $zero
addiu $t4 $zero 0
subu $t4 $t4 $t4
