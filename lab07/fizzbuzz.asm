	.data
fizz:
	.asciiz "Fizz\n"
buzz:
	.asciiz "Buzz\n"
fizzbuzz:
	.asciiz "Fizzbuzz\n"
newline:
	.asciiz "\n"

	.text
main:
	li $a1, 0
	li $a2, 101
loop:
	bge $a1, $a2, exit_label

	li $v0, 0
	li $a3, 15
	remu $t0, $a1, $a3
	beq $t0, $v0, fizzbuzz_label

	li $a3, 3
	remu $t0, $a1, $a3
	beq $t0, $v0, fizz_label

	li $a3, 5
	remu $t0, $a1, $a3
	beq $t0, $v0, buzz_label

	j normal_label

fizzbuzz_label:
	li $v0, 4
	la $a0, fizzbuzz
	syscall
	j done_label

fizz_label:

	li $v0, 4
	la $a0, fizz
	syscall
	j done_label

buzz_label:

	li $v0, 4
	la $a0, buzz
	syscall
	j done_label

normal_label:
	li $v0, 1
	move $a0, $a1
	syscall

	li $v0, 4
	la $a0, newline
	syscall
	
	j done_label

done_label:
	addiu $a1, $a1, 1
	j loop

exit_label:
	li $v0, 10
	syscall