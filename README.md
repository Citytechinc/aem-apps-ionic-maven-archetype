# AEM Apps Ionic Maven Archetype

Generates a multi-module AEM project, initial content, and contentsync configuration appropriate for an AEM Apps project 
using the [Ionic AEM Apps Library](https://github.com/Citytechinc/ionic-aem-apps).

## Usage

```
mvn archetype:generate -DarchetypeGroupId=com.citytechinc.aem.apps.ionic -DarchetypeArtifactId=aem-apps-ionic-maven-archetype -DarchetypeVersion=0.3.0 -DgroupId=com.client.package -DartifactId=project-name -DclientPrettyName="Project Name" -Dversion=1.0.0-SNAPSHOT -DinteractiveMode=false
```

## Version Information

Library or Application | Version(s)
---------------------- | ----------
AEM                    | 6.2
Ionic AEM Apps Library | 0.7.0