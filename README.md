# PalindromeCheckerApp
//I USED JAVA PROGRAMMING LANGUAGE TO WRITE THIS CODE - UC2
//This program verifies if a given string is a palindrome. A palindrome is a sequence that reads the same backward as forward (e.g., "madam", "radar", "12321") 
//Input Transformation: The string is converted to lowercase using `.toLowerCase()`. This makes the check case-insensitive (e.g., "Madam" becomes "madam")
//Reversal: A `for` loop iterates through the original string from the last character to the first. It builds a reversed string
//Comparison: The code compares the lowercase original string with the reversed string using `.equals()`
//Output: If they match, the string is a palindrome; otherwise, it is not
//Input: `MADAM`
//Output: `MADAM is a palindrome.`