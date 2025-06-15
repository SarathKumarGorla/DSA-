class Solution:
    def longestPalindrome(self, s: str) -> str:
        l = 0
        ans = ""
        for i in range(len(s)):
            temp = ""
            for j in range(i, len(s)):
                temp += s[j]  # build substring from i to j
                if temp == temp[::-1] and len(temp) > l:
                    l = len(temp)
                    ans = temp
        return ans