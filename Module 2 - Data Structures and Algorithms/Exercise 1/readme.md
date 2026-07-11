# Inventory Management System

## 1. Why are data structures and algorithms essential in handling large inventories?

Data structures and algorithms help organize and manage inventory efficiently. In a warehouse, there may be thousands of products, so searching or updating them one by one would take a lot of time. Using suitable data structures makes operations like adding, updating, deleting, and searching products much faster. This improves the overall performance of the inventory management system.

## 2. Which data structure is suitable for this problem? Why?

A HashMap is suitable because every product has a unique product ID. The product ID can be used as the key, and the Product object can be stored as the value. This allows products to be accessed directly without searching through the entire collection. It is much faster than using an ArrayList when working with a large number of products.

## 3. Time complexity of each operation

**Add Product:** O(1) on average using `put()`.

**Update Product:** O(1) on average by accessing the product using its ID.

**Delete Product:** O(1) on average using `remove()`.

**Display Products:** O(n) because every product in the inventory has to be visited once.

## 4. How can these operations be optimized?

Using a HashMap already provides efficient performance for most inventory operations. If products need to be displayed in sorted order, a TreeMap can be used instead. If searching is based on product name or category instead of product ID, additional data structures or indexing techniques can be used to improve performance.