# Java Traffic Light Controller

A simple **Traffic Light Controller** simulation developed using Java.

The program allows the user to select a traffic light color and displays the corresponding action: **STOP, GET READY, or GO**.

## 📌 Overview

Traffic lights are used to control vehicle and pedestrian movement at road intersections.

This Java project simulates a basic traffic light controller using a menu and a `switch` statement.

## 📂 Project Structure

```text
java-traffic-light-controller/
├── .gitignore
├── TrafficLightController.java
└── README.md
```

## 🚦 Traffic Light Rules

| Choice | Traffic Light | Action    |
| ------ | ------------- | --------- |
| 1      | RED           | STOP      |
| 2      | YELLOW        | GET READY |
| 3      | GREEN         | GO        |

## ⚙️ Working Principle

The program displays three traffic light options:

```text
1. RED
2. YELLOW
3. GREEN
```

The user enters a number between 1 and 3.

The program uses a `switch` statement to determine the corresponding traffic light action.

```text
Choice 1 → RED → STOP
Choice 2 → YELLOW → GET READY
Choice 3 → GREEN → GO
```

If the user enters a number outside the range 1-3, the program displays an invalid choice message.

## 💻 Program

The main logic uses a Java `switch` statement:

```java
switch (choice) {

    case 1:
        System.out.println("Traffic Light: RED");
        System.out.println("Action: STOP");
        break;

    case 2:
        System.out.println("Traffic Light: YELLOW");
        System.out.println("Action: GET READY");
        break;

    case 3:
        System.out.println("Traffic Light: GREEN");
        System.out.println("Action: GO");
        break;

    default:
        System.out.println("Invalid choice!");
}
```

## ▶️ How to Run

### Step 1: Check Java

```bash
java --version
```

### Step 2: Check Java Compiler

```bash
javac --version
```

### Step 3: Compile the Program

```bash
javac TrafficLightController.java
```

### Step 4: Run the Program

```bash
java TrafficLightController
```

## 📊 Sample Output

### RED Light

```text
=================================
     TRAFFIC LIGHT CONTROLLER
=================================
1. RED
2. YELLOW
3. GREEN
Enter traffic light choice (1-3): 1

Traffic Light: RED
Action: STOP
```

### YELLOW Light

```text
=================================
     TRAFFIC LIGHT CONTROLLER
=================================
1. RED
2. YELLOW
3. GREEN
Enter traffic light choice (1-3): 2

Traffic Light: YELLOW
Action: GET READY
```

### GREEN Light

```text
=================================
     TRAFFIC LIGHT CONTROLLER
=================================
1. RED
2. YELLOW
3. GREEN
Enter traffic light choice (1-3): 3

Traffic Light: GREEN
Action: GO
```

### Invalid Choice

```text
=================================
     TRAFFIC LIGHT CONTROLLER
=================================
1. RED
2. YELLOW
3. GREEN
Enter traffic light choice (1-3): 5

Invalid choice!
Please enter a number between 1 and 3.
```

## 🧠 Concepts Used

* Java
* Scanner
* User input
* Variables
* Switch statement
* Case statements
* Break statement
* Default case
* Conditional logic

## ⏱️ Complexity

**Time Complexity:** `O(1)`

**Space Complexity:** `O(1)`

The program performs a fixed number of operations.

## 🚀 Future Improvements

This project can be extended to:

* Automatically change traffic lights
* Add countdown timers
* Simulate traffic signals continuously
* Add pedestrian crossing functionality
* Add emergency vehicle priority
* Create a graphical user interface
* Add multiple traffic intersections

## 🛠️ Technologies

* Java
* Git
* GitHub

## 👨‍💻 Author

**Your Name**

GitHub: `https://github.com/your-username`

---

⭐ If you found this project useful, consider giving the repository a star!

```
```