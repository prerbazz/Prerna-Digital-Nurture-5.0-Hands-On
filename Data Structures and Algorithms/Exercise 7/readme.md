# Financial Forecasting

## 1. Explain the concept of recursion and how it can simplify certain problems.

Recursion is a technique where a method calls itself until a base condition is reached. It helps solve problems by breaking them into smaller versions of the same problem. It is commonly used in tree traversal, searching, mathematical calculations and divide-and-conquer algorithms.

## 2. Discuss the time complexity of your recursive algorithm.

The recursive method makes one recursive call for each year. Therefore the time complexity is O(n), where n is the number of years. The space complexity is also O(n) because each recursive call is stored in the call stack.

## 3. Explain how to optimize the recursive solution to avoid excessive computation.

The recursive solution can be optimized using memoization or dynamic programming to avoid repeated calculations. For this problem, an iterative solution can also be used, which removes recursion overhead and uses constant space.