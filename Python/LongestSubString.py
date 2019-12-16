class Solution:
  def lengthOfLongestSubstring(self, s):
    # create dictionary of letters and their latest index
    letters = {}
    # create a tail pointer, it updates whenever we meet a duplicate character
    tail = -1
    # create a head pointer, this one just iterates through every letter
    head = 0
    # result variable, updates whenever it's higher than result
    result = 0
    
    while head < len(s):
      if s[head] in letters:
          tail = max(tail, letters[s[head]])
      letters[s[head]] = head
      result = max(result, head-tail)
      head += 1
    return result

print Solution().lengthOfLongestSubstring('abrkaabcdefghijjxxx')