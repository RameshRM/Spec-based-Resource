#!/bin/bash

codegen=$1
spec=$2
lang=$3
outdir=$4
apipkg=$5
modelpkg=$6

java -Dmodels -Dapis -jar $codegen generate -i $spec -l $lang -o $outdir --model-package $modelpkg  --api-package $apipkg

cp -r ./src/gen/java/com/rameshrm/apis ./src/main/java/com/rameshrm

cp -r ./src/gen/java/com/rameshrm/models ./src/main/java/com/rameshrm

rm -rf ./src/gen
