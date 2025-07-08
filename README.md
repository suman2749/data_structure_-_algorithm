# Data_Structure_-_Algorithm

☕ Data Structures and Algorithms Practice Repository - Java
Welcome to my personal DSA practice repository implemented in Java! This repository contains my solutions to various data structures and algorithms problems from different platforms and sources.
📚 Repository Structure

DSA-Java-Practice/
├── src/
│   ├── arrays/
│   │   ├── easy/
│   │   ├── medium/
│   │   └── hard/
│   ├── linkedlists/
│   │   ├── singly/
│   │   ├── doubly/
│   │   └── circular/
│   ├── stacksandqueues/
│   │   ├── stack/
│   │   ├── queue/
│   │   └── priorityqueue/
│   ├── trees/
│   │   ├── binarytrees/
│   │   ├── bst/
│   │   ├── avltrees/
│   │   └── heap/
│   ├── graphs/
│   │   ├── traversal/
│   │   ├── shortestpath/
│   │   └── mst/
│   ├── dynamicprogramming/
│   │   ├── onedimensional/
│   │   ├── twodimensional/
│   │   └── advanced/
│   ├── sorting/
│   ├── searching/
│   ├── strings/
│   ├── math/
│   ├── bitmanipulation/
│   ├── greedy/
│   ├── backtracking/
│   ├── divideandconquer/
│   └── competitiveprogramming/
│       ├── leetcode/
│       ├── hackerrank/
│       ├── codechef/
│       └── codeforces/
├── test/
│   └── (JUnit test files)
├── lib/
│   └── (External libraries if needed)
├── docs/
│   └── (Algorithm explanations and notes)
├── .gitignore
├── README.md
└── pom.xml (if using Maven)

🎯 Goals

Master fundamental data structures and algorithms using Java
Improve problem-solving skills and Java proficiency
Practice coding for technical interviews
Build a comprehensive reference for future use
Leverage Java's Collections Framework effectively
Understand Java-specific optimizations and best practices

⚙️ Development Setup
Prerequisites

Java JDK: 11 or higher
IDE: IntelliJ IDEA, Eclipse, or VS Code
Build Tool: Maven or Gradle (optional)
Testing Framework: JUnit 5

Java Version
bashjava --version
# Recommended: Java 11+ for modern features
Project Structure Convention
Following standard Java package naming conventions:

Package names: lowercase, no underscores
Class names: PascalCase
Method names: camelCase
Constants: UPPER_SNAKE_CASE

📊 Progress Tracking
Data Structures

 Arrays and ArrayLists
 Linked Lists (Custom Implementation)
 Stacks and Queues (Stack, LinkedList, ArrayDeque)
 Trees and Binary Search Trees
 Heaps (PriorityQueue)
 Hash Tables (HashMap, LinkedHashMap, TreeMap)
 Graphs (Adjacency List/Matrix)
 Tries

Algorithms

 Sorting Algorithms (Arrays.sort(), Collections.sort(), Custom)
 Searching Algorithms (Binary Search, Linear Search)
 Dynamic Programming
 Greedy Algorithms
 Backtracking
 Divide and Conquer
 Graph Algorithms (DFS, BFS, Dijkstra, etc.)
 String Algorithms (KMP, Rabin-Karp)

Java Collections Mastery

 ArrayList vs LinkedList performance
 HashMap vs TreeMap vs LinkedHashMap
 HashSet vs TreeSet vs LinkedHashSet
 Stack vs ArrayDeque
 PriorityQueue (Min/Max Heap)
 Comparator and Comparable interfaces

📝 File Naming Convention
Each solution file follows Java naming conventions:
ProblemNameSolution.java
Package structure:
com.dsa.platform.difficulty.ProblemNameSolution
Example:

TwoSumSolution.java in package com.dsa.leetcode.easy
BinaryTreeInorderSolution.java in package com.dsa.practice.medium

🔍 Solution Format
Each solution file contains:
javapackage com.dsa.leetcode.easy;

import java.util.*;

/**
 * Problem: Two Sum
 * Platform: LeetCode
 * Difficulty: Easy
 * URL: https://leetcode.com/problems/two-sum/
 * 
 * Problem Statement:
 * Given an array of integers nums and an integer target, 
 * return indices of the two numbers such that they add up to target.
 * 
 * Approach:
 * Use HashMap to store complement of each element and check if current element exists in map.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * 
 * @author Your Name
 * @date 2025-01-XX
 */
