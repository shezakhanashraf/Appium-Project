****AppiumProject****

Streamlining mobile app testing with Appium. This project provides a robust structure for Appium-based mobile app testing, including essential Java classes, categorized tests, utility functions, and organized packages like 'pages' and 'Tests'. Test data is available in the 'resources' folder, and configurable parameters are in the 'configuration' folder. The APK file for testing is provided.

**Appium Installation**

Appium can be installed in two versions:

1-CLI-based Appium Server

2-GUI-based Appium Desktop

**CLI-based Appium Server Installation:**

Step 1: Install Node.js

-Appium is written in Node.js, so install Node.js first. Visit the Node.js website to download and install the software.

-Accept the license agreement and proceed with the installation.

Step 2: Install Appium from the Command Prompt

-Open the command prompt as an administrator and type the following command:
"npm install -g appium"

-After successful installation, start Appium using the following command:
"appium -a 127.0.0.1 -p 4723"

-Now, Appium is running, and the REST HTTP interface is listening on the specified IP address and port number.

**GUI-based Appium Desktop Installation:**

-Download and install Appium Desktop from the Appium website.

-Open the Appium desktop and configure the host IP address and server port number.

-Customize server settings in the Advanced Tab if needed.

-Appium Desktop is now ready for use.

**Setup Environment with Installation and Prerequisites**

-Download and install the latest Java Development Kit (JDK) from Oracle.

-Download and install the latest Android Studio from developer.android.com/studio.

-Download and install the latest IntelliJ IDEA Community Edition from jetbrains.com/idea/download.

-Install Chocolatey Windows Package Manager from chocolatey.org.

-Download and install Git Bash by running the command:
"choco install git"

-Install Maven using Chocolatey by running the command:
"choco install maven"

**Project Creation and Defining its Structure**

Creating a Sample Project

Step 01: Launch IntelliJ IDEA Community Edition

Step 02: Create a New Project

Step 03: Project Structure

-The project structure includes:

2.1-The .idea folder (hidden on OS X) containing IntelliJ's project-specific settings files.

2.2-The src folder for application source files.

2.3-The target folder, Maven's default output folder.

2.4-The pom.xml file, Maven's Project Object Model file, describing the project's build configuration.

**Launch Application using Appium Desktop**

Step-by-Step Guide

1-Launch Appium Server by clicking the Appium icon.

2-Start Appium Server on the default configuration.

3-Appium Server is up and running on the default configuration.

4-Launch Android Studio and start the Virtual Device Manager.

5-Create a new Virtual Device by selecting a device from the list and clicking Next.

6-Select a specific API level for the Virtual Device and click Next.

7-Leave the default settings and click Finish.

8-Start your newly created Virtual Device by clicking the play button.

9-After successfully launching the Virtual Device, open the command line and type adb devices.

10-Go back to Appium Server, click on the magnifying glass to start the inspector section.

11-Set up the required Desired Capabilities and click Start Session.

12-The application is up and running on the Virtual Device using Appium Server.
