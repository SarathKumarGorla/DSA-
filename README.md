# 🧠 Daily DSA Practice Log

This repository contains my daily submissions of Data Structures and Algorithms (DSA) problems from platforms like **LeetCode** and **GeeksforGeeks** (GFG). It's a personal effort to improve problem-solving skills, prepare for technical interviews, and build consistency in practicing algorithms and data structures.

---

## 📅 Daily Tracker

Each folder is organized by date and contains the problems solved that day. Each problem includes:

- ✅ Problem link
- 🧠 Approach or explanation
- 💻 Solution code

Example structure:
📁 2025-06-14/
├── leetcode_200_number_of_islands.md
├── gfg_detect_cycle_in_directed_graph.py
└── README.md

yaml
Copy
Edit

---

## 🧰 Topics Covered

- Graphs (BFS, DFS, Cycle Detection, Union Find)
- Arrays and Strings
- Sliding Window
- Dynamic Programming
- Trees and Binary Trees
- Greedy Algorithms
- Hashing
- Stacks & Queues
- Recursion & Backtracking

---

## 📚 Platforms

- 🔵 [LeetCode](https://leetcode.com/)
- 🟢 [GeeksforGeeks](https://www.geeksforgeeks.org/)

---

## 🧩 Example Entry

```markdown
### 🔗 [LeetCode 200. Number of Islands](https://leetcode.com/problems/number-of-islands/)

**Category:** Graph, BFS, DFS  
**Approach:**  
- Traverse the grid using DFS when a '1' is encountered.
- Mark visited cells to avoid revisiting.
- Count how many times a DFS is initiated — that's the number of islands.

**Code:**
```python
def numIslands(grid):
    def dfs(i, j):
        if i < 0 or i >= len(grid) or j < 0 or j >= len(grid[0]) or grid[i][j] != '1':
            return
        grid[i][j] = '0'
        dfs(i+1, j)
        dfs(i-1, j)
        dfs(i, j+1)
        dfs(i, j-1)
    
    count = 0
    for i in range(len(grid)):
        for j in range(len(grid[0])):
            if grid[i][j] == '1':
                dfs(i, j)
                count += 1
    return count
🗂️ Folder Structure
yaml
Copy
Edit
📦 daily-dsa
 ┣ 📂 2025-06-14
 ┃ ┣ 📜 leetcode_994_rotting_oranges.py
 ┃ ┣ 📜 gfg_detect_cycle_directed.py
 ┃ ┗ 📜 README.md
 ┣ 📂 2025-06-13
 ┃ ┗ 📜 ...
 ┣ 📜 README.md
🧭 Goals
💡 Strengthen algorithmic thinking

🧠 Master DSA concepts

🔍 Prepare for top tech interviews

📈 Maintain daily consistency

🤝 Contributing
This is a personal repository. If you wish to collaborate or suggest improvements, feel free to raise an issue or PR!

📌 Note
This repo is meant for educational and revision purposes. All solutions are written after personal understanding and solving the problem independently.

Gorla Sarath Kumar
6304486971
sarathkumargorla@gmail.com
https://www.linkedin.com/in/gorlasarathkumar/ 
