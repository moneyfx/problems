// https://leetcode.com/problems/single-number
func singleNumber(nums []int) int {
    var r int

    for _, v := range nums {
        r = r ^ v
    }

    return r 
}
