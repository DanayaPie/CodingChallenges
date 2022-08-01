s = "pineapple"


class Solution(object):
    def __init__(self, s):
        self.s = s

    def reverse_string(self, s):
        reverse = s[::-1]
        return reverse


res = Solution(s)
print(res.reverse_string(s))
