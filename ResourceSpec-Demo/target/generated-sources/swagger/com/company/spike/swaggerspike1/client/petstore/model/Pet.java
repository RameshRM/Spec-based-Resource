package com.company.spike.swaggerspike1.client.petstore.model;

import com.company.spike.swaggerspike1.client.petstore.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-14T21:47:45.526-07:00")
public class Pet   {
  
  private Long id = null;
  private String name = null;
  private String tag = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("tag")
  public String getTag() {
    return tag;
  }
  public void setTag(String tag) {
    this.tag = tag;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pet {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    tag: ").append(StringUtil.toIndentedString(tag)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
