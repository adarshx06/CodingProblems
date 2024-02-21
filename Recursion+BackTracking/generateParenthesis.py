#leetcode 22

class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        stack=[]
        res = []

        def backtrack(opencount, closecount):
            if opencount == closecount == n:
                res.append("".join(stack))
                return
            
            if opencount < n:
                stack.append("(")
                backtrack(opencount+1, closecount)
                stack.pop()
            
            if closecount < opencount:
                stack.append(")")
                backtrack(opencount, closecount+1)
                stack.pop()

        backtrack(0,0)
        return res


        
