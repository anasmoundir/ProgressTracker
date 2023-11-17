
ProgressTracker Application
Project Overview
"ProgressTracker" is an application developed by Geneiryodan Corporate to modernize the management of progress and goals. The application allows users to efficiently track their progress and goals.

Table of Contents
Classes
Configuration
Dependency Injection
Spring Data
Main Application
Classes
User Class
The User class represents a user in the system with attributes such as ID, name, and avatar.

Goal Class
The Goal class represents a progress goal with attributes such as ID, description, and completion status.

Configuration
The Spring configuration is based on an XML file, spring-config.xml. In this file, the User and Goal classes are configured as Spring beans with singleton and prototype scopes, respectively.

Dependency Injection
The ServiceProgressTracker class is responsible for managing progress tracking. It injects instances of User and Goal using Spring's dependency injection.

Spring Data
The project includes Spring Data configuration to handle data sources. The configuration can be either XML-based or Java-based, depending on your preference.

Main Application
The Main class serves as the entry point for the application. It loads the Spring configuration file, retrieves beans from the Spring container, and demonstrates the functionalities of the "ProgressTracker" application.
