class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        d = {}
        ans = 0
        start = 0  # left boundary of current window

        for i in range(len(s)):
            if s[i] in d and d[s[i]] >= start:
                start = d[s[i]] + 1  # move start past the last occurrence

            d[s[i]] = i  # update last seen index of s[i]
            ans = max(ans, i - start + 1)

        return ans