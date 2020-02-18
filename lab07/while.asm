	.data
str:
	.asciiz "exiting"
str2:
	.asciiz "\n"
	.text
main:
	#li $v0, 4 # system call code for print_str
	#la $a0, str # address of string to print
	#syscall # print the string
	#li $v0, 1 # system call code for print_int
	#li $a0, 5 # integer to print
	#syscall # print it

	li $a1, 1
	li $a2, 21
loop:
	bge $a1, $a2, exit_label

	li $v0, 1
	move $a0, $a1 
	syscall

	li $v0, 4
	la $a0, str2
	syscall

	addiu $a1, $a1, 1
	j loop
exit_label:

	li $v0, 4
	la $a0, str
	syscall

	li $v0, 10
	syscall