public class TwoSumSolution {
    
    /**
     * Finds two numbers in array that add up to target
     * @param nums array of integers
     * @param target target sum
     * @return indices of two numbers that add up to target
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        
        return new int[]{};
    }
    
    /**
     * Test cases for the solution
     */
    public static void main(String[] args) {
        TwoSumSolution solution = new TwoSumSolution();
        
        // Test case 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Test 1: " + Arrays.toString(result1)); // Expected: [0, 1]
        
        // Test case 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Test 2: " + Arrays.toString(result2)); // Expected: [1, 2]
    }
}
🛠️ Java-Specific Features Used
Collections Framework

ArrayList: Dynamic arrays
LinkedList: Doubly-linked list implementation
HashMap: Hash table for key-value pairs
TreeMap: Red-black tree implementation
PriorityQueue: Min/Max heap implementation
ArrayDeque: Double-ended queue

Modern Java Features

Lambda Expressions: For sorting and filtering
Streams API: For functional programming
Optional: For null safety
Generics: For type safety
Annotations: For documentation and testing

Example using Java 8+ features:
java// Using Streams and Lambda
List<Integer> evenNumbers = Arrays.stream(nums)
    .filter(n -> n % 2 == 0)
    .collect(Collectors.toList());

// Custom comparator using Lambda
Collections.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

// Using Optional
Optional<Integer> max = Arrays.stream(nums).max(Integer::compare);
📚 Learning Resources
Java-Specific Books

"Effective Java" by Joshua Bloch
"Java: The Complete Reference" by Herbert Schildt
"Java Concurrency in Practice" by Brian Goetz

Online Platforms

LeetCode - Filter by Java solutions
HackerRank - Java domain
Codeforces - Java submissions
GeeksforGeeks - Java implementations

Java Documentation

Oracle Java Documentation
Java Collections Framework
Java 8 Stream API

🏆 Milestones

 Set up Java project structure
 Configure development environment
 Complete first 50 LeetCode problems in Java
 Master Java Collections Framework
 Implement all fundamental data structures from scratch
 Solve 100 medium difficulty problems
 Participate in weekly contests
 Implement all major sorting algorithms
 Complete dynamic programming section
 Solve 10 hard problems using advanced Java features

📈 Statistics

Total Problems Solved: 0
Easy: 0
Medium: 0
Hard: 0
Platforms: LeetCode, HackerRank, Codeforces, CodeChef
Java Version: 11+
Average Solution Time: N/A

🧪 Testing
Using JUnit 5 for unit testing:
javaimport org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumSolutionTest {
    
    @Test
    void testTwoSum() {
        TwoSumSolution solution = new TwoSumSolution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }
}
🚀 Running the Code
Compile and Run
bash# Compile
javac -cp . src/com/dsa/leetcode/easy/TwoSumSolution.java

# Run
java -cp . com.dsa.leetcode.easy.TwoSumSolution
Using Maven
bash# Compile
mvn compile

# Run tests
mvn test

# Run specific class
mvn exec:java -Dexec.mainClass="com.dsa.leetcode.easy.TwoSumSolution"
📄 Common Java Patterns for DSA
Input/Output
javaScanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
int[] arr = new int[n];
for (int i = 0; i < n; i++) {
    arr[i] = scanner.nextInt();
}
Fast I/O for Competitive Programming
javaBufferedReader br = new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw = new PrintWriter(System.out);
StringTokenizer st = new StringTokenizer(br.readLine());
🤝 Contributing
This is a personal practice repository, but if you'd like to discuss solutions or share insights:

Open an issue for discussion
Feel free to fork and create your own version
Suggest Java-specific optimizations or alternative approaches

📞 Contact

Email: sumanmaity2749@gmail.com
LinkedIn: https://www.linkedin.com/in/suman-maity-69259a354/
GitHub: https://github.com/suman2749

📄 License
This repository is for educational purposes. Feel free to use the code for learning and practice.

Happy Coding in Java! ☕🚀
"Java is to JavaScript what car is to Carpet." - Chris Heilmann
