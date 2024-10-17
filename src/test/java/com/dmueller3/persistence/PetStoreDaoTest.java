package com.dmueller3.persistence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetStoreDaoTest {

    @Test
    void getPetId() {
        PetStoreDao petStoreDao = new PetStoreDao();
        assertEquals(5, petStoreDao.getOrder().getPetId());
    }
}