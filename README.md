## Inštalácia Gauge
1. https://docs.gauge.org/getting_started/installing-gauge.html?os=windows&language=javascript&ide=vscode
2. Pridať do premenných prostredia:
* Tento počítač (Pravým)
* Vlastnosti
* Rozšírené nastavenie systému
* Premenné prostredia
* Rozkliknúť Path
* Nové
* Prehľadávať -> C:\Program Files\Gauge\bin
3. Otvoriť cmd -> Použiť príkady:
   a. gauge install html-report
   b. gauge install java

## Inštalácia maven
1. https://maven.apache.org/download.cgi
2. Rozbaliť do miesta kde chcete mať nainištalovaný Maven
3. Pridať do premenných prostredia: rovnako ako Gauge tak cestu k mvn

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

## Nastavenie Chrome premenných
1. https://chromedriver.chromium.org/downloads
2. Stiahnuť vašu verziu chrome driveru (rovnaká ako máte chrome)
3. Rozbaliť do miesta kde chcete mať chrome driver
4. Nastaviť premenné prostredia aj pre chromedriver aj pre miesto kde máte uložený chrome.exe

## Stiahnutie projektu
0a. Ak nemáte git treba stiahnuť a nainštalovať https://git-scm.com/
1.Otvoriť CMD
2.git clone https://github.com/SokolikMatej/AT.git C:\<miesto kde chcete mat projekt>

[//]: # (## About this template)

[//]: # ()
[//]: # (This is a template to get started with a Gauge project that uses Selenium as the driver to interact with a web browser.)

[//]: # ()
[//]: # (## Installing this template)

[//]: # ()
[//]: # (    gauge --install java_maven_selenium)

[//]: # ()
[//]: # (## Building on top of this template)

[//]: # ()
[//]: # (### Defining Specifications)

[//]: # ()
[//]: # (* This template includes a sample specification which opens up a browser and navigates to `Get Started` page of Gauge.)

[//]: # (* Add more specifications on top of sample specification.)

[//]: # ()
[//]: # (Read more about [Specifications]&#40;http://getgauge.io/documentation/user/current/specifications/README.html&#41;)

[//]: # ()
[//]: # (### Writing the implementations)

[//]: # ()
[//]: # (This is where the java implementation of the steps would be implemented. Since this is a Selenium based project, the java implementation would invoke Selenium APIs as required.)

[//]: # ()
[//]: # (_We recommend considering modelling your tests using the [Page Object]&#40;https://github.com/SeleniumHQ/selenium/wiki/PageObjects&#41; pattern, and the [Webdriver support]&#40;https://github.com/SeleniumHQ/selenium/wiki/PageFactory&#41; for creating them._)

[//]: # ()
[//]: # (- Note that every Gauge step implementation is annotated with a `Step` attribute that takes the Step text pattern as a parameter.)

[//]: # (Read more about [Step implementations in Java]&#40;http://getgauge.io/documentation/user/current/test_code/java/java.html&#41;)

[//]: # ()
[//]: # (### Execution)

[//]: # ()
[//]: # (* You can execute the specification as:)

[//]: # ()
[//]: # (```)

[//]: # (mvn test)

[//]: # (```)
