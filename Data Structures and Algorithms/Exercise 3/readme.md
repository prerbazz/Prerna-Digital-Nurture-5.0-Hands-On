# Sorting Customer Orders

## 1. Explain different sorting algorithms.

**Bubble Sort:** Bubble Sort repeatedly compares two adjacent elements and swaps them if they are in the wrong order. It is simple to implement but becomes slow for large datasets.

**Insertion Sort:** Insertion Sort builds the sorted list one element at a time by inserting each element into its correct position. It performs well for small or nearly sorted datasets.

**Quick Sort:** Quick Sort selects a pivot element and partitions the array into smaller and larger elements. It then recursively sorts the partitions. It is one of the fastest sorting algorithms for large datasets.

**Merge Sort:** Merge Sort divides the array into smaller halves, sorts each half, and then merges them back together. It provides consistent performance but requires additional memory.

## 2. Compare the performance of Bubble Sort and Quick Sort.

Bubble Sort:
- Best Case: O(n)
- Average Case: O(n²)
- Worst Case: O(n²)

Quick Sort:
- Best Case: O(n log n)
- Average Case: O(n log n)
- Worst Case: O(n²)

## 3. Why is Quick Sort generally preferred over Bubble Sort?

Quick Sort performs much faster than Bubble Sort for large datasets because it divides the problem into smaller parts instead of repeatedly comparing adjacent elements. Although its worst-case complexity is O(n²), it performs close to O(n log n) in most practical situations, making it suitable for real-world applications.