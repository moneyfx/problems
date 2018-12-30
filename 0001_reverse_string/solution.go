package main

import (
	"fmt"
)

func main() {
	fmt.Println(reverseString("Hello"))
}

func reverseString(s string) string {
	chars := []int32(s)

	i := 0
	j := len(chars) - 1

	for i < j {
		chars[i], chars[j] = chars[j], chars[i]
		i++
		j--
	}

	return string(chars)
}

