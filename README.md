server-demo
===========

Demo for Scaling Server Architecture

Requires [Apache Maven](http://maven.apache.org) 3.0 or greater, [Google App Engine Java SDK](https://developers.google.com/appengine/docs/java/gettingstarted/installing), and JDK 6+ in order to run.

To build, run

    mvn package

To start the app, use the [App Engine Maven Plugin](http://code.google.com/p/appengine-maven-plugin/) that is already included in this demo.  Just run the command.

    mvn appengine:devserver

For further information, consult the [Java App Engine](https://developers.google.com/appengine/docs/java/overview) documentation.

To see all the available goals for the App Engine plugin, run

    mvn help:describe -Dplugin=appengine

There are two eclipse launch configurations in the folder eclipse-launch-profiles within the project.
