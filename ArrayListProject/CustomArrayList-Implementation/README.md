# 😎 MyArrayList-Java

## ✅ Description

This project is a custom implementation of a dynamic ArrayList in Java using Generics.  
It replicates the basic functionalities of Java's built-in `ArrayList` class, including:

- Adding elements (at end or at a specific index)
- Removing elements (by index or last element)
- Searching and retrieving elements
- Resizing the array when full
- Clearing all elements
- Checking size, capacity, and emptiness

---

## 🧪 Sample Usage

```java
NewArrayList<String> list = new NewArrayList<>();

list.addElement("Java");
list.addElement("Python");
list.addElement("C++");
list.display();  
// Output: [Java , Python , C++]

list.addElement(1, "JavaScript");
list.display();  
// Output: [Java , JavaScript , Python , C++]

list.remove(); // Removes last
list.display();  
// Output: [Java , JavaScript , Python]

System.out.println(list.search("Python"));  // Output: 2
System.out.println(list.contains("Go"));    // Output: false

```ظ
---/

💡 Notes
This class dynamically resizes the array when it's full.

It supports generic types, so you can use it with any object type.

Created as a learning project to understand data structures and Java OOP.

---

This project is part of my learning journey to master Java and Data Structures.
Feel free to explore, suggest improvements, or fork the repo 💛


