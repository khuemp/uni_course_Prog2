#negiere Eingabe
	li	$t0 0x00FFFFFF #1 so = 4 bits, 2 so = 1 mau
	sub	$a0 $t0 $a0
#kopiere negiertes Eingabeargument in $a1
	move	$a1 $a0
#shifte rotwert
	srl	$a0 $a0 16
#Ausgabe
	li 	$v0 1
	syscall
#kopiere negierte Argument zuruck in $a0
	move	$a0 $a1
#schiebe grunwert nach hinten
	sll	$a0 $a0 16
	srl	$a0 $a0 24
#Ausgabe
	syscall
#kopiere negierte Argument zuruck in $a0
	move	$a0 $a1
#schiebe blauwert nach hinten	
	sll	$a0 $a0 24
	srl	$a0 $a0 24
#Ausgabe
	syscall