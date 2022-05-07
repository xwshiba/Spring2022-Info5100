def isValid(s):
    if not s:
        return
    closeToOpen = {')' : '(', '}': '{', ']': '['}
    stack = []
    for char in s:
        if char not in closeToOpen:
            stack.append(char)
        else:
            if closeToOpen[char] != stack[-1]:
                return False
            elif closeToOpen[char] == stack[-1]:
                stack.pop()
    if stack:
        return False
    return True

s = "()[]{}"
print(isValid(s)) # true
s = "(]"
print(isValid(s)) # false
s = "[{()}]"
print(isValid(s)) # true
s = "(())[[]]{"
print(isValid(s)) # false

def compressString(s):
    i, j = 0, 0
    N = len(s)

    res = []

    while i < N:
        j = i
        while (j < N and s[i] == s[j]):
            j += 1

        res.append(s[i])

        count = str(j - i)
        for char in count:
            res.append(char)

        i = j
    if len(res) > len(s):
        return s
    return ''.join(res)

s = "ab"
print(compressString(s)) # "ab"
s = "aabcccccaaa"
print(compressString(s)) # "a2b1c5a3"

def lengthOfLongestSubstring(s):
    charSet = set()
    i, j = 0, 0
    res = 0
    for i in range(len(s)):
        while j < len(s) and s[j] not in charSet:
            charSet.add(s[j])
            j += 1
        charSet.remove(s[i])
        res = max(res, j - i)
    return res

s = "bbbbb"
print(lengthOfLongestSubstring(s)) # 1
s = "pwwkew"
print(lengthOfLongestSubstring(s)) # 3
s = "abcbbabcb"
print(lengthOfLongestSubstring(s)) # 3
s = "abcbbabcdbabcde"
print(lengthOfLongestSubstring(s)) # 5

def sumZero(n):
    res = []
    if n % 2 == 1:
        res.append(0)
        n -= 1

    for i in range(0, n, 2):
        res.append(i + 1)
        res.append(- i - 1)

    return res

print(sumZero(1))
print(sumZero(3))
print(sumZero(5))
print(sumZero(4))
print(sumZero(9))

def findKthLargest(nums, k):
    import heapq
    pq = []

    for n in nums:
        heapq.heappush(pq, n)

        if len(pq) > k:
            heapq.heappop(pq)

    res = heapq.heappop(pq)
    return res

nums = [3,2,1,5,6,4]
k = 2
print(findKthLargest(nums, k)) # 5
nums = [3,2,3,1,2,4,5,5,6]
k = 4
print(findKthLargest(nums, k)) # 4
nums = [3,2,3,1,2,4,5,5,6,7,8,9,10]
k = 6
print(findKthLargest(nums, k)) # 5
nums = [3,2,3,1,2,4,5,5,6,7,8,9,10]
k = 2
print(findKthLargest(nums, k)) # 9




