# Java Programming

Java is one of the most widely used programming languages in the world, and for good reason:

* **Platform Independence**: Thanks to the Java Virtual Machine (JVM), Java code can run on any platform without modification.
* **Object-Oriented**: Java promotes modular programming and code reuse through its object-oriented approach.
* **Strong Community Support**: With millions of developers and extensive documentation, help is always available.
* **Rich API**: Java provides a vast standard library that simplifies tasks like file handling, networking, and data structures.
* **Performance and Scalability**: With just-in-time compilers and multi-threading, Java supports high-performance and scalable applications.
* **Security**: Java has built-in security features that make it ideal for networked and enterprise applications.
* **Versatile Usage**: Java is used in web development, Android apps, enterprise solutions, embedded systems, and more.

Whether you're building a small tool or a large-scale application, Java offers the stability, support, and flexibility you need.

## 🧠 What is JVM?

The **Java Virtual Machine (JVM)** is an abstract computing machine that enables a computer to run Java programs. It is the engine that drives the Java platform's portability and flexibility.

### Key Responsibilities of the JVM:

* **Bytecode Execution**: JVM converts compiled Java `.class` files (bytecode) into machine-specific instructions at runtime.
* **Memory Management**: Manages memory allocation and garbage collection.
* **Security**: Provides a secure execution environment by sandboxing applications.
* **Platform Independence**: Allows Java programs to be written once and run anywhere, thanks to consistent behavior across different operating systems.

### JVM vs JDK vs JRE:

* **JVM**: Runs Java bytecode.
* **JRE (Java Runtime Environment)**: Contains JVM + core libraries.
* **JDK (Java Development Kit)**: Contains JRE + development tools (compiler, debugger, etc.).

In short, JVM is the cornerstone of Java's portability and cross-platform capabilities.

## 🔤 Basic Java Syntax

## 📘 Chapter: Java Basics

This chapter introduces you to foundational Java concepts like output, input, variables, data types, conditional branching, and loops.

### 🖨️ Output

In Java, you can use `System.out.print()` or `System.out.println()` to display output.

```java
System.out.println("Hello, Java!"); // with newline
System.out.print("Same line");       // without newline
```

### 🎯 User Input

Use `Scanner` class to read input:

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
System.out.print("Enter your name: ");
String name = sc.nextLine();
System.out.println("Hello, " + name);
```

### 🧮 Variables and Data Types

Variables store data. Java is statically typed.

```java
int age = 25;
double pi = 3.1415;
char grade = 'A';
boolean isActive = true;
String name = "Alice";
```

### 🔁 Branching (Conditionals)

Java supports `if`, `else if`, `else`, and `switch` statements.

```java
int num = 10;
if (num > 0) {
    System.out.println("Positive");
} else if (num < 0) {
    System.out.println("Negative");
} else {
    System.out.println("Zero");
}
```

### 🔄 Looping

#### 🔂 for Loop

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Count: " + i);
}
```

#### 🔁 while Loop

```java
int i = 1;
while (i <= 5) {
    System.out.println("While: " + i);
    i++;
}
```

#### 🔃 do-while Loop

```java
int j = 1;
do {
    System.out.println("Do-while: " + j);
    j++;
} while (j <= 5);
```

---

Understanding the basic structure and syntax of a Java program is essential for beginners. Here's an example followed by a breakdown of each token:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### 🔍 Explanation of Tokens

* `public`: An access modifier that means this class or method is accessible from anywhere.
* `class`: A keyword used to declare a class.
* `HelloWorld`: The name of the class. In Java, the file name must match the class name.
* `{ ... }`: Curly braces enclose the body of the class and methods.
* `static`: Means this method belongs to the class, not instances of it.
* `void`: This method does not return any value.
* `main`: The entry point of a Java application.
* `String[] args`: An array of strings passed as command-line arguments to the program.
* `System.out.println(...)`: Prints the specified message to the console followed by a new line.
* `;`: Every Java statement must end with a semicolon.

This structure forms the backbone of every Java program.

## 🛠️ Setting Up Java SDK and VS Code

## 🧰 Popular Java IDEs

Here are some popular Integrated Development Environments (IDEs) used for Java development:

### 1. IntelliJ IDEA

