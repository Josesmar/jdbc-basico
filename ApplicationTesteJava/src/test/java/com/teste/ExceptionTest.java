package com.teste;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

public class ExceptionTest {

    @Test(expected = IndexOutOfBoundsException.class)
    public void empty(){
        List<String> lista = new ArrayList<String>();
        lista.add("Josesmar");

        lista.get(0);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldTestExceptionMessage() throws IndexOutOfBoundsException{
        List<Object> list = new ArrayList<Object>();

        thrown.expect(IndexOutOfBoundsException.class);
        thrown.expectMessage("array vazio");
        list.get(0);
    }

    @Test
    public void testExceptionMessage(){
        try {
            new ArrayList<Object>().get(0);
            fail("Esperado que IndexOutBoundExepction seja lançado");
        } catch (IndexOutOfBoundsException ex) {
            assertThat(ex.getMessage(), is("Index: 0, Size: 0"));

        }
    }
}
