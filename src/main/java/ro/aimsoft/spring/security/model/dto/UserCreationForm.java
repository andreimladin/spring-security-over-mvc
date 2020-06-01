package ro.aimsoft.spring.security.model.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserCreationForm {

    @NotBlank
    @Size(min=4, max=20)
    private String firstName;

    @NotBlank
    @Size(min=4, max=20)
    private String lastName;

    @Email
    @Size(min=8, max=30)
    private String email;

    @NotBlank
    @Size(min=8, max=20)
    private String password;

    @NotBlank
    @Size(min=8, max=20)
    private String retypePassword;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRetypePassword() {
        return retypePassword;
    }

    public void setRetypePassword(String retypePassword) {
        this.retypePassword = retypePassword;
    }
}
