
package mx.com.portafolio.entities;

/**
 * Para registros de Niveles Escolare
 * @author Alejandro Téllez Aguilar
 */
public class SchoolLevel {
    
    //Atributos
       int idSchoolLevel;
    String SchoolName;
       int SchoolYearInicio;
       int SchoolYearFin;
    String SchoolState;
    String SchoolCountry;
       int idCertificate;
       int idDGeneral;
       
    //Métodos

    public SchoolLevel() {
    }

    public SchoolLevel(int idSchoolLevel, String SchoolName, int SchoolYearInicio, int SchoolYearFin, String SchoolState, String SchoolCountry, int idCertificate, int idDGeneral) {
        this.idSchoolLevel = idSchoolLevel;
        this.SchoolName = SchoolName;
        this.SchoolYearInicio = SchoolYearInicio;
        this.SchoolYearFin = SchoolYearFin;
        this.SchoolState = SchoolState;
        this.SchoolCountry = SchoolCountry;
        this.idCertificate = idCertificate;
        this.idDGeneral = idDGeneral;
    }
       
    // Geters and Seters

    public int getIdSchoolLevel() {
        return idSchoolLevel;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public int getSchoolYearInicio() {
        return SchoolYearInicio;
    }

    public int getSchoolYearFin() {
        return SchoolYearFin;
    }

    public String getSchoolState() {
        return SchoolState;
    }

    public String getSchoolCountry() {
        return SchoolCountry;
    }

    public int getIdCertificate() {
        return idCertificate;
    }

    public int getIdDGeneral() {
        return idDGeneral;
    }

    public void setIdSchoolLevel(int idSchoolLevel) {
        this.idSchoolLevel = idSchoolLevel;
    }

    public void setSchoolName(String SchoolName) {
        this.SchoolName = SchoolName;
    }

    public void setSchoolYearInicio(int SchoolYearInicio) {
        this.SchoolYearInicio = SchoolYearInicio;
    }

    public void setSchoolYearFin(int SchoolYearFin) {
        this.SchoolYearFin = SchoolYearFin;
    }

    public void setSchoolState(String SchoolState) {
        this.SchoolState = SchoolState;
    }

    public void setSchoolCountry(String SchoolCountry) {
        this.SchoolCountry = SchoolCountry;
    }

    public void setIdCertificate(int idCertificate) {
        this.idCertificate = idCertificate;
    }

    public void setIdDGeneral(int idDGeneral) {
        this.idDGeneral = idDGeneral;
    }
    
    
       
       
    
    
}
