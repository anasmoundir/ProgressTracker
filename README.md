##Progress Tracker
Overview

Progress Tracker is an application designed to streamline the monitoring of progress and goals. It allows users to efficiently track their objectives, providing a modern and effective solution for goal management.

Contents
Classes
Configuration
Dependency Injection
Spring Data
Main Application
Classes
User Class
The User class represents individuals within the system, featuring attributes such as ID, name, and avatar.

Goal Class
The Goal class signifies progress goals, including attributes such as ID, description, and completion status.

Configuration
Spring configuration, defined in spring-config.xml, sets up the User and Goal classes as Spring beans with singleton and prototype scopes, respectively.

Dependency Injection
The ServiceProgressTracker class manages progress tracking, injecting instances of User and Goal through Spring's dependency injection.

Spring Data
The project incorporates Spring Data configuration for handling data sources, configurable via either XML or Java-based settings.

Main Application
The Main class acts as the application's entry point, loading the Spring configuration file, retrieving beans from the Spring container, and showcasing the features of the "Progress Tracker" application.

