.text

fac:
    li $v0 1 		# Lade Konstante 1 nach $v0
    b check 		# Verzweige nach check

loop:
    mul $v0 $v0 $a0 	# Multipliziere $v0 mit $a0 und speichere das Ergebnis in $v0
    addiu $a0 $a0 -1	# Verringere $a0 um 1
    check:
    bgez $a0 loop 	# Verzweige nach loop, wenn $a0 > 0
    jr $ra 		# Kehre zum Aufrufer zurueck
