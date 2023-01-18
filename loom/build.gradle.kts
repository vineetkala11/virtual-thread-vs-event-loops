import org.springframework.boot.gradle.tasks.run.BootRun

plugins {
	java
	id("org.springframework.boot") version "3.0.1"
	id("io.spring.dependency-management") version "1.1.0"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_19
java.targetCompatibility = JavaVersion.VERSION_19

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation ("org.springframework.boot:spring-boot-starter-tomcat")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("io.projectreactor:reactor-test")
}

tasks.withType<JavaCompile>{
	//options.compilerArgs.plusAssign("--enable-preview")
	options.compilerArgs = options.compilerArgs + "--enable-preview"
}

tasks.withType<Test> {
	useJUnitPlatform()
}
