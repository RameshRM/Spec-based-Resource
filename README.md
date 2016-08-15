# Spec-based-Resource
Demo


# Installation

`git clone https://github.com/RameshRM/Spec-based-Resource.git`


## `swagger-codegen`

To generated code generated `JaxRS interfaces` , download `swagger-codegen` and copy in your local folder.

## Running CodeGen

1. Modify `spec-gen.sh` script in `ResourceSpec-Demo` folder with the path where you have downloaded `swagger-codegen`

2. Run `./spec-gen`

# Usage

```
cd ResourceSpec-Demo
mvn clean install
mvn tomcat7:run
```
