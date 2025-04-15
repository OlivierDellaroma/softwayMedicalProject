package softway.medical.model;


public class ResultPatient {

    Integer indexHealth = 0;
    String service = "";

    public ResultPatient() {
    }

    public ResultPatient(Integer indexHealth, String service) {
        this.indexHealth = indexHealth;
        this.service = service;
    }

    public Integer getIndexHealth() {
        return indexHealth;
    }

    public void setIndexHealth(Integer indexHealth) {
        this.indexHealth = indexHealth;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
}
