For this project to run, you would need to install below 3 dependencies on your machine:

- **[Java 11](https://openjdk.java.net/projects/jdk/11/)** (as the core programming language)
- **[Maven 3.8.5](https://maven.apache.org/download.cgi)** (for dependency management)
- **[Google Chrome latest version](https://www.google.com/chrome/?brand=CHBD&gclid=Cj0KCQjwr-SSBhC9ARIsANhzu15P0PA-n9Zp4NpxKaOHVGtBD1TZQH0HlQQE6hUfsOFAU1nf-Rzdlf4aAoTJEALw_wcB&gclsrc=aw.ds)** (browser to run your tests)

> If your JAVA_HOME is set to anything other than JDK 11, you would need to update the path. Else your project
> will not run. Also, do remember to set the correct JDK settings in your IDE.

## Run Test

run test local PC
mvn clean test -DHOST=host.localhost

run test on sauceLab 
mvn clean test -DHOST=host.saucelabs
You can set the browser variable to run the test with Chrome / Firefox / Opera / Edge using -DBROWSER=Chrome
You can set the platform variable to run the test using -PLATFORM_NAME="Windows 10"
SauceLabs configs for every platform and browser can be found here (https://saucelabs.com/platform/platform-configurator)

run docker compose
docker-compose -f docker-compose.yml up -d

run test on Selenium grid 
mvn clean test -DHOST=host.docker.selenium.grid
You can set the browser variable to run the test with Chrome / Firefox /Edge using -DBROWSER=Chrome
