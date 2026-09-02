package br.cantaruttim.sales_platform.user_service.model;

import br.cantaruttim.sales_platform.user_service.enums.COMPANY_TYPE;

public class Company {
    
    private String companyName;
    private String companyCNPJ;
    private String companyAddress;
    private String companyFederalUnion;
    private String companyStateRegistration;
    private String companyMunicipalRegistration;
    private String companyState;
    private COMPANY_TYPE companyType;
    private String companyCity;
    private String companyCNAE;
    private String companyPhone;
    private String companyEmail;

    public Company() {}

    public Company(String companyName, String companyCNPJ, String companyAddress, String companyFederalUnion, String companyStateRegistration, String companyMunicipalRegistration, String companyState, COMPANY_TYPE companyType, String companyCity, String companyCNAE, String companyPhone, String companyEmail) {
        this.companyName = companyName;
        this.companyCNPJ = companyCNPJ;
        this.companyAddress = companyAddress;
        this.companyFederalUnion = companyFederalUnion;
        this.companyStateRegistration = companyStateRegistration;
        this.companyMunicipalRegistration = companyMunicipalRegistration;
        this.companyState = companyState;
        this.companyType = companyType;
        this.companyCity = companyCity;
        this.companyCNAE = companyCNAE;
        this.companyPhone = companyPhone;
        this.companyEmail = companyEmail;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyCNPJ() {
        return companyCNPJ;
    }

    public void setCompanyCNPJ(String companyCNPJ) {
        this.companyCNPJ = companyCNPJ;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyFederalUnion() {
        return companyFederalUnion;
    }

    public void setCompanyFederalUnion(String companyFederalUnion) {
        this.companyFederalUnion = companyFederalUnion;
    }

    public String getCompanyStateRegistration() {
        return companyStateRegistration;
    }

    public void setCompanyStateRegistration(String companyStateRegistration) {
        this.companyStateRegistration = companyStateRegistration;
    }

    public String getCompanyMunicipalRegistration() {
        return companyMunicipalRegistration;
    }

    public void setCompanyMunicipalRegistration(String companyMunicipalRegistration) {
        this.companyMunicipalRegistration = companyMunicipalRegistration;
    }

    public String getCompanyState() {
        return companyState;
    }

    public void setCompanyState(String companyState) {
        this.companyState = companyState;
    }

    public COMPANY_TYPE getCompanyType() {
        return companyType;
    }

    public void setCompanyType(COMPANY_TYPE companyType) {
        this.companyType = companyType;
    }

    public String getCompanyCity() {
        return companyCity;
    }

    public void setCompanyCity(String companyCity) {
        this.companyCity = companyCity;
    }

    public String getCompanyCNAE() {
        return companyCNAE;
    }

    public void setCompanyCNAE(String companyCNAE) {
        this.companyCNAE = companyCNAE;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }    
}
