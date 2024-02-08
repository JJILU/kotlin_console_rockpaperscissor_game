package com.example.section_2_rockpaperscissorandkotlinbasics

/*
* [Q1] Int Data Type
* ------------------
* 1. For documentation visit: https://www.kotlinlang.org/docs/basic-types.html
*
* [Q2] Integer Types
* -----------------
* 1. kotlin provides a set of built-in types to represent numbers.
* 2. For integer numbers there are four types with different sizes
*    and hence,value ranges:
*
*[1] Type: Byte
*    Size (bits): 8
*    Min value: -128 -> 2 ToPower 8 /2
*    Max value: 127 -> (2 ToPower 8 /2)-1
*
*
*[1] Type: Short
*    Size (bits): 16
*    Min value: -32768  -> 2 ToPower 16 /2
*    Max value: 32767 -> (2 ToPower 16 /2)-1
*
*
*[1] Type: Int
*    Size (bits): 32
*    Min value: 2 ToPower 32 /2
*    Max value: (2 ToPower 32 /2) - 1
*
*
*
*[1] Type: 64
*    Size (bits): Long
*    Min value: 2 ToPower 64 /2
*    Max value: (2 ToPower 64 /2) - 1
*
*
* 3. Why are there different types of integer number?
*    Ans:
*    ----
*    The idea behind this is that if want to build a super performance
*    app you will use the number type that uses the least data storage.
*
*
* [Q3] var & val variable declaration
* -----------------------------------
* 1. kotlin uses two different keywords to declare variables: val and var.
* 2. Use val for a variable whose value never changes, you can't reassign a
*    value to a variable that was declared using val.
* 3. Use var for variable whose value can change.
*
*    Example: val and kotlin inferring
*    ----------------------------------
*    val one = 1 // Int
*    val threeBillion = 3000000000 // Long
*    val oneLong = 1L // Long // if you want to store Long later on
*    val oneByte: Byte = 1
*
* */