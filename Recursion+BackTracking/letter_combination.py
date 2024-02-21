#leetcode 17
# tc: O(3^n x 4^m) -> n is the number of digits 3 letters / m is the number of digits with 4 letters
#sc = o(n) 
class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        if len(digits)==0:
            return []
        
        letters = {
            "2": "abc",
            "3": "def",
            "4": "ghi",
            "5": "jkl",
            "6": "mno",
            "7": "pqrs",
            "8": "tuv",
            "9": "wxyz",
        }

        def backtrack(index, path):
            if len(path) == len(digits):
                combinations.append("".join(path))
                return

            possible_letter = letters[digits[index]]
            for letter in possible_letter:
                path.append(letter)
                backtrack(index+1, path)
                path.pop()

        combinations = []
        backtrack(0,[])
        return combinations
