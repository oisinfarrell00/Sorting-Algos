# Sorting Algorithms – Time & Space Complexity Cheat Sheet

This repository contains implementations of the most common sorting algorithms — written in Java for clarity and interview readiness.  
Below is a quick reference for **time complexity**, **space usage**, and **stability**, plus short **memory hooks** to help recall them under interview pressure.

---

## 🫧 Bubble Sort
**Idea:** Compare adjacent elements and swap if out of order, repeatedly “bubbling” the largest to the end.  
**Hook:** “Each bubble rises through the whole list — slowest swimmer in the pool.”  
- **Best:** O(n)  
- **Average:** O(n²)  
- **Worst:** O(n²)  
- **Space:** O(1)  
- **Stable:** ✅

---

## 🧩 Selection Sort
**Idea:** Repeatedly find the smallest element from the unsorted section and place it at the beginning.  
**Hook:** “Find the smallest each time — full scan every pass.”  
- **Best:** O(n²)  
- **Average:** O(n²)  
- **Worst:** O(n²)  
- **Space:** O(1)  
- **Stable:** ❌

---

## ✍️ Insertion Sort
**Idea:** Build the sorted portion of the array one element at a time by inserting new elements in the correct spot.  
**Hook:** “Build sorted wall one brick at a time — quick if already sorted.”  
- **Best:** O(n)  
- **Average:** O(n²)  
- **Worst:** O(n²)  
- **Space:** O(1)  
- **Stable:** ✅

---

## ⚡ Quick Sort
**Idea:** Pick a pivot, partition the array into elements smaller and larger than the pivot, then sort partitions recursively.  
**Hook:** “Divide fast, conquer smart — but pivot badly, and you crash.”  
- **Best:** O(n log n)  
- **Average:** O(n log n)  
- **Worst:** O(n²) *(unbalanced partitions)*  
- **Space:** O(log n) *(recursion stack)*  
- **Stable:** ❌

---

## 🪄 Merge Sort
**Idea:** Recursively split the array in half, sort both halves, and merge them back together.  
**Hook:** “Split, sort, merge — balanced and predictable.”  
- **Best:** O(n log n)  
- **Average:** O(n log n)  
- **Worst:** O(n log n)  
- **Space:** O(n)  
- **Stable:** ✅

---

## ⛰️ Heap Sort
**Idea:** Build a heap (priority tree) and repeatedly extract the max (or min) to sort.  
**Hook:** “Build a heap, pop the top — always balanced, never stable.”  
- **Best:** O(n log n)  
- **Average:** O(n log n)  
- **Worst:** O(n log n)  
- **Space:** O(1)  
- **Stable:** ❌

---

## 📚 Summary Table

| Algorithm       | Best     | Average   | Worst     | Space | Stable | Hook |
|-----------------|-----------|-----------|-----------|--------|---------|------|
| Bubble Sort     | O(n)      | O(n²)     | O(n²)     | O(1)   | ✅ | Slowest swimmer in the pool |
| Selection Sort  | O(n²)     | O(n²)     | O(n²)     | O(1)   | ❌ | Full scan every pass |
| Insertion Sort  | O(n)      | O(n²)     | O(n²)     | O(1)   | ✅ | Build sorted wall one brick at a time |
| Quick Sort      | O(n log n)| O(n log n)| O(n²)     | O(log n) | ❌ | Divide fast, conquer smart |
| Merge Sort      | O(n log n)| O(n log n)| O(n log n)| O(n)   | ✅ | Split, sort, merge |
| Heap Sort       | O(n log n)| O(n log n)| O(n log n)| O(1)   | ❌ | Build a heap, pop the top |

---

💡 **Tip:**  
If you blank under pressure — remember this pattern:  
- “Bubble, Selection, Insertion” → O(n²)  
- “Merge, Quick, Heap” → O(n log n)  
- Space grows only when recursion or merging happens.

---

### 🧠 About
This repo was built for interview preparation and deeper understanding of sorting fundamentals.  
Each algorithm includes:
- Java implementation  
- Step-by-step comments  
- Example input/output  

---

Happy sorting! ⚙️
