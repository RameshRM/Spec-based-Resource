#!/bin/bash

java -Dmodels -Dapis -jar ~/github.com/swagger-codegen/modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate -i http://petstore.swagger.io/v2/swagger.json -l jaxrs-cxf -o src --model-package com.rameshrm.models  --api-package com.rameshrm.apis

cp -r ./src/gen/java/com/rameshrm/apis ./src/main/java/com/rameshrm

cp -r ./src/gen/java/com/rameshrm/models ./src/main/java/com/rameshrm

rm -rf ./src/gen
