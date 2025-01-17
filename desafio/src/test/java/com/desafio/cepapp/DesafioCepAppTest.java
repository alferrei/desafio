package com.desafio.cepapp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = DesafioCepApplication.class)
@AutoConfigureMockMvc
public class DesafioCepAppTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetCepSe() throws Exception {
        mockMvc.perform(get("/cep/01001-000"))
                .andExpect(status().isOk());
    }

    @Test
    public void testGetCepUberlandia() throws Exception {
        mockMvc.perform(get("/cep/03333-000"))
                .andExpect(status().isOk());
    }

}