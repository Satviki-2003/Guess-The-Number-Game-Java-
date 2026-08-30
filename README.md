# NUMBUZZ — Java Swing Number Guessing Game

NUMBUZZ is a desktop-based GUI guessing game built using Java Swing and AWT. The game challenges players to guess a randomly generated secret number between **1 and 100** while keeping track of total attempts and calculating a dynamic end-game score.

---

## 📌 Project Features

* **Interactive GUI**: Built using Java Swing components (`JFrame`, `JPanel`, `JButton`, `JTextField`, `JTextArea`).
* **Dynamic Feedback**: Gives real-time hints (*"Increase the number !!!"* or *"Decrease the number !!!"*) based on player input.
* **Score System**: Calculates points based on the number of attempts taken to guess correctly:
* **First Try**: 1000 points
* **2 to 5 Attempts**: $1000 - (\text{Guesses} \times 10)$
* **6+ Attempts**: $1000 - (\text{Guesses} \times 50)$



---

## 💡 How to Play

1. Launch the application and click **PLAY** on the title screen.
2. Read the game instructions and click **CONTINUE**.
3. Type your guess (a number between 1 and 100) into the input box and click **SUBMIT**.
4. Read the feedback screen:
* If your guess is too low, increase your next guess.
* If your guess is too high, decrease your next guess.


5. Repeat until you guess the correct number to reach the victory screen.

---

## 🚀 Getting Started

### Prerequisites

Ensure you have the Java Development Kit (JDK 8 or higher) installed on your system.

```bash
java -version

```

### File Structure

```text
├── main.java        # Main source code containing GUI and game logic
└── README.md        # Project documentation

```

### Compilation & Execution

1. **Clone or Download** the repository and navigate to the project folder:
```bash
cd Guess-The-Number-Game-Java-

```


2. **Compile the Java file**:
```bash
javac main.java

```


3. **Run the game**:
```bash
java main

```



---

## 🛠️ Built With

* **Java Swing** (`javax.swing.*`) — Window management, labels, text fields, text areas, and buttons.
* **Java AWT** (`java.awt.*`, `java.awt.event.*`) — Container layouts, colors, custom fonts, and event handling via `ActionListener`.

---
