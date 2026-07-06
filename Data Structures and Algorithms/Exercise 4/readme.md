# Employee Management System

## 1. Explain how arrays are represented in memory and their advantages.

Arrays store elements in contiguous memory locations. Each element is stored one after another, allowing direct access using its index. Since memory is allocated continuously, accessing any element takes constant time.

Advantages of arrays:
- Fast access using index.
- Simple to implement.
- Requires less memory overhead.
- Suitable when the number of elements is fixed.

## 2. Analyze the time complexity of each operation.

Add Employee: O(1)

Search Employee: O(n)

Traverse Employees: O(n)

Delete Employee: O(n)

## 3. What are the limitations of arrays? When should they be used?

Arrays have a fixed size, so they cannot grow or shrink after creation. Deleting or inserting elements requires shifting other elements, which takes extra time. Arrays are suitable when the number of records is known in advance and frequent insertions or deletions are not required.