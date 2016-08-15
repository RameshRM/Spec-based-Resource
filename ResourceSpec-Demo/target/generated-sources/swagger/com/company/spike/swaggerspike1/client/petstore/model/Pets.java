package com.company.spike.swaggerspike1.client.petstore.model;

import com.company.spike.swaggerspike1.client.petstore.StringUtil;
import java.util.ArrayList;
import java.util.*;
import com.company.spike.swaggerspike1.client.petstore.model.Pet;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-14T21:47:45.526-07:00")
public class Pets extends ArrayList<Pet>  {
  

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pets {\n");
    sb.append("    ").append(StringUtil.toIndentedString(super.toString())).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
