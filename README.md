# 📘 Week2AndWeek3 – Sorting & Searching Algorithms Project

## 📌 Overview

This project demonstrates the implementation of fundamental **Data Structures and Algorithms (DSA)** concepts using Java.
It focuses on real-world financial scenarios such as transaction auditing, risk analysis, and trade processing.

The project covers:

* Sorting Algorithms (Bubble, Insertion, Merge, Quick)
* Searching Algorithms (Linear, Binary)
* Stability in sorting
* Time & Space Complexity analysis

---

## 🏗️ Project Structure

```
Week2AndWeek3/
│
├── model/
│   ├── Transaction.java
│   ├── Client.java
│   ├── Trade.java
│   ├── Asset.java
│
├── problem1/   // Transaction Fee Sorting
├── problem2/   // Client Risk Ranking
├── problem3/   // Trade Volume Analysis
├── problem4/   // Portfolio Return Sorting
├── problem5/   // Account ID Search
├── problem6/   // Risk Threshold Search
│
└── main/
    └── Main.java
```

---

## 🚀 Problems Implemented

### 🔹 Problem 1: Transaction Fee Sorting

* Bubble Sort (ascending fee)
* Insertion Sort (fee + timestamp)
* Stable sorting maintained
* High-fee outlier detection (>50)

---

### 🔹 Problem 2: Client Risk Ranking

* Bubble Sort (ascending risk score)
* Insertion Sort (descending risk score)
* Top 10 high-risk clients identified

---

### 🔹 Problem 3: Trade Volume Analysis

* Merge Sort (stable, O(n log n))
* Quick Sort (in-place, average O(n log n))
* Merging sorted datasets
* Total volume calculation

---

### 🔹 Problem 4: Portfolio Return Sorting

* Merge Sort (ascending return rate)
* Quick Sort (descending return rate)
* Secondary sorting using volatility

---

### 🔹 Problem 5: Account ID Lookup

* Linear Search (first occurrence)
* Binary Search (efficient lookup)
* Duplicate count handling

---

### 🔹 Problem 6: Risk Threshold Search

* Linear Search on unsorted data
* Binary Search on sorted data
* Floor & Ceiling value detection

---

## ⚙️ Algorithms Used

| Algorithm      | Time Complexity | Space Complexity | Stable |
| -------------- | --------------- | ---------------- | ------ |
| Bubble Sort    | O(n²)           | O(1)             | Yes    |
| Insertion Sort | O(n²)           | O(1)             | Yes    |
| Merge Sort     | O(n log n)      | O(n)             | Yes    |
| Quick Sort     | O(n log n)*     | O(log n)         | No     |
| Linear Search  | O(n)            | O(1)             | —      |
| Binary Search  | O(log n)        | O(1)             | —      |

*Worst case for Quick Sort: O(n²)

---

## ▶️ How to Run

1. Clone the repository:

```
git clone https://github.com/your-username/Week2AndWeek3.git
```

2. Open in IDE (IntelliJ / Eclipse)

3. Run:

```
Main.java
```

---

## 📊 Sample Output

```
Bubble Sort: [id3:5.0, id1:10.5, id2:25.0]
Insertion Sort: [id3:5.0, id1:10.5, id2:25.0]
Outliers: None

Top Risks:
clientC:80
clientB:50
clientA:20

Merge Sort Trades: [100, 300, 500]
Quick Sort Desc: [500, 300, 100]
Total Volume: 900

Floor: 25, Ceiling: 50
```

---

## 🎯 Learning Outcomes

* Understanding of sorting and searching algorithms
* Practical application in real-world scenarios
* Writing optimized and structured Java code
* Comparing algorithm efficiency

---

## 👨‍💻 Author

* Your Name

---

## 📌 Notes

This project is part of Week 2 & Week 3 coursework focusing on algorithm implementation and analysis.
