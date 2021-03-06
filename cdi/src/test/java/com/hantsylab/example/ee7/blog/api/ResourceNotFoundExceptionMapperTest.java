package com.hantsylab.example.ee7.blog.api;

import com.hantsylab.example.ee7.blog.service.ResourceNotFoundException;
import javax.ws.rs.core.Response;

import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author hantsy
 */
public class ResourceNotFoundExceptionMapperTest {

    ResourceNotFoundExceptionMapper mapper;

    @Before
    public void setup() {
        mapper = new ResourceNotFoundExceptionMapper();
    }

    @After
    public void teardown() {
        mapper = null;
    }

    @Test
    public void testResourceNotFoundExceptionMapper() {
        Response res = mapper.toResponse(new ResourceNotFoundException("test"));
        assertEquals(res.getStatus(), Response.Status.NOT_FOUND.getStatusCode());
    }

}
