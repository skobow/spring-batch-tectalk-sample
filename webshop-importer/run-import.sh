#!/usr/bin/env bash
java -cp target/dependency-jars/*;target/webshop-importer-1.0-SNAPSHOT.jar org.springframework.batch.core.launch.support.CommandLineJobRunner webshop-importer-context.xml job
