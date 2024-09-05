.data
someWords:
.word 150, 18, 1, 12

.text
    la $a1 someWords	# $a1 enthaelt die Basisadresse einer Reihung von Wörtern
    addiu $a2 $a1 4	# $a2 enthaelt die Endadresse dieser Reihung
    
    li    $a0 0         # Initialisiere $a0 mit 0
    b     cmp           # Springe zum Test der Bedingung
loop:
    lb    $t0 0($a1)    # Lade die erste Zahl von Adresse $a1
    addu  $a0 $a0 $t0   # Addiere den geladenen Wert zu $a0
    addiu $a1 $a1 4     # Erhöhe Basisadresse um 4
cmp:
    bne $a1 $a2 loop    # springe zu loop wenn $a1 != $a2

    li $v0 1		# Lade Nummer des Systemaufrufs ”print int” in Reg $v0
    syscall
    li $v0 10	 	# Lade Nummer des Systemaufrufs ”exit” in Reg $v0
    syscall