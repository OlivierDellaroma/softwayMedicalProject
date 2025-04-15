package softway.medical;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import softway.medical.common.Pathologie;
import softway.medical.model.ResultPatient;
import softway.medical.service.CalculService;


class CalculServiceTest {


    private CalculService service;

    private ResultPatient resultPatient1 = null;
    private ResultPatient resultPatient2 = null;
    private ResultPatient resultPatient3 = null;
    private  ResultPatient resultPatient4 = null;


    public CalculServiceTest(){
        service = new CalculService();
    }

    @BeforeEach
    void setUp(){
         resultPatient1 = new ResultPatient(33, Pathologie.Cardiologie.name());
         resultPatient2 = new ResultPatient(5,Pathologie.Traumatologie.name());
         resultPatient3 = new ResultPatient(45,Pathologie.Cardiologie.name()+" , "+Pathologie.Traumatologie.name());
         resultPatient4 = new ResultPatient(511,Pathologie.Inconnue.name());
    }

    @Test
    public void testServiceCardiologie() {

        Assertions.assertEquals(resultPatient1.getService(), service.calculateHealthIndex(33).getService());
    }

    @Test
    public void testServiceTraumatologie() {

        Assertions.assertEquals(resultPatient2.getService(), service.calculateHealthIndex(5).getService());

    }

    @Test
    public void testServiceCardioAndTrauma() {

        Assertions.assertEquals(resultPatient3.getService(), service.calculateHealthIndex(45).getService());
    }

    @Test
    public void testServiceInconnu() {

        Assertions.assertEquals(resultPatient4.getService(), service.calculateHealthIndex(11).getService());
    }

}