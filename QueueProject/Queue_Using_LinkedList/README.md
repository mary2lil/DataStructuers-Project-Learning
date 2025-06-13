# 😎 Queue Implementation using Linked List in Java

This project demonstrates a generic implementation of a **Queue** data structure using **Linked List** in Java. The class `NewQueue<T>` provides fundamental operations of a queue with additional helpful methods.

---

## 🚀 Features

- ✅ `enqueue(T element)` – Add element to the rear
- ✅ `dequeue()` – Remove element from the front
- ✅ `peek()` – View the front element
- ✅ `getRear()` – View the rear element
- ✅ `isEmpty()` – Check if queue is empty
- ✅ `size()` – Return number of elements
- ✅ `clear()` – Clear the queue
- ✅ `contains(T element)` – Check if element exists
- ✅ `indexOf(T element)` – Return index of an element
- ✅ `toArrayList()` – Convert the queue to `ArrayList`
- ✅ `reverse()` – Reverse the order of elements
- ✅ `clone()` – Return a clone of the current queue
- ✅ `replace()` - replace element

---

## 📦 Usage Example

NewQueue<String> queue = new NewQueue<>();
queue.enqueue("Apple");
queue.enqueue("Banana");
queue.enqueue("Cherry");

System.out.println(queue.peek());     // Output: Apple
System.out.println(queue.getRear()); // Output: Cherry

queue.reverse();
queue.display(); // Output: [Cherry, Banana, Apple]

---

🛠 Technologies Used
Language: Java

Concepts: Linked List, Generics, Stack, Custom Classes

---

📚 Learning Goal
This project was built as part of my journey to understand Data Structures in Java, especially the Queue and Linked List concepts.


---

📌 Notes
This is a custom educational implementation.

Not intended for production use.

---

This project is part of my learning journey to master Java and Data Structures.
Feel free to explore, suggest improvements, or fork the repo 💛

