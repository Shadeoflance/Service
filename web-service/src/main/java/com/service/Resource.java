package com.service;

import javax.json.*;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("clients")
public class Resource {
    static public Service Service;
    @GET
    @Path("getall")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonArray getAll()
    {
        JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
        JsonObjectBuilder objectBuilder = Json.createObjectBuilder();
        for(ClientsApi.Client a : Service.getAll())
            arrayBuilder.add(objectBuilder.add("ID", a.ID).add("name", a.name).build());
        return arrayBuilder.build();
    }

    @GET
    @Path("getbyname/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getByName(@PathParam("name") String name)
    {
        ClientsApi.Client t = Service.get(name);
        return Json.createObjectBuilder().add("ID", t.ID).add("name", t.name).build();
    }

    @GET
    @Path("getbyid/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getByID(@PathParam("id") int id)
    {
        ClientsApi.Client t = Service.get(id);
        return Json.createObjectBuilder().add("ID", t.ID).add("name", t.name).build();
    }

    @GET
    @Path("add")
    @Produces(MediaType.TEXT_PLAIN)
    public String add(@QueryParam("name") String name)
    {
        Service.add(name);
        return "Success!";
    }

    @GET
    @Path("set")
    @Produces(MediaType.TEXT_PLAIN)
    public String set(@QueryParam("name") String name, @QueryParam("id") int id)
    {
        Service.set(id, name);
        return "Success!";
    }
}
