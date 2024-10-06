How to Run the Applicant Tracking System (ATS)
Pre-requisites
Java Development Kit (JDK) 11 or later installed.
MySQL Server installed and running.
MySQL Connector JAR file downloaded and placed in the project lib folder.
JavaFX SDK downloaded and properly configured in the project.
Database setup: You should have already created the ats_db database using the provided SQL schema.
Project Structure
Ensure that your project structure is as follows:
bash
Copy code
/ApplicantTrackingSystem
  /bin                     # Compiled Java class files
  /lib                     # Required JAR files (JavaFX, MySQL Connector)
    javafx.base.jar
    javafx.controls.jar
    javafx.fxml.jar
    mysql-connector-java.jar
  /src                     # Source code files
    Main.java
    DatabaseHandler.java
    ScoreCalculator.java
    FileChooserApp.java
  /resources                # Any additional resources if required (optional)
Setting Up JavaFX
Download JavaFX SDK:
Visit the JavaFX website and download the appropriate SDK for your operating system.
Unpack the SDK:
Extract the JavaFX SDK to a location on your system, e.g., C:\javafx-sdk.
Include JavaFX Libraries:
Place the necessary JavaFX JAR files into the libdirectory in your project. The essential files include:
javafx.base.jar
javafx.controls.jar
javafx.fxml.jar
javafx.graphics.jar
Modify Your JavaFX Run Command:
To run the project, use the following command (modify according to your SDK location):
bash
Copy code
java --module-path "path/to/your/javafx-sdk/lib" --add-modules javafx.controls,javafx.fxml -cp "bin;lib/*" Main
For example, if JavaFX is located at C:\javafx-sdk, you can run:
bash
Copy code
java --module-path "C:\javafx-sdk\lib" --add-modules javafx.controls,javafx.fxml -cp "bin;lib/*" Main
Database Setup
CREATE DATABASE ats_db;
USE ats_db;

CREATE TABLE shortlisted_resumes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    candidate_name VARCHAR(100),
    resume_text TEXT,
    score DECIMAL(5, 2)
);
Compiling the Project
Open a terminal/command prompt in the root directory of your project (ApplicantTrackingSystem).
Compile the Java files using the following command:
javac --module-path "path/to/your/javafx-sdk/lib" --add-modules javafx.controls,javafx.fxml -cp "lib/*" -d bin src/*.java
Running the Project
After successfully compiling the project, run the program using the following command:
java --module-path "path/to/your/javafx-sdk/lib" --add-modules javafx.controls,javafx.fxml 
