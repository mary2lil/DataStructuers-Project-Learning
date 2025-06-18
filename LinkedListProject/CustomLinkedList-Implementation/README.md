# 🚀 Custom Generic LinkedList in Java

A full implementation of a **singly linked list** in Java using **generics** to support any data type. This project was created to deepen my understanding of data structures and core Java concepts.

---

## 📚 Features

- `addFirst(T element)`
- `addLast(T element)`
- `addAt(int index, T element)`
- `removeFirst()`
- `removeLast()`
- `removeAt(int index)`
- `getFirst()`, `getLast()`
- `getIndex(int index)`
- `set(int index, T element)`
- `contains(T element)`
- `search(T element)`
- `reverse()`
- `toArray()`, `toArrayList()`
- `display()`
- Supports iteration using `for-each loop`

---

## 🧠 What I Learned

- Linked list node manipulation
- Working with generic types `<T>`
- Writing safe and reusable data structures
- Implementing `Iterable<T>` interface

---

## 🛠 Technologies

- Java 17+
- IDE: NetBeans / IntelliJ

---

## 📸 Demo

```java
NewLinkedList<String> list = new NewLinkedList<>();
list.addFirst("Java");
list.addLast("Python");
list.addAt(1, "C++");
list.display();  // Output: [Java , C++ , Python]
``` 

---

This project is part of my learning journey to master Java and Data Structures.
Feel free to explore, suggest improvements, or fork the repo 💛
