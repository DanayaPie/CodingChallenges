arr = [0, 56, -3, 11]


class Solution(object):
    def __init__(self, arr):
        self.arr = arr

    def largestInt(self, arr):

        largest = arr[0]

        for i in range(0, len(arr)):
            if (arr[i] > largest):
                largest = arr[i]

        return largest


res = Solution(arr)
print(res.largestInt(arr))
