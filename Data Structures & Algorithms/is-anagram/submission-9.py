class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        count = {}

        for ch in s:
            count[ch] = count.get(ch, 0) + 1

        for ch in t:
            if ch in count:
                count[ch] -= 1
            else:
                return False

        for char, val in count.items():
            if val != 0:
                return False
        
        return True
