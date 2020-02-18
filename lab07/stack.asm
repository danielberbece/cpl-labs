	.data
str:
	.asciiz "done putting in stack\n"
str2:
	.asciiz "\n"
	.text
main:
	li $a1, 1
	li $a2, 21
loop:
	bge $a1, $a2, done_label

	subu $sp, $sp, 4
	sw $a1, 4($sp)

	addiu $a1, $a1, 1
	j loop
done_label:

	li $v0, 4
	la $a0, str
	syscall


	li $a1, 1
	li $a2, 21
loop2:
	bge $a1, $a2, exit_label

	li $v0, 1
	lw $a0, 4($sp)
	syscall

	li $v0, 4
	la $a0, str2
	syscall

	addiu $sp, $sp, 4
	addiu $a1, $a1, 1
	j loop2

exit_label:
	li $v0, 10
	syscall