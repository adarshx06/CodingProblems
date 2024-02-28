#Splitting a String Into Descending Consecutive Values

class Solution:
    def splitString(self, s: str) -> bool:
        n=len(s)

        def go(i,prev):
            if(i==n):
                return True
            
            valid = False
            for index in range(i+1, n+1):
                if int(s[i:index]) == prev -1:
                    valid = go(index,prev-1)
                if valid:
                    return True
            return valid
        
        for i in range(1,n):
            if go(i, int(s[:i])):
                return True

        return False
