# zonky-webdriver-test

GUI smoke test of [Zonky Marketplace](https://app.zonky.cz/#/marketplace/) page.
Using Selenium/WebDriver checks if the page `/#/marketplace/` contains expected header title and a some available loans.

## Requirements

- Java
```
java -version
java version "1.8.0_112"
Java(TM) SE Runtime Environment (build 1.8.0_112-b15)
Java HotSpot(TM) 64-Bit Server VM (build 25.112-b15, mixed mode)
```
- Maven

```
mvn --version
Apache Maven 3.3.9 (bb52d8502b132ec0a5a3f4c09453c07478323dc5; 2015-11-10T17:41:47+01:00)
Maven home: C:\tools\apache-maven-3.3.9
Java version: 1.8.0_112, vendor: Oracle Corporation
Java home: C:\Program Files\Java\jdk1.8.0_112\jre
Default locale: cs_CZ, platform encoding: Cp1250
OS name: "windows 10", version: "10.0", arch: "amd64", family: "dos"
```

- Mozilla's [geckodriver](https://github.com/mozilla/geckodriver) v0.11.1+ in path
- Firefox 48+
