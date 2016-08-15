package com.company.spike.swaggerspike1.client.petstore.api;

import com.company.spike.swaggerspike1.client.petstore.ApiException;
import com.company.spike.swaggerspike1.client.petstore.ApiClient;
import com.company.spike.swaggerspike1.client.petstore.Configuration;
import com.company.spike.swaggerspike1.client.petstore.Pair;
import com.company.spike.swaggerspike1.client.petstore.TypeRef;

import com.company.spike.swaggerspike1.client.petstore.model.Pets;
import com.company.spike.swaggerspike1.client.petstore.model.Error;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-14T21:47:45.526-07:00")
public class PetsApi {
  private ApiClient apiClient;

  public PetsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PetsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * List all pets
   * 
   * @param limit How many items to return at one time (max 100)
   * @return Pets
   */
  public Pets listPets (Integer limit) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/pets".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<Pets>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Create a pet
   * 
   * @return void
   */
  public void createPets () throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/pets".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, null);
    
    


  }
  
  /**
   * Info for a specific pet
   * 
   * @param petId The id of the pet to retrieve
   * @return Pets
   */
  public Pets showPetById (String petId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'petId' is set
     if (petId == null) {
        throw new ApiException(400, "Missing the required parameter 'petId' when calling showPetById");
     }
     
    // create path and map variables
    String path = "/pets/{petId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "petId" + "\\}", apiClient.escapeString(petId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<Pets>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
}
