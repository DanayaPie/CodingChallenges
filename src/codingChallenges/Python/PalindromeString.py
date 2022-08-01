s = "kayak"


class Solution(object):
    def __init__(self, s):
        self.s = s

    def palindrome(self, s):
        reverse = s[::-1]

        if (reverse == s):
            return True
        else:
            return False


res = Solution(s)
print(res.palindrome(s))
