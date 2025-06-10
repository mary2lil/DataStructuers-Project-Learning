🔢 Balanced Expression Checker

This Java program checks whether a given expression has balanced parentheses , including:

- Round brackets: `()`
- Curly braces: `{}`
- Square brackets: `[]`

---

✅ Purpose

This is a classic application of the Stack data structure , where we use a stack to keep track of opening brackets and ensure they are correctly closed in the right order.

---

🧠 How it works

- Each time the program finds an opening bracket, it pushes it onto the stack.
- When it finds a closing bracket, it checks if the top of the stack is the corresponding opening bracket.
- If all brackets match correctly, and the stack is empty at the end, the expression is balanced.

---

 📦 Technologies Used

- Java
- Built-in "Stack" class from "java.util".
- "Scanner" for user input.

---

 📌 Example

Input:  ({[()]})
Output: true

Input:  ([{])
Output: false

---

🚀 How to Run
1.Compile the file.
2.Run the program.
3.Enter your expression when prompted.

---

This is a beginner-level learning project. Feel free to explore or suggest improvements!



