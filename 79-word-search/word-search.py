class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        r, c = len(board), len(board[0])
    
        def dfs(i, j, idx):
            if idx == len(word):
                return True
            if i < 0 or i >= r or j < 0 or j >= c or board[i][j] != word[idx]:
                return False

            temp = board[i][j]
            board[i][j] = "#"  # mark as visited

        # Try all four directions
            found = (dfs(i+1, j, idx+1) or
                 dfs(i-1, j, idx+1) or
                 dfs(i, j+1, idx+1) or
                 dfs(i, j-1, idx+1))

            board[i][j] = temp  # unmark
            return found

        for i in range(r):
            for j in range(c):
                if board[i][j] == word[0] and dfs(i, j, 0):
                    return True

        return False
            
