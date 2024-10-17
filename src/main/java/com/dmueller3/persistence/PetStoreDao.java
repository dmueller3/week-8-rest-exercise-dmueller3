package com.dmueller3.persistence;

import com.petstore.Order;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class PetStoreDao {

    Order getOrder() {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://petstore.swagger.io/v2/store/order/4");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        Order order = null;
        try {
            order = mapper.readValue(response, Order.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return order;
    }
}
