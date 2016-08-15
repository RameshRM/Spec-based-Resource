package com.rameshrm.com.rameshrm.specapis;


import com.rameshrm.apis.PetApi;
import com.rameshrm.models.Category;
import com.rameshrm.models.Pet;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.io.InputStream;
import java.util.List;

/**
 * Created by ramahadevan on 8/14/16.
 */
@Path("/petstore")
public class PetResource implements PetApi {


    @GET
    @Path("/foo")
    public Response fooBar() {
        return Response.status(200).entity("Foo Bar").build();
    }

    @Override
    public Response addPet(Pet body) {
        return null;
    }

    @Override
    public Response deletePet(@PathParam("petId") Long petId, @HeaderParam("api_key") String apiKey) {
        return null;
    }

    @Override
    public Response findPetsByStatus(@QueryParam("status") List<String> status) {
        return null;
    }

    @Override
    public Response findPetsByTags(@QueryParam("tags") List<String> tags) {
        return Response.status(200).entity("Foo Bar").build();
    }

    @Override
    @GET
    @Path("/pet/{petId}")
    public Response getPetById(@PathParam("petId") Long petId) {
        Pet pet = new Pet();
        pet.setName("Foo");
        Category category = new Category();
        category.setName("Dog");
        pet.setCategory(category);
        return Response.status(Response.Status.OK).entity(pet).build();
    }

    @Override
    public Response updatePet(Pet body) {
        return null;
    }
}