* Developer: JetBrains
* Edition: Community (free) & Ultimate (paid)
* Features: Smart code completion, refactoring, debugging, Spring support
* Website: [https://www.jetbrains.com/idea/](https://www.jetbrains.com/idea/)

### 2. Eclipse

* Developer: Eclipse Foundation
* Open-source and highly extensible
* Features: Plugin-rich, good for enterprise apps, JEE, Android
* Website: [https://www.eclipse.org/](https://www.eclipse.org/)

### 3. NetBeans

* Developer: Apache Software Foundation
* All-in-one IDE for Java SE, Java EE, and others
* Integrated GUI builder (Swing), Maven/Gradle support
* Website: [https://netbeans.apache.org/](https://netbeans.apache.org/)

### 4. Visual Studio Code (VS Code)

* Developer: Microsoft
* Lightweight, fast, and supports Java via extensions
* Great for modern and cross-language development
* Website: [https://code.visualstudio.com/](https://code.visualstudio.com/)

### 5. BlueJ

* Designed for beginners and educational use
* Simple UI, built-in object inspector
* Website: [https://www.bluej.org/](https://www.bluej.org/)

### 6. JDeveloper

* Developer: Oracle
* Tailored for Oracle-based applications and enterprise Java
* Website: [https://www.oracle.com/tools/jdeveloper/](https://www.oracle.com/tools/jdeveloper/)

### 7. DrJava

* Lightweight IDE aimed at students
* Simple interface, suitable for teaching Java basics
* Website: [https://drjava.org/](https://drjava.org/)

Now, let's move on to how to install Java SDK and set up your development environment using VS Code:

## 🛠️ Setting Up Java SDK and VS Code

Follow these steps to set up the Java Development Kit (JDK) and Visual Studio Code (VS Code) for Java development:

### Step 1: Install Java Development Kit (JDK)

1. Go to the [Oracle JDK download page](https://www.oracle.com/java/technologies/javase-downloads.html) or use [OpenJDK](https://jdk.java.net/).
2. Download the installer for your operating system (Windows, macOS, Linux).
3. Run the installer and follow the instructions.
4. After installation, verify by opening a terminal and typing:

   ```bash
   java -version
   javac -version
   ```

### Step 2: Install Visual Studio Code

1. Download VS Code from [https://code.visualstudio.com](https://code.visualstudio.com).
2. Install VS Code like any standard application.

### Step 3: Install Java Extensions in VS Code

1. Open VS Code.
2. Go to the **Extensions** panel (`Ctrl+Shift+X` or click the square icon on the sidebar).
3. Search for and install:

   * **Java Extension Pack** by Microsoft (includes Language Support, Debugger, Maven, etc.)
   * Optionally: **Spring Boot Extension Pack** for enterprise development

### Step 4: Configure Your Environment

1. Open **Command Palette** (`Ctrl+Shift+P`), then select `Java: Configure Java Runtime`.
2. Make sure VS Code detects your installed JDK.
3. You can create a simple `.java` file and run it using the **Run** button that appears.

### Step 4.1: Set JAVA\_HOME Environment Variable (Windows)

To make Java available system-wide and allow other tools to locate it:

1. Open the **Start Menu**, search for and open **Edit the system environment variables**.
2. In the System Properties window, click on **Environment Variables**.
3. Under **System variables**, click **New**:

   * Variable name: `JAVA_HOME`
   * Variable value: `C:\Program Files\Java\jdk-XX.X.X` (replace with your installed JDK path)
4. Click OK to save.
5. Now select the **Path** variable under System variables, click **Edit**, then **New**:

   * Add: `%JAVA_HOME%\bin`
6. Click OK to close all dialogs.

✅ To verify, open a new terminal and run:

```bash
java -version
javac -version
```

1. Open **Command Palette** (`Ctrl+Shift+P`), then select `Java: Configure Java Runtime`.
2. Make sure VS Code detects your installed JDK.
3. You can create a simple `.java` file and run it using the **Run** button that appears.

### Step 5: Compile and Run Java Code

* To compile:

  ```bash
  javac HelloWorld.java
  ```
* To run:

  ```bash
  java HelloWorld
  ```

✅ You are now ready to start Java development with VS Code!

## 📚 History of Java Programming

Java was developed by **James Gosling** and his team at **Sun Microsystems** and was officially released in **1995**. Originally designed for interactive television, Java became a general-purpose programming language known for its **Write Once, Run Anywhere (WORA)** philosophy. It is a **class-based**, **object-oriented** language that is widely used in enterprise applications, Android development, web servers, and more.

Key milestones in Java history:

* **1991**: Project Green initiated at Sun Microsystems
* **1995**: Java 1.0 released
* **2006**: Sun made Java open-source by releasing it under the GPL license
* **2010**: Oracle acquired Sun Microsystems
* **2014+**: Introduction of Lambda expressions, Streams API, and functional-style programming
* **2021 onwards**: Faster release cycles with Java 17 being a long-term support (LTS) release