package models;

public class Event
{
    private String descripcion;
    private String email;

    public Event(String descripcion, String email)
    {
        this.descripcion = descripcion;
        this.email = email;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public String getEmail()
    {
        return email;
    }
}
