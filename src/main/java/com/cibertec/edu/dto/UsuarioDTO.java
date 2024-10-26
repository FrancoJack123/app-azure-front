package com.cibertec.edu.dto;

public class UsuarioDTO {
    private String codigoAlumno;
    private String password;
    private String nombreUsuario;
    private String apellidoPaterno;
    private String apellidoMaterno;

    public UsuarioDTO(String codigoAlumno, String password, String nombreUsuario, String apellidoPaterno, String apellidoMaterno) {
        this.codigoAlumno = codigoAlumno;
        this.password = password;
        this.nombreUsuario = nombreUsuario;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    public UsuarioDTO() {
    }

    public String getCodigoAlumno() {
        return codigoAlumno;
    }

    public String getPassword() {
        return password;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setCodigoAlumno(String codigoAlumno) {
        this.codigoAlumno = codigoAlumno;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
}
