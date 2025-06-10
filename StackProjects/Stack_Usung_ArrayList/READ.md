📂 Stack Using ArrayList
 custom implementation of the Stack data structure using Java's ArrayList.

---

📌 Purpose
This implementation is created for learning purposes, to understand how stack operations (push, pop, peek, etc.) work internally without relying on Java's built-in Stack class.

Although ArrayList is not the most optimal choice for implementing stacks due to shifting elements during removals (especially if not using the end of the list), this version uses the end of the list to simulate a stack, making it suitable for educational use.

---

⚙️ Features
Generic type support (<T>)

Basic stack operations:

push(T item)

pop()

peek()

isEmpty()

size()

clear()

display()

---

🧠 What I Learned
1.How stacks work behind the scenes

2.Managing the top pointer manually

3.How ArrayList behaves when used as a stack

4.The difference between built-in stack and custom-built one

5.Importance of choosing the right data structure for performance

---

📝 Note
This implementation is not intended for production use, but as a way to deepen understanding of how stacks work internally.

