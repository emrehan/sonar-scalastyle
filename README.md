# Sonar Scalastyle Plugin

Wraps up Scalastyle as a SonarQube plugin.

http://www.scalastyle.org/


[![Dependency Status](https://www.versioneye.com/user/projects/560aec945a262f00220007a1/badge.svg?style=flat)](https://www.versioneye.com/user/projects/560aec945a262f00220007a1)


### Instructions

* Download and unzip SonarQube [4.3.2](http://dist.sonar.codehaus.org/sonarqube-4.3.2.zip) or [4.4-RC3](http://dist.sonar.codehaus.org/sonarqube-4.4-RC3.zip).
* Download and unzip [Sonar Runner](http://repo1.maven.org/maven2/org/codehaus/sonar/runner/sonar-runner-dist/2.4/sonar-runner-dist-2.4.zip).
* Download the [Sonar Scalastyle Plugin](https://github.com/emrehan/sonar-scalastyle/releases/download/v0.0.1-SNAPSHOT/sonar-scalastyle-plugin-0.0.1-SNAPSHOT.jar).
* Copy the plugin to `extensions/plugins` directory of SonarQube.
* Start the SonarQube server by running `./sonar.sh console` under `sonarqube<version>/bin/<your os>` directory
* Create a [sonar-project.properties](https://github.com/emrehan/sonar-scalastyle/blob/master/sonar-project.properties) file at the root directory of your project.
* Run `sonar-runner` in your project's root directory.
* Check the report on http://localhost:9000/
* You can log in with default username and password 'admin'.

---

Supports Sonar 4.3.1 +
