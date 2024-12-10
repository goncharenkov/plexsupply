# Plex Supply Automation Framework

## Overview
This is a UI and API automation testing framework for Plex Supply.

### Features
1. **UI Tests**: Covers end-to-end checkout flow.
2. **API Tests**: Verifies API responses and data structure.

## Prerequisites
- Java 17+ (Java 23 recommended)
- Maven
- Google Chrome/Firefox with respective drivers
- Allure Command-Line Tool

## Setup
1. Clone or extract the project.
2. Install dependencies:
   ```bash
   mvn clean install

## Run UI test
mvn test -Dtest=UiTests

## Run API test
mvn test -Dtest=UiTests

## Generate report
allure serve target/allure-results