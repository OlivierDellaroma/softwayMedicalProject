package softway.medical.service;

import org.springframework.stereotype.Service;
import softway.medical.model.ResultPatient;
import softway.medical.common.Pathologie;

@Service
public class CalculService {

    public ResultPatient calculateHealthIndex(int index) {

        ResultPatient resultPatient = new ResultPatient();
        if(index%3==0){
            resultPatient.setIndexHealth(index);
            resultPatient.setService(Pathologie.Cardiologie.name());
        }

        if(index%5==0){
            resultPatient.setIndexHealth(index);
            resultPatient.setService((!resultPatient.getService().isEmpty()?resultPatient.getService()+" , ":"")+Pathologie.Traumatologie.name());
        }
        if(resultPatient.getService().isEmpty()){
            resultPatient.setIndexHealth(index);
            resultPatient.setService(Pathologie.Inconnue.name());
        }

        return resultPatient;
    }
}
