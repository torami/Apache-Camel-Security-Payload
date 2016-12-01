package de.bit.camel.security;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.test.junit4.CamelSpringJUnit4ClassRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

/**
 * 
 * @author Rami TORKHANI
 */
@RunWith(CamelSpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:de/camel-context.xml")
public class TestSig2 {
	@Produce(uri = "cxf:bean:SigInfoService")
	protected ProducerTemplate template;
	
    @Test
    public void testSIG1() throws Exception {
        String sig1 = template.requestBody(TestValues.EMP_ID_SIG2, String.class);

        assertNotNull("Sig may not be null", sig1);

        assertEquals(TestValues.COMPLETE_RESULT_SIG2, sig1.toString());
    }
}
