package com.company.spike.swaggerspike1.client.petstore.auth;

import com.company.spike.swaggerspike1.client.petstore.Pair;

import java.util.Map;
import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-14T21:47:45.526-07:00")
public interface Authentication {
  /** Apply authentication settings to header and query params. */
  void applyToParams(List<Pair> queryParams, Map<String, String> headerParams);
}
