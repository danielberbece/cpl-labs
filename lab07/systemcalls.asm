	.data
str:
	.asciiz "is_greater"
str2:
	.asciiz "is_lower"
	.text
main:
	#li $v0, 4 # system call code for print_str
	#la $a0, str # address of string to print
	#syscall # print the string
	#li $v0, 1 # system call code for print_int
	#li $a0, 5 # integer to print
	#syscall # print it

	li $a1, 3
	li $a2, 3
	bge $a1, $a2, if_label

	li $v0, 4
	la $a0, str2
	syscall

	li $v0, 10
	syscall
if_label:

	li $v0, 4
	la $a0, str
	syscall

	li $v0, 10
	syscall