# Project Number 2
> This is a school assignment for a Trip Expense Planner app with JUnit tests. This project uses classes, testing, data persistence, and a GUI interface.
<br>
Course: Computer Programming 11

<br>

## Table of Contents
- [Technologies](#technologies)
- [How to run the project](#how-to-run-project)
- [How to use the app](#how-to-use-app)
- [References](#references)

<br>

## Technologies
* Frontend: JavaFX
* Backend: Java
* Testing: JUnit


<br>


## <a id="how-to-run-project">How to run the project</a>
### Prerequisites:
- Have a Git and GitHub account
- Have [Java JDK](https://adoptopenjdk.net/archive.html) installed 
  - This project uses jdk-11

### Configuration instructions:

You will need to install:
- [IntelliJ](https://www.jetbrains.com/idea/download/#section=windows) (executable)
  - This project uses the community version, which is free
- [SceneBuilder](https://gluonhq.com/products/scene-builder/)
  - Under the section *Download Scene Builder for Java 8*, download the appropriate 64-bit installer
  - This project uses the *Windows Installer 64-bit* Platform

Cloning the repository:
- Open Command Prompt
- `cd` into the folder you want the repository stored in
- Type: `git clone https://github.com/MonB003/ProjectNumber2.git`

Configuring the project in IntelliJ:
- In the top navbar, click *Add Configuration...*
- Click the plus icon, or *Add new run configuration...*
- For the configuration, select *Application*
- Give the configuration a name (ex. Main)
- For the *Build and run* section:
  - Use java 8 SDK
  - Select the main class file you want to run (either type in the class name or browse for the file)
    - ex. sample.Main
- Once the configuration information is filled out, click *Ok*

<b>Note:</b> if SceneBuilder fxml files give you an SDK error:
- In IntelliJ, go to: File > Project Settings > Modules
- In the *Dependencies* tab, select SDK 1.8

Configuring the SDK:
- In IntelliJ:
  - File > Project Structure > Project Settings > Project
    - Use SDK: 1.8
    - Language level: 8 - Lambdas, type annotations etc.
  - File > Project Structure > Project Settings > Modules
    - Use SDK: 1.8

### Running the project:
1. In IntelliJ, open the Main.java file
   - Main.java file location: *Your Folder Name* /src/sample/Main.java
2. Click the green triangle in the top right corner (when hovered on, it says: Run 'Main')
3. A small popup window will appear, which is the app


### Running the JUnit tests:
1. In IntelliJ, open the test class file you want to run (ex. CustomerTests.java)
   - The test files are in the TestCases folder
2. In the top navbar, click *Add Configuration...*
   - For the configuration, select *JUnit*
   - Give the configuration a name (ex. TripTests tests)
   - For the class, select the test class file you want to run (either type in the class name or browse for the file)
   - Once the configuration information is filled out, click *Ok*
3. Click the green triangle in the top right corner (when hovered on, it says: Run 'Main')
4. A small popup window will appear with the results of the tests

<br>


## <a id="how-to-use-app">How to use the app (Features)</a>
- Enter your budget
- Enter the amount spend for the following categories: Transportation, Food, Lodging, and Miscellaneous
- For each category, select an option from the dropdown menu
- View the total amount of money spent on the bottom left corner of the window
- Click the *Save* button to save the trip plan and expenses
- View the saved trip plan and expenses in the tripExpenses.txt file
- Click the *Reset* button to clear all the text fields


<br>


## <a id="references">References</a>
- [School lecture video](https://www.youtube.com/watch?v=ivRleZ6NWLQ&t=538s)
