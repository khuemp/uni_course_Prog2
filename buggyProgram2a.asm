.text
.globl main

main:
    li $a0 5 	 # Lade 5 in Register $a0, um 5! zu berechnen
    jal fac 	 # Rufe Unterprogramm fac
    move $a0 $v0 # Ergebnis ist in Reg $v0 -> verschiebe nach $a0
    li $v0 1 	 # Lade Nummer des Systemaufrufs ”print_int” in Reg $v0
    syscall 	 # Rufe das Betriebssystem
    li $v0 10	 # Lade Nummer des Systemaufrufs ”exit” in Reg $v0
    syscall	 # Dieser Systemaufruf beendet das Programm
