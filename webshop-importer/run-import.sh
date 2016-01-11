#!/usr/bin/bash

set -x
INPUT_RESOURCE=file:C:/Entwicklung/projects/spring-batch-tectalk-sample/data/products_WithId.zip
TARGET_DIRECTORY=./work/output/
TARGET_FILE=products.csv

java -cp "target/dependency-jars/*;target/webshop-importer-1.0-SNAPSHOT.jar" \
    org.springframework.batch.core.launch.support.CommandLineJobRunner \
    webshop-importer-context.xml \
    importProductsJob \
    inputResource=$INPUT_RESOURCE \
    targetDirectory=$TARGET_DIRECTORY \
    targetFile=$TARGET_FILE
set +x