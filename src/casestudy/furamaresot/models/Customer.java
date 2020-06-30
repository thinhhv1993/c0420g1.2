package casestudy.furamaresot.models;

public class Customer {
    private String id;
    private String nameCustomer ;
    private String birCustomer ;
    private String sexCustomer ;
    private String idCustomer ;
    private int phoneCustomer ;
    private String emailCustomer ;
    private String typeCustomer ;
    private String addressCustomer ;
    private Services servicesCustomer;

    public Customer(String id, String nameCustomer, String birCustomer, String sexCustomer, String idCustomer,
                    int phoneCustomer, String emailCustomer, String typeCustomer, String addressCustomer,
                    Services servicesCustomer){
        this.id = id;
        this.nameCustomer = nameCustomer;
        this.birCustomer = birCustomer;
        this.sexCustomer = sexCustomer;
        this.idCustomer = idCustomer;
        this.phoneCustomer = phoneCustomer;
        this.emailCustomer = emailCustomer;
        this.typeCustomer = typeCustomer;
        this.addressCustomer = addressCustomer;
        this.servicesCustomer = servicesCustomer;
    }

    public Customer() {
    }

    public Customer(String id, String name, String birth, String sex, String idcard, int phone, String email, String type, String add) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirCustomer() {
        return birCustomer;
    }

    public void setBirCustomer(String birCustomer) {
        this.birCustomer = birCustomer;
    }

    public String getSexCustomer() {
        return sexCustomer;
    }

    public void setSexCustomer(String sexCustomer) {
        this.sexCustomer = sexCustomer;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getPhoneCustomer() {
        return phoneCustomer;
    }

    public void setPhoneCustomer(int phoneCustomer) {
        this.phoneCustomer = phoneCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    public Services getServicesCustomer() {
        return servicesCustomer;
    }

    public void setServicesCustomer(Services servicesCustomer) {
        this.servicesCustomer = servicesCustomer;
    }

    public void showInfor(){
        System.out.println("Customer{" +
                "id = " + id + '\'' +
                ", name='" + nameCustomer + '\'' +
                ", birthday ='" + birCustomer + '\'' +
                ", sex ='" + sexCustomer + '\'' +
                ", id card ='" + idCustomer + '\'' +
                ", phone ='" + phoneCustomer + '\'' +
                ", email ='" + emailCustomer + '\'' +
                ", type ='" + typeCustomer + '\'' +
                ", address ='" + addressCustomer + '\'' +
                ", service ='" + servicesCustomer + '\''+'}');
    }


}
