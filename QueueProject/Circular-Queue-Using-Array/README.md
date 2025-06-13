# 😎 NewQueue Data Structure in Java

This project implements a custom **circular queue** (FIFO) using a generic array in Java.  
It supports standard queue operations along with some extended features.

---

## 📌 Features

- `enqueue(T element)` – Add element to the queue.
- `dequeue()` – Remove the front element.
- `peek()` – View the front element without removing.
- `getRear()` – View the last (rear) element.
- `isEmpty()` – Check if the queue is empty.
- `isFull()` – Check if the queue is full.
- `getSize()` – Number of elements currently in the queue.
- `capacity()` – Maximum number of elements the queue can hold.
- `clear()` – Reset the queue to empty state.
- `contains(T element)` – Check if an element exists in the queue.
- `indexOf(T element)` – Find the index of an element (0-based from front).
- `replace(oldElement, newElement)` – Replace all occurrences of an element.
- `toArray()` – Copy the queue into a regular array.
- `toArrayList()` – Copy the queue into an ArrayList.
- `reverse()` – Reverse the elements in the queue.
- `display()` – Print all elements in a clean format.
- `iterator()` – Return an iterator over the queue.

---
🛠️ Technologies Used
1.Java
2.Object-Oriented Programming (OOP)
3.Generics
4.Collections (ArrayList, Stack)
4.Iterators

---


## 🧪 Sample Usage

```java
NewQueue<String> queue = new NewQueue<>(5);

queue.enqueue("Maryam");
queue.enqueue("Lenn");
queue.enqueue("Sara");

queue.display();  // Output: [Maryam, Leen, Sara]

System.out.println(queue.peek());     // Maryam
System.out.println(queue.getRear());  // Sara

---

📝 Notes
This project is part of my learning journey to master Java and Data Structures.
Feel free to explore, suggest improvements, or fork the repo 💛



