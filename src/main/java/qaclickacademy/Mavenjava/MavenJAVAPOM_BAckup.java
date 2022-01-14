/*
<?xml version="1.0" encoding="UTF-8"?>

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>qaclickacademy</groupId>
  <artifactId>Mavenjava</artifactId>
  <version>0.0.1-SNAPSHOT</version>

  <name>Mavenjava</name>
  <!-- FIXME change it to the project's website -->
  <url>http://www.example.com</url>

  <profiles>
  <profile>
	<id>Regression</id>

  </profile>

  <profile>
	<id>Smoke</id>

  </profile>

  </profiles>


  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>1.7</maven.compiler.source>
    <maven.compiler.target>1.7</maven.compiler.target>
  </properties>


  <dependencies>
    
	<!-- https://mvnrepository.com/artifact/junit/junit -->
	<dependency>
	    <groupId>junit</groupId>
	    <artifactId>junit</artifactId>
	    <version>4.13.2</version>
	    <scope>test</scope>
	</dependency>

	<dependency>
    	<groupId>org.seleniumhq.selenium</groupId>
    	<artifactId>selenium-java</artifactId>
    	<version>4.1.0</version>
	</dependency>

	<dependency>
    	<groupId>org.testng</groupId>
    	<artifactId>testng</artifactId>
    	<version>7.4.0</version>
	</dependency>

  </dependencies>

  <build>
    <pluginManagement><!-- lock down plugins versions to avoid using Maven defaults (may be moved to parent pom) -->
      <plugins>
		 <plugin>
	          <groupId>org.apache.maven.plugins</groupId>
	          <artifactId>maven-surefire-plugin</artifactId>
	          <version>3.0.0-M5</version>
				<configuration>
                <suiteXmlFiles>
                <suiteXmlFile>testng.xml</suiteXmlFile>
                </suiteXmlFiles>
                </configuration>
	   </plugin>		

        <!-- clean lifecycle, see https://maven.apache.org/ref/current/maven-core/lifecycles.html#clean_Lifecycle -->
        <plugin>
          <artifactId>maven-clean-plugin</artifactId>
          <version>3.1.0</version>
        </plugin>
        <!-- default lifecycle, jar packaging: see https://maven.apache.org/ref/current/maven-core/default-bindings.html#Plugin_bindings_for_jar_packaging -->
        <plugin>
          <artifactId>maven-resources-plugin</artifactId>
          <version>3.0.2</version>
        </plugin>
        <plugin>
          <artifactId>maven-compiler-plugin</artifactId>
          <version>3.8.0</version>
        </plugin>
      
        <plugin>
          <artifactId>maven-jar-plugin</artifactId>
          <version>3.0.2</version>
        </plugin>
        <plugin>
          <artifactId>maven-install-plugin</artifactId>
          <version>2.5.2</version>
        </plugin>
        <plugin>
          <artifactId>maven-deploy-plugin</artifactId>
          <version>2.8.2</version>
        </plugin>
        <!-- site lifecycle, see https://maven.apache.org/ref/current/maven-core/lifecycles.html#site_Lifecycle -->
        <plugin>
          <artifactId>maven-site-plugin</artifactId>
          <version>3.7.1</version>
        </plugin>
        <plugin>
          <artifactId>maven-project-info-reports-plugin</artifactId>
          <version>3.0.0</version>
        </plugin>
      </plugins>
    </pluginManagement>
  </build>
</project>
*/