😎 Infix to Postfix Converter (Java)

This simple Java project converts a mathematical expression from infix notation (e.g. A + B * C) to postfix notation (also known as Reverse Polish Notation, e.g. ABC*+).

---

 📌 What is Infix and Postfix?

- Infix: The common way we write expressions, e.g., A + B .
- Postfix: Operators come *after* the operands, e.g., AB+ .

Postfix notation is used in compilers and interpreters to evaluate expressions efficiently using stacks.

---

 📦 Features

- Supports:
  - Operands (letters or digits)
  - Operators: + , - , * , / .
  - Parentheses: () .

- Handles operator precedence:
  - *  , /  have higher precedence than + , - .
- Ignores white spaces
- Prints postfix result to console

---

🧪 Example

Input: (A + B) * (C - D)
Output : A B + C D - * 

---

 🚀 How to Run

1. Open your Java IDE or terminal.
2. Compile the file.
3. Run the program.
4. Enter any valid infix expression (e.g., A+(B*C) ).
5. See the result in postfix.

---
📚 Topics Covered

- Stack data structure
- Expression parsing
- Operator precedence
- Parentheses handling

---
This version assumes single-character operands and does not support multi-digit numbers or error handling for invalid expressions yet.


This is a beginner-level learning project. Feel free to explore or suggest improvements!



