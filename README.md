## Inštalácia Gauge
1. https://docs.gauge.org/getting_started/installing-gauge.html?os=windows&language=javascript&ide=vscode
2. Pridať do premenných prostredia:
   a. Tento počítač (Pravím)
   b. Vlastnosti
   c. Rozšírené nastavenie systému
   d. Premenné prostredia
   e. Rozkliknúť Path
   f. Nové
   g. Prehľadávať -> C:\Program Files\Gauge\bin
3. Otvoriť cmd -> Použiť príkady:
   a. gauge install html-report
   b. gauge install java

## Inštalácia IJ
1. https://www.jetbrains.com/idea/download/#section=windows
2. Stiahnuť community
3. Len preklikať inštaláciu

## IJ Gauge plugin
1. Stiahnuť https://plugins.jetbrains.com/plugin/7535-gauge/versions/stable/233524
2. Otvoriť IJ
3. File -> Settings -> Vyhľadať Plugins
4. Koliečko -> Install plugins from disk -> Vyhľadať ten stiahnutý plugin
5. Nainštalovať

## Stiahnutie projektu
0. Ak nemáte git treba stiahnuť a nainštalovať https://git-scm.com/
1.


## About this template

This is a template to get started with a Gauge project that uses Selenium as the driver to interact with a web browser.

## Installing this template

    gauge --install java_maven_selenium

## Building on top of this template

### Defining Specifications

* This template includes a sample specification which opens up a browser and navigates to `Get Started` page of Gauge.
* Add more specifications on top of sample specification.

Read more about [Specifications](http://getgauge.io/documentation/user/current/specifications/README.html)

### Writing the implementations

This is where the java implementation of the steps would be implemented. Since this is a Selenium based project, the java implementation would invoke Selenium APIs as required.

_We recommend considering modelling your tests using the [Page Object](https://github.com/SeleniumHQ/selenium/wiki/PageObjects) pattern, and the [Webdriver support](https://github.com/SeleniumHQ/selenium/wiki/PageFactory) for creating them._

- Note that every Gauge step implementation is annotated with a `Step` attribute that takes the Step text pattern as a parameter.
Read more about [Step implementations in Java](http://getgauge.io/documentation/user/current/test_code/java/java.html)

### Execution

* You can execute the specification as:

```
mvn test
```